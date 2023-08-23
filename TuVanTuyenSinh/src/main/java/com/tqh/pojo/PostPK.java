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
public class PostPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idPost")
    private int idPost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "users_idUsers")
    private int usersidUsers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "users_permission_idPermission")
    private int userspermissionidPermission;
    @Basic(optional = false)
    @NotNull
    @Column(name = "faculty_idFaculty")
    private int facultyidFaculty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "admission_idAdmission")
    private int admissionidAdmission;

    public PostPK() {
    }

    public PostPK(int idPost, int usersidUsers, int userspermissionidPermission, int facultyidFaculty, int admissionidAdmission) {
        this.idPost = idPost;
        this.usersidUsers = usersidUsers;
        this.userspermissionidPermission = userspermissionidPermission;
        this.facultyidFaculty = facultyidFaculty;
        this.admissionidAdmission = admissionidAdmission;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public int getUsersidUsers() {
        return usersidUsers;
    }

    public void setUsersidUsers(int usersidUsers) {
        this.usersidUsers = usersidUsers;
    }

    public int getUserspermissionidPermission() {
        return userspermissionidPermission;
    }

    public void setUserspermissionidPermission(int userspermissionidPermission) {
        this.userspermissionidPermission = userspermissionidPermission;
    }

    public int getFacultyidFaculty() {
        return facultyidFaculty;
    }

    public void setFacultyidFaculty(int facultyidFaculty) {
        this.facultyidFaculty = facultyidFaculty;
    }

    public int getAdmissionidAdmission() {
        return admissionidAdmission;
    }

    public void setAdmissionidAdmission(int admissionidAdmission) {
        this.admissionidAdmission = admissionidAdmission;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPost;
        hash += (int) usersidUsers;
        hash += (int) userspermissionidPermission;
        hash += (int) facultyidFaculty;
        hash += (int) admissionidAdmission;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostPK)) {
            return false;
        }
        PostPK other = (PostPK) object;
        if (this.idPost != other.idPost) {
            return false;
        }
        if (this.usersidUsers != other.usersidUsers) {
            return false;
        }
        if (this.userspermissionidPermission != other.userspermissionidPermission) {
            return false;
        }
        if (this.facultyidFaculty != other.facultyidFaculty) {
            return false;
        }
        if (this.admissionidAdmission != other.admissionidAdmission) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.pojo.PostPK[ idPost=" + idPost + ", usersidUsers=" + usersidUsers + ", userspermissionidPermission=" + userspermissionidPermission + ", facultyidFaculty=" + facultyidFaculty + ", admissionidAdmission=" + admissionidAdmission + " ]";
    }
    
}
