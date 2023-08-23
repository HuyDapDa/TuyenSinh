package com.tqh.pojo;

import com.tqh.pojo.CommentPK;
import com.tqh.pojo.Post;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-23T07:48:34")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, String> commentInfomation;
    public static volatile SingularAttribute<Comment, Post> post;
    public static volatile SingularAttribute<Comment, CommentPK> commentPK;

}