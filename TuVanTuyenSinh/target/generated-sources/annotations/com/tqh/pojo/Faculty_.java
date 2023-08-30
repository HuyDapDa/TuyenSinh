package com.tqh.pojo;

import com.tqh.pojo.Benmarks;
import com.tqh.pojo.Post;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-30T14:24:09")
@StaticMetamodel(Faculty.class)
public class Faculty_ { 

    public static volatile SingularAttribute<Faculty, Integer> idFaculty;
    public static volatile SingularAttribute<Faculty, String> website;
    public static volatile SingularAttribute<Faculty, String> introVideo;
    public static volatile CollectionAttribute<Faculty, Post> postCollection;
    public static volatile SingularAttribute<Faculty, Benmarks> benmarksidBenmarks;
    public static volatile SingularAttribute<Faculty, String> facultyName;

}