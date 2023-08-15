/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Admin
 */
@Embeddable
public class UsersPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idUsers")
    private int idUsers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "permission_idPermission")
    private int permissionidPermission;

    public UsersPK() {
    }

    public UsersPK(int idUsers, int permissionidPermission) {
        this.idUsers = idUsers;
        this.permissionidPermission = permissionidPermission;
    }

    public int getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    public int getPermissionidPermission() {
        return permissionidPermission;
    }

    public void setPermissionidPermission(int permissionidPermission) {
        this.permissionidPermission = permissionidPermission;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idUsers;
        hash += (int) permissionidPermission;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersPK)) {
            return false;
        }
        UsersPK other = (UsersPK) object;
        if (this.idUsers != other.idUsers) {
            return false;
        }
        if (this.permissionidPermission != other.permissionidPermission) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.pojo.UsersPK[ idUsers=" + idUsers + ", permissionidPermission=" + permissionidPermission + " ]";
    }
    
}
