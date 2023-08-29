package com.tqh.pojo;

import com.tqh.pojo.Post;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-29T20:18:47")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, Post> postidPost;
    public static volatile SingularAttribute<Comment, Integer> idComment;
    public static volatile SingularAttribute<Comment, Post> postadmissionidAdmission;
    public static volatile SingularAttribute<Comment, Post> postusersidUsers;
    public static volatile SingularAttribute<Comment, String> commentInformation;
    public static volatile SingularAttribute<Comment, Post> postfacultyidFaculty;
    public static volatile SingularAttribute<Comment, Post> postuserspermissionidPermission;

}