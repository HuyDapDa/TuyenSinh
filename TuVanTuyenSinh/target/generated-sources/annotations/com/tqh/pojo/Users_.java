package com.tqh.pojo;

import com.tqh.pojo.Permission;
import com.tqh.pojo.Post;
import com.tqh.pojo.UsersPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-23T07:48:34")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> password;
    public static volatile CollectionAttribute<Users, Post> postCollection;
    public static volatile SingularAttribute<Users, String> avata;
    public static volatile SingularAttribute<Users, String> loginName;
    public static volatile SingularAttribute<Users, UsersPK> usersPK;
    public static volatile SingularAttribute<Users, String> name;
    public static volatile SingularAttribute<Users, Permission> permission;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile SingularAttribute<Users, String> loaiUser;

}