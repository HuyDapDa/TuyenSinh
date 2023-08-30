package com.tqh.pojo;

import com.tqh.pojo.Permission;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-30T13:47:41")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> firstname;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, Integer> idUsers;
    public static volatile SingularAttribute<Users, String> avatar;
    public static volatile SingularAttribute<Users, Permission> permissionidPermission;
    public static volatile SingularAttribute<Users, String> userRole;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile SingularAttribute<Users, String> lastname;
    public static volatile SingularAttribute<Users, String> username;

}