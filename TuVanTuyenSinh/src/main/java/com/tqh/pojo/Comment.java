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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "comment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comment.findAll", query = "SELECT c FROM Comment c"),
    @NamedQuery(name = "Comment.findByIdComment", query = "SELECT c FROM Comment c WHERE c.idComment = :idComment")})
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idComment")
    private Integer idComment;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "commentInfomation")
    private String commentInfomation;
    @JoinTable(name = "post_has_comment", joinColumns = {
        @JoinColumn(name = "comment_idComment", referencedColumnName = "idComment")}, inverseJoinColumns = {
        @JoinColumn(name = "post_idPost", referencedColumnName = "idPost"),
        @JoinColumn(name = "post_users_idUsers", referencedColumnName = "users_idUsers"),
        @JoinColumn(name = "post_users_permission_idPermission", referencedColumnName = "users_permission_idPermission")})
    @ManyToMany
    private Collection<Post> postCollection;

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

    public String getCommentInfomation() {
        return commentInfomation;
    }

    public void setCommentInfomation(String commentInfomation) {
        this.commentInfomation = commentInfomation;
    }

    @XmlTransient
    public Collection<Post> getPostCollection() {
        return postCollection;
    }

    public void setPostCollection(Collection<Post> postCollection) {
        this.postCollection = postCollection;
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
