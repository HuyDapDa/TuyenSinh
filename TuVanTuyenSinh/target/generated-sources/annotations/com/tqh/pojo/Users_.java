package com.tqh.pojo;

import com.tqh.pojo.Banner;
import com.tqh.pojo.Comment;
import com.tqh.pojo.Livestreams;
import com.tqh.pojo.Post;
import com.tqh.pojo.RoleUser;
import com.tqh.pojo.School;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-09-21T19:11:33")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> lastName;
    public static volatile SingularAttribute<Users, RoleUser> roleUserIdRoleuser;
    public static volatile SingularAttribute<Users, Boolean> active;
    public static volatile SingularAttribute<Users, String> avatar;
    public static volatile SetAttribute<Users, Post> postSet;
    public static volatile SingularAttribute<Users, String> firstName;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, Integer> idusers;
    public static volatile SetAttribute<Users, Comment> commentSet;
    public static volatile SetAttribute<Users, Livestreams> livestreamsSet;
    public static volatile SetAttribute<Users, School> schoolSet;
    public static volatile SetAttribute<Users, Banner> bannerSet;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile SingularAttribute<Users, String> username;

}