package com.tqh.pojo;

import com.tqh.pojo.Post;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-09-01T15:16:34")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, String> commentinformation;
    public static volatile SingularAttribute<Comment, Post> postIdpost;
    public static volatile SingularAttribute<Comment, Integer> idcomment;
    public static volatile SingularAttribute<Comment, Post> postAdmissionIdadmission;
    public static volatile SingularAttribute<Comment, Post> postUsersIdusers;
    public static volatile SingularAttribute<Comment, Post> postFacultyIdfaculty;

}