package com.tqh.pojo;

import com.tqh.pojo.Admission;
import com.tqh.pojo.Comment;
import com.tqh.pojo.Faculty;
import com.tqh.pojo.PostPK;
import com.tqh.pojo.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-16T13:42:37")
@StaticMetamodel(Post.class)
public class Post_ { 

    public static volatile SingularAttribute<Post, String> postType;
    public static volatile CollectionAttribute<Post, Comment> commentCollection;
    public static volatile SingularAttribute<Post, PostPK> postPK;
    public static volatile SingularAttribute<Post, Admission> admission;
    public static volatile SingularAttribute<Post, String> postInfomation;
    public static volatile SingularAttribute<Post, Users> users;
    public static volatile SingularAttribute<Post, Faculty> faculty;

}