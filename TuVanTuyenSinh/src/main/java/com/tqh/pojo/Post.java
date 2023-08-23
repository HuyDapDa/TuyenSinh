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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
    @NamedQuery(name = "Post.findByIdPost", query = "SELECT p FROM Post p WHERE p.postPK.idPost = :idPost"),
    @NamedQuery(name = "Post.findByUsersidUsers", query = "SELECT p FROM Post p WHERE p.postPK.usersidUsers = :usersidUsers"),
    @NamedQuery(name = "Post.findByUserspermissionidPermission", query = "SELECT p FROM Post p WHERE p.postPK.userspermissionidPermission = :userspermissionidPermission"),
    @NamedQuery(name = "Post.findByFacultyidFaculty", query = "SELECT p FROM Post p WHERE p.postPK.facultyidFaculty = :facultyidFaculty"),
    @NamedQuery(name = "Post.findByAdmissionidAdmission", query = "SELECT p FROM Post p WHERE p.postPK.admissionidAdmission = :admissionidAdmission")})
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PostPK postPK;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "postInfomation")
    private String postInfomation;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "postType")
    private String postType;
    @JoinColumn(name = "admission_idAdmission", referencedColumnName = "idAdmission", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Admission admission;
    @JoinColumn(name = "faculty_idFaculty", referencedColumnName = "idFaculty", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Faculty faculty;
    @JoinColumns({
        @JoinColumn(name = "users_idUsers", referencedColumnName = "idUsers", insertable = false, updatable = false),
        @JoinColumn(name = "users_permission_idPermission", referencedColumnName = "permission_idPermission", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Users users;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private Collection<Comment> commentCollection;

    public Post() {
    }

    public Post(PostPK postPK) {
        this.postPK = postPK;
    }

    public Post(PostPK postPK, String postInfomation) {
        this.postPK = postPK;
        this.postInfomation = postInfomation;
    }

    public Post(int idPost, int usersidUsers, int userspermissionidPermission, int facultyidFaculty, int admissionidAdmission) {
        this.postPK = new PostPK(idPost, usersidUsers, userspermissionidPermission, facultyidFaculty, admissionidAdmission);
    }

    public PostPK getPostPK() {
        return postPK;
    }

    public void setPostPK(PostPK postPK) {
        this.postPK = postPK;
    }

    public String getPostInfomation() {
        return postInfomation;
    }

    public void setPostInfomation(String postInfomation) {
        this.postInfomation = postInfomation;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Admission getAdmission() {
        return admission;
    }

    public void setAdmission(Admission admission) {
        this.admission = admission;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @XmlTransient
    public Collection<Comment> getCommentCollection() {
        return commentCollection;
    }

    public void setCommentCollection(Collection<Comment> commentCollection) {
        this.commentCollection = commentCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (postPK != null ? postPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Post)) {
            return false;
        }
        Post other = (Post) object;
        if ((this.postPK == null && other.postPK != null) || (this.postPK != null && !this.postPK.equals(other.postPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.pojo.Post[ postPK=" + postPK + " ]";
    }
    
}
