package com.tqh.pojo;

import com.tqh.pojo.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-10-14T17:08:38")
@StaticMetamodel(School.class)
public class School_ { 

    public static volatile SingularAttribute<School, Integer> idschool;
    public static volatile SingularAttribute<School, String> description;
    public static volatile SingularAttribute<School, String> imageSchool;
    public static volatile SingularAttribute<School, Users> usersIdusers;
    public static volatile SingularAttribute<School, String> tieuDe;

}