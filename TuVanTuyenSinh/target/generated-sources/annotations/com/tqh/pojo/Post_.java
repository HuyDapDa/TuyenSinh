package com.tqh.pojo;

import com.tqh.pojo.Admission;
import com.tqh.pojo.Comment;
import com.tqh.pojo.Faculty;
import com.tqh.pojo.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-30T13:47:41")
@StaticMetamodel(Post.class)
public class Post_ { 

    public static volatile SingularAttribute<Post, String> postType;
    public static volatile SingularAttribute<Post, Users> userspermissionidPermission;
    public static volatile CollectionAttribute<Post, Comment> commentCollection;
    public static volatile SingularAttribute<Post, Faculty> facultyidFaculty;
    public static volatile SingularAttribute<Post, Users> usersidUsers;
    public static volatile CollectionAttribute<Post, Comment> commentCollection4;
    public static volatile CollectionAttribute<Post, Comment> commentCollection3;
    public static volatile SingularAttribute<Post, Admission> admissionidAdmission;
    public static volatile CollectionAttribute<Post, Comment> commentCollection2;
    public static volatile CollectionAttribute<Post, Comment> commentCollection1;
    public static volatile SingularAttribute<Post, Integer> idPost;
    public static volatile SingularAttribute<Post, String> postInformation;

}