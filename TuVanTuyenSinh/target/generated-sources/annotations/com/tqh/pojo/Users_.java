package com.tqh.pojo;

import com.tqh.pojo.Post;
import com.tqh.pojo.RoleUser;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-09-01T15:16:34")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> lastName;
    public static volatile SingularAttribute<Users, String> firstName;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, Integer> idusers;
    public static volatile SingularAttribute<Users, RoleUser> roleUserIdRoleuser;
    public static volatile SingularAttribute<Users, Integer> bannerIdbanner;
    public static volatile SingularAttribute<Users, String> avatar;
    public static volatile SetAttribute<Users, Post> postSet;
    public static volatile SingularAttribute<Users, String> userRole;
    public static volatile SingularAttribute<Users, Integer> schoolIdschool;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile SingularAttribute<Users, String> username;

}