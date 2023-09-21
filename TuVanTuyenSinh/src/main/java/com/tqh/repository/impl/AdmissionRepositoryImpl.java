/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.repository.impl;

import com.tqh.pojo.Admission;
import com.tqh.repository.AdmissionRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Admin
 */
@Repository
@Transactional
public class AdmissionRepositoryImpl implements AdmissionRepository{
    @Autowired
    private LocalSessionFactoryBean factory;
    
    @Override
    public List<Admission> getAdmissions(Map<String, String> params){
        Session session = this.factory.getObject().getCurrentSession();
        CriteriaBuilder b = session.getCriteriaBuilder();
        CriteriaQuery<Admission> q = b.createQuery(Admission.class);
        Root root = q.from(Admission.class);
        q.select(root);

        if (params != null) {
            List<Predicate> predicates = new ArrayList<>();

            String kw = params.get("kw");
            if (kw != null && !kw.isEmpty()) {
                predicates.add(b.like(root.get("typeoftraining"), String.format("%%%s%%", kw)));
            }

//            String fromPrice = params.get("fromPrice");
//            if (fromPrice != null && !fromPrice.isEmpty()) {
//                predicates.add(b.greaterThanOrEqualTo(root.get("price"), Double.parseDouble(fromPrice)));
//            }
//
//            String toPrice = params.get("toPrice");
//            if (toPrice != null && !toPrice.isEmpty()) {
//                predicates.add(b.lessThanOrEqualTo(root.get("price"), Double.parseDouble(toPrice)));
//            }
//
//            String cateId = params.get("cateId");
//            if (cateId != null && !cateId.isEmpty()) {
//                predicates.add(b.equal(root.get("categoryId"), Integer.parseInt(cateId)));
//            }

            q.where(predicates.toArray(Predicate[]::new));
        }

        q.orderBy(b.desc(root.get("idadmission")));
        Query query = session.createQuery(q);
        return query.getResultList();
    }

    @Override
    public Admission getAdmissionById(int id) {
        Session s = this.factory.getObject().getCurrentSession();
        return s.get(Admission.class, id);
    }
    
}
