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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "post")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Post.findAll", query = "SELECT p FROM Post p"),
    @NamedQuery(name = "Post.findByIdPost", query = "SELECT p FROM Post p WHERE p.idPost = :idPost")})
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPost")
    private Integer idPost;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "postInformation")
    private String postInformation;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "postType")
    private String postType;
    @JoinColumn(name = "admission_idAdmission", referencedColumnName = "idAdmission")
    @ManyToOne(optional = false)
    private Admission admissionidAdmission;
    @JoinColumn(name = "faculty_idFaculty", referencedColumnName = "idFaculty")
    @ManyToOne(optional = false)
    private Faculty facultyidFaculty;
    @JoinColumn(name = "users_permission_idPermission", referencedColumnName = "permission_idPermission")
    @ManyToOne(optional = false)
    private Users userspermissionidPermission;
    @JoinColumn(name = "users_idUsers", referencedColumnName = "idUsers")
    @ManyToOne(optional = false)
    private Users usersidUsers;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postfacultyidFaculty")
    private Collection<Comment> commentCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postidPost")
    private Collection<Comment> commentCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postusersidUsers")
    private Collection<Comment> commentCollection2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postuserspermissionidPermission")
    private Collection<Comment> commentCollection3;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postadmissionidAdmission")
    private Collection<Comment> commentCollection4;

    public Post() {
    }

    public Post(Integer idPost) {
        this.idPost = idPost;
    }

    public Post(Integer idPost, String postInformation) {
        this.idPost = idPost;
        this.postInformation = postInformation;
    }

    public Integer getIdPost() {
        return idPost;
    }

    public void setIdPost(Integer idPost) {
        this.idPost = idPost;
    }

    public String getPostInformation() {
        return postInformation;
    }

    public void setPostInformation(String postInformation) {
        this.postInformation = postInformation;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Admission getAdmissionidAdmission() {
        return admissionidAdmission;
    }

    public void setAdmissionidAdmission(Admission admissionidAdmission) {
        this.admissionidAdmission = admissionidAdmission;
    }

    public Faculty getFacultyidFaculty() {
        return facultyidFaculty;
    }

    public void setFacultyidFaculty(Faculty facultyidFaculty) {
        this.facultyidFaculty = facultyidFaculty;
    }

    public Users getUserspermissionidPermission() {
        return userspermissionidPermission;
    }

    public void setUserspermissionidPermission(Users userspermissionidPermission) {
        this.userspermissionidPermission = userspermissionidPermission;
    }

    public Users getUsersidUsers() {
        return usersidUsers;
    }

    public void setUsersidUsers(Users usersidUsers) {
        this.usersidUsers = usersidUsers;
    }

    @XmlTransient
    public Collection<Comment> getCommentCollection() {
        return commentCollection;
    }

    public void setCommentCollection(Collection<Comment> commentCollection) {
        this.commentCollection = commentCollection;
    }

    @XmlTransient
    public Collection<Comment> getCommentCollection1() {
        return commentCollection1;
    }

    public void setCommentCollection1(Collection<Comment> commentCollection1) {
        this.commentCollection1 = commentCollection1;
    }

    @XmlTransient
    public Collection<Comment> getCommentCollection2() {
        return commentCollection2;
    }

    public void setCommentCollection2(Collection<Comment> commentCollection2) {
        this.commentCollection2 = commentCollection2;
    }

    @XmlTransient
    public Collection<Comment> getCommentCollection3() {
        return commentCollection3;
    }

    public void setCommentCollection3(Collection<Comment> commentCollection3) {
        this.commentCollection3 = commentCollection3;
    }

    @XmlTransient
    public Collection<Comment> getCommentCollection4() {
        return commentCollection4;
    }

    public void setCommentCollection4(Collection<Comment> commentCollection4) {
        this.commentCollection4 = commentCollection4;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPost != null ? idPost.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Post)) {
            return false;
        }
        Post other = (Post) object;
        if ((this.idPost == null && other.idPost != null) || (this.idPost != null && !this.idPost.equals(other.idPost))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.pojo.Post[ idPost=" + idPost + " ]";
    }
    
}
