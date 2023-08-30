package com.tqh.pojo;

import com.tqh.pojo.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-30T14:24:09")
@StaticMetamodel(Permission.class)
public class Permission_ { 

    public static volatile SingularAttribute<Permission, Integer> idPermission;
    public static volatile CollectionAttribute<Permission, Users> usersCollection;
    public static volatile SingularAttribute<Permission, String> permissionName;

}