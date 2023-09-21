package com.tqh.pojo;

import com.tqh.pojo.Majors;
import com.tqh.pojo.Post;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-09-21T19:11:33")
@StaticMetamodel(Faculty.class)
public class Faculty_ { 

    public static volatile SingularAttribute<Faculty, String> introvideo;
    public static volatile SingularAttribute<Faculty, String> moTaCTDT;
    public static volatile SingularAttribute<Faculty, String> website;
    public static volatile SingularAttribute<Faculty, Integer> hocPhi;
    public static volatile SetAttribute<Faculty, Majors> majorsSet;
    public static volatile SingularAttribute<Faculty, Integer> idfaculty;
    public static volatile SingularAttribute<Faculty, String> facultyname;
    public static volatile SingularAttribute<Faculty, String> gioiThieu;
    public static volatile SetAttribute<Faculty, Post> postSet;

}