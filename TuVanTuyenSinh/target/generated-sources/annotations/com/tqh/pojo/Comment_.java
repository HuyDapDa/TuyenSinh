package com.tqh.pojo;

import com.tqh.pojo.Post;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-16T13:42:37")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, Integer> idComment;
    public static volatile SingularAttribute<Comment, String> commentInfomation;
    public static volatile CollectionAttribute<Comment, Post> postCollection;

}