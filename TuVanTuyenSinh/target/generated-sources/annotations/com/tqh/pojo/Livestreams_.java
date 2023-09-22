package com.tqh.pojo;

import com.tqh.pojo.Comment;
import com.tqh.pojo.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-09-22T18:34:39")
@StaticMetamodel(Livestreams.class)
public class Livestreams_ { 

    public static volatile SingularAttribute<Livestreams, String> livestreaminfomation;
    public static volatile SingularAttribute<Livestreams, Date> createdDate;
    public static volatile SingularAttribute<Livestreams, String> linkstream;
    public static volatile SetAttribute<Livestreams, Comment> commentSet;
    public static volatile SingularAttribute<Livestreams, Date> startTime;
    public static volatile SingularAttribute<Livestreams, Date> endTime;
    public static volatile SingularAttribute<Livestreams, String> title;
    public static volatile SingularAttribute<Livestreams, Users> usersIdusers;
    public static volatile SingularAttribute<Livestreams, String> picture;
    public static volatile SingularAttribute<Livestreams, Integer> idlivestreams;

}