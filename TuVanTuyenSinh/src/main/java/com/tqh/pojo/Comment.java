/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
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
    @NamedQuery(name = "Comment.findByIdComment", query = "SELECT c FROM Comment c WHERE c.commentPK.idComment = :idComment"),
    @NamedQuery(name = "Comment.findByPostidPost", query = "SELECT c FROM Comment c WHERE c.commentPK.postidPost = :postidPost"),
    @NamedQuery(name = "Comment.findByPostusersidUsers", query = "SELECT c FROM Comment c WHERE c.commentPK.postusersidUsers = :postusersidUsers"),
    @NamedQuery(name = "Comment.findByPostuserspermissionidPermission", query = "SELECT c FROM Comment c WHERE c.commentPK.postuserspermissionidPermission = :postuserspermissionidPermission"),
    @NamedQuery(name = "Comment.findByPostfacultyidFaculty", query = "SELECT c FROM Comment c WHERE c.commentPK.postfacultyidFaculty = :postfacultyidFaculty"),
    @NamedQuery(name = "Comment.findByPostadmissionidAdmission", query = "SELECT c FROM Comment c WHERE c.commentPK.postadmissionidAdmission = :postadmissionidAdmission")})
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CommentPK commentPK;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "commentInfomation")
    private String commentInfomation;
    @JoinColumns({
        @JoinColumn(name = "post_idPost", referencedColumnName = "idPost", insertable = false, updatable = false),
        @JoinColumn(name = "post_users_idUsers", referencedColumnName = "users_idUsers", insertable = false, updatable = false),
        @JoinColumn(name = "post_users_permission_idPermission", referencedColumnName = "users_permission_idPermission", insertable = false, updatable = false),
        @JoinColumn(name = "post_faculty_idFaculty", referencedColumnName = "faculty_idFaculty", insertable = false, updatable = false),
        @JoinColumn(name = "post_admission_idAdmission", referencedColumnName = "admission_idAdmission", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Post post;

    public Comment() {
    }

    public Comment(CommentPK commentPK) {
        this.commentPK = commentPK;
    }

    public Comment(int idComment, int postidPost, int postusersidUsers, int postuserspermissionidPermission, int postfacultyidFaculty, int postadmissionidAdmission) {
        this.commentPK = new CommentPK(idComment, postidPost, postusersidUsers, postuserspermissionidPermission, postfacultyidFaculty, postadmissionidAdmission);
    }

    public CommentPK getCommentPK() {
        return commentPK;
    }

    public void setCommentPK(CommentPK commentPK) {
        this.commentPK = commentPK;
    }

    public String getCommentInfomation() {
        return commentInfomation;
    }

    public void setCommentInfomation(String commentInfomation) {
        this.commentInfomation = commentInfomation;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (commentPK != null ? commentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comment)) {
            return false;
        }
        Comment other = (Comment) object;
        if ((this.commentPK == null && other.commentPK != null) || (this.commentPK != null && !this.commentPK.equals(other.commentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.pojo.Comment[ commentPK=" + commentPK + " ]";
    }
    
}
