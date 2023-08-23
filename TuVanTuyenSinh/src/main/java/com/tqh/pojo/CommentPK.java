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
public class CommentPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idComment")
    private int idComment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "post_idPost")
    private int postidPost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "post_users_idUsers")
    private int postusersidUsers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "post_users_permission_idPermission")
    private int postuserspermissionidPermission;
    @Basic(optional = false)
    @NotNull
    @Column(name = "post_faculty_idFaculty")
    private int postfacultyidFaculty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "post_admission_idAdmission")
    private int postadmissionidAdmission;

    public CommentPK() {
    }

    public CommentPK(int idComment, int postidPost, int postusersidUsers, int postuserspermissionidPermission, int postfacultyidFaculty, int postadmissionidAdmission) {
        this.idComment = idComment;
        this.postidPost = postidPost;
        this.postusersidUsers = postusersidUsers;
        this.postuserspermissionidPermission = postuserspermissionidPermission;
        this.postfacultyidFaculty = postfacultyidFaculty;
        this.postadmissionidAdmission = postadmissionidAdmission;
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public int getPostidPost() {
        return postidPost;
    }

    public void setPostidPost(int postidPost) {
        this.postidPost = postidPost;
    }

    public int getPostusersidUsers() {
        return postusersidUsers;
    }

    public void setPostusersidUsers(int postusersidUsers) {
        this.postusersidUsers = postusersidUsers;
    }

    public int getPostuserspermissionidPermission() {
        return postuserspermissionidPermission;
    }

    public void setPostuserspermissionidPermission(int postuserspermissionidPermission) {
        this.postuserspermissionidPermission = postuserspermissionidPermission;
    }

    public int getPostfacultyidFaculty() {
        return postfacultyidFaculty;
    }

    public void setPostfacultyidFaculty(int postfacultyidFaculty) {
        this.postfacultyidFaculty = postfacultyidFaculty;
    }

    public int getPostadmissionidAdmission() {
        return postadmissionidAdmission;
    }

    public void setPostadmissionidAdmission(int postadmissionidAdmission) {
        this.postadmissionidAdmission = postadmissionidAdmission;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idComment;
        hash += (int) postidPost;
        hash += (int) postusersidUsers;
        hash += (int) postuserspermissionidPermission;
        hash += (int) postfacultyidFaculty;
        hash += (int) postadmissionidAdmission;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommentPK)) {
            return false;
        }
        CommentPK other = (CommentPK) object;
        if (this.idComment != other.idComment) {
            return false;
        }
        if (this.postidPost != other.postidPost) {
            return false;
        }
        if (this.postusersidUsers != other.postusersidUsers) {
            return false;
        }
        if (this.postuserspermissionidPermission != other.postuserspermissionidPermission) {
            return false;
        }
        if (this.postfacultyidFaculty != other.postfacultyidFaculty) {
            return false;
        }
        if (this.postadmissionidAdmission != other.postadmissionidAdmission) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.pojo.CommentPK[ idComment=" + idComment + ", postidPost=" + postidPost + ", postusersidUsers=" + postusersidUsers + ", postuserspermissionidPermission=" + postuserspermissionidPermission + ", postfacultyidFaculty=" + postfacultyidFaculty + ", postadmissionidAdmission=" + postadmissionidAdmission + " ]";
    }
    
}
