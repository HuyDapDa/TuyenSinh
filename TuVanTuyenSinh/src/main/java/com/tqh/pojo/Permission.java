/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.pojo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "permission")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permission.findAll", query = "SELECT p FROM Permission p"),
    @NamedQuery(name = "Permission.findByIdPermission", query = "SELECT p FROM Permission p WHERE p.idPermission = :idPermission"),
    @NamedQuery(name = "Permission.findByPermissionName", query = "SELECT p FROM Permission p WHERE p.permissionName = :permissionName")})
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPermission")
    private Integer idPermission;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "PermissionName")
    private String permissionName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permission")
    private Collection<Users> usersCollection;

    public Permission() {
    }

    public Permission(Integer idPermission) {
        this.idPermission = idPermission;
    }

    public Permission(Integer idPermission, String permissionName) {
        this.idPermission = idPermission;
        this.permissionName = permissionName;
    }

    public Integer getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(Integer idPermission) {
        this.idPermission = idPermission;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    @XmlTransient
    public Collection<Users> getUsersCollection() {
        return usersCollection;
    }

    public void setUsersCollection(Collection<Users> usersCollection) {
        this.usersCollection = usersCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPermission != null ? idPermission.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permission)) {
            return false;
        }
        Permission other = (Permission) object;
        if ((this.idPermission == null && other.idPermission != null) || (this.idPermission != null && !this.idPermission.equals(other.idPermission))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.pojo.Permission[ idPermission=" + idPermission + " ]";
    }
    
}
