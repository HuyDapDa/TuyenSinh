package com.tqh.pojo;

import com.tqh.pojo.Post;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-16T13:42:37")
@StaticMetamodel(Admission.class)
public class Admission_ { 

    public static volatile CollectionAttribute<Admission, Post> postCollection;
    public static volatile SingularAttribute<Admission, String> typeOfTraning;
    public static volatile SingularAttribute<Admission, Integer> idAdmission;

}