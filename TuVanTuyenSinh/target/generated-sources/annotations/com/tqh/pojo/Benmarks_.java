package com.tqh.pojo;

import com.tqh.pojo.Faculty;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-09-01T15:16:34")
@StaticMetamodel(Benmarks.class)
public class Benmarks_ { 

    public static volatile SingularAttribute<Benmarks, Integer> idbenmarks;
    public static volatile SingularAttribute<Benmarks, Double> diemdgnl;
    public static volatile SingularAttribute<Benmarks, String> year;
    public static volatile SingularAttribute<Benmarks, Double> diemthpt;
    public static volatile SingularAttribute<Benmarks, Double> diemhocba;
    public static volatile SetAttribute<Benmarks, Faculty> facultySet;

}