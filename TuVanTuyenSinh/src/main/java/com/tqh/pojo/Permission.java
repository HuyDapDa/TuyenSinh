/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.pojo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
    @NamedQuery(name = "Permission.findByIdpermission", query = "SELECT p FROM Permission p WHERE p.idpermission = :idpermission"),
    @NamedQuery(name = "Permission.findByPermissionname", query = "SELECT p FROM Permission p WHERE p.permissionname = :permissionname")})
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpermission")
    private Integer idpermission;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "permissionname")
    private String permissionname;
    @OneToMany(mappedBy = "permissionIdpermission")
    private Collection<Users> usersCollection;

    public Permission() {
    }

    public Permission(Integer idpermission) {
        this.idpermission = idpermission;
    }

    public Permission(Integer idpermission, String permissionname) {
        this.idpermission = idpermission;
        this.permissionname = permissionname;
    }

    public Integer getIdpermission() {
        return idpermission;
    }

    public void setIdpermission(Integer idpermission) {
        this.idpermission = idpermission;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
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
        hash += (idpermission != null ? idpermission.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permission)) {
            return false;
        }
        Permission other = (Permission) object;
        if ((this.idpermission == null && other.idpermission != null) || (this.idpermission != null && !this.idpermission.equals(other.idpermission))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.pojo.Permission[ idpermission=" + idpermission + " ]";
    }
    
}
