package com.tqh.pojo;

import com.tqh.pojo.Faculty;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-30T14:57:43")
@StaticMetamodel(Benmarks.class)
public class Benmarks_ { 

    public static volatile SingularAttribute<Benmarks, Integer> idbenmarks;
    public static volatile SingularAttribute<Benmarks, Double> diemdgnl;
    public static volatile CollectionAttribute<Benmarks, Faculty> facultyCollection;
    public static volatile SingularAttribute<Benmarks, String> year;
    public static volatile SingularAttribute<Benmarks, Double> diemthpt;
    public static volatile SingularAttribute<Benmarks, Double> diemhocba;
    public static volatile SingularAttribute<Benmarks, Integer> facultyidFaculty;

}