package com.tqh.pojo;

import com.tqh.pojo.Benmarks;
import com.tqh.pojo.Faculty;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-09-22T18:34:39")
@StaticMetamodel(Majors.class)
public class Majors_ { 

    public static volatile SingularAttribute<Majors, Faculty> facultyIdfaculty;
    public static volatile SingularAttribute<Majors, Integer> idmajors;
    public static volatile SingularAttribute<Majors, String> majorname;
    public static volatile SetAttribute<Majors, Benmarks> benmarksSet;

}