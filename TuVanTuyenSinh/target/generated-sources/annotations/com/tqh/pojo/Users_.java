package com.tqh.pojo;

import com.tqh.pojo.Permission;
import com.tqh.pojo.Post;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-28T12:38:31")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> password;
    public static volatile CollectionAttribute<Users, Post> postCollection;
    public static volatile SingularAttribute<Users, String> name;
    public static volatile SingularAttribute<Users, Integer> idUsers;
    public static volatile SingularAttribute<Users, String> avatar;
    public static volatile SingularAttribute<Users, Permission> permissionidPermission;
    public static volatile SingularAttribute<Users, String> userRole;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile CollectionAttribute<Users, Post> postCollection1;
    public static volatile SingularAttribute<Users, String> username;

}