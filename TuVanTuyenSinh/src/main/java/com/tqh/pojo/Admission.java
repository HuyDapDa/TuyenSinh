/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.pojo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "admission")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admission.findAll", query = "SELECT a FROM Admission a"),
    @NamedQuery(name = "Admission.findByIdAdmission", query = "SELECT a FROM Admission a WHERE a.idAdmission = :idAdmission"),
    @NamedQuery(name = "Admission.findByTypeOfTraining", query = "SELECT a FROM Admission a WHERE a.typeOfTraining = :typeOfTraining")})
public class Admission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAdmission")
    private Integer idAdmission;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "typeOfTraining")
    private String typeOfTraining;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "admissionidAdmission")
    private Collection<Post> postCollection;

    public Admission() {
    }

    public Admission(Integer idAdmission) {
        this.idAdmission = idAdmission;
    }

    public Admission(Integer idAdmission, String typeOfTraining) {
        this.idAdmission = idAdmission;
        this.typeOfTraining = typeOfTraining;
    }

    public Integer getIdAdmission() {
        return idAdmission;
    }

    public void setIdAdmission(Integer idAdmission) {
        this.idAdmission = idAdmission;
    }

    public String getTypeOfTraining() {
        return typeOfTraining;
    }

    public void setTypeOfTraining(String typeOfTraining) {
        this.typeOfTraining = typeOfTraining;
    }

    @XmlTransient
    public Collection<Post> getPostCollection() {
        return postCollection;
    }

    public void setPostCollection(Collection<Post> postCollection) {
        this.postCollection = postCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdmission != null ? idAdmission.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admission)) {
            return false;
        }
        Admission other = (Admission) object;
        if ((this.idAdmission == null && other.idAdmission != null) || (this.idAdmission != null && !this.idAdmission.equals(other.idAdmission))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.pojo.Admission[ idAdmission=" + idAdmission + " ]";
    }
    
}
