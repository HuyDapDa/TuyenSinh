/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "comment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comment.findAll", query = "SELECT c FROM Comment c"),
    @NamedQuery(name = "Comment.findByIdComment", query = "SELECT c FROM Comment c WHERE c.idComment = :idComment"),
    @NamedQuery(name = "Comment.findByCommentInformation", query = "SELECT c FROM Comment c WHERE c.commentInformation = :commentInformation")})
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idComment")
    private Integer idComment;
    @Size(max = 45)
    @Column(name = "commentInformation")
    private String commentInformation;
    @JoinColumn(name = "post_faculty_idFaculty", referencedColumnName = "faculty_idFaculty")
    @ManyToOne(optional = false)
    private Post postfacultyidFaculty;
    @JoinColumn(name = "post_idPost", referencedColumnName = "idPost")
    @ManyToOne(optional = false)
    private Post postidPost;
    @JoinColumn(name = "post_users_idUsers", referencedColumnName = "users_idUsers")
    @ManyToOne(optional = false)
    private Post postusersidUsers;
    @JoinColumn(name = "post_users_permission_idPermission", referencedColumnName = "users_permission_idPermission")
    @ManyToOne(optional = false)
    private Post postuserspermissionidPermission;
    @JoinColumn(name = "post_admission_idAdmission", referencedColumnName = "admission_idAdmission")
    @ManyToOne(optional = false)
    private Post postadmissionidAdmission;

    public Comment() {
    }

    public Comment(Integer idComment) {
        this.idComment = idComment;
    }

    public Integer getIdComment() {
        return idComment;
    }

    public void setIdComment(Integer idComment) {
        this.idComment = idComment;
    }

    public String getCommentInformation() {
        return commentInformation;
    }

    public void setCommentInformation(String commentInformation) {
        this.commentInformation = commentInformation;
    }

    public Post getPostfacultyidFaculty() {
        return postfacultyidFaculty;
    }

    public void setPostfacultyidFaculty(Post postfacultyidFaculty) {
        this.postfacultyidFaculty = postfacultyidFaculty;
    }

    public Post getPostidPost() {
        return postidPost;
    }

    public void setPostidPost(Post postidPost) {
        this.postidPost = postidPost;
    }

    public Post getPostusersidUsers() {
        return postusersidUsers;
    }

    public void setPostusersidUsers(Post postusersidUsers) {
        this.postusersidUsers = postusersidUsers;
    }

    public Post getPostuserspermissionidPermission() {
        return postuserspermissionidPermission;
    }

    public void setPostuserspermissionidPermission(Post postuserspermissionidPermission) {
        this.postuserspermissionidPermission = postuserspermissionidPermission;
    }

    public Post getPostadmissionidAdmission() {
        return postadmissionidAdmission;
    }

    public void setPostadmissionidAdmission(Post postadmissionidAdmission) {
        this.postadmissionidAdmission = postadmissionidAdmission;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComment != null ? idComment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comment)) {
            return false;
        }
        Comment other = (Comment) object;
        if ((this.idComment == null && other.idComment != null) || (this.idComment != null && !this.idComment.equals(other.idComment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.pojo.Comment[ idComment=" + idComment + " ]";
    }
    
}
