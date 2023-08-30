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
    @NamedQuery(name = "Post.findByIdpost", query = "SELECT p FROM Post p WHERE p.idpost = :idpost")})
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpost")
    private Integer idpost;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "postinformation")
    private String postinformation;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "posttype")
    private String posttype;
    @JoinColumn(name = "admission_idadmission", referencedColumnName = "idadmission")
    @ManyToOne(optional = false)
    private Admission admissionIdadmission;
    @JoinColumn(name = "faculty_idfaculty", referencedColumnName = "idfaculty")
    @ManyToOne(optional = false)
    private Faculty facultyIdfaculty;
    @JoinColumn(name = "users_permission_idpermission", referencedColumnName = "permission_idpermission")
    @ManyToOne(optional = false)
    private Users usersPermissionIdpermission;
    @JoinColumn(name = "users_idusers", referencedColumnName = "idusers")
    @ManyToOne(optional = false)
    private Users usersIdusers;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postAdmissionIdadmission")
    private Collection<Comment> commentCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postFacultyIdfaculty")
    private Collection<Comment> commentCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postIdpost")
    private Collection<Comment> commentCollection2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postUsersIdusers")
    private Collection<Comment> commentCollection3;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postUsersPermissionIdpermission")
    private Collection<Comment> commentCollection4;

    public Post() {
    }

    public Post(Integer idpost) {
        this.idpost = idpost;
    }

    public Post(Integer idpost, String postinformation) {
        this.idpost = idpost;
        this.postinformation = postinformation;
    }

    public Integer getIdpost() {
        return idpost;
    }

    public void setIdpost(Integer idpost) {
        this.idpost = idpost;
    }

    public String getPostinformation() {
        return postinformation;
    }

    public void setPostinformation(String postinformation) {
        this.postinformation = postinformation;
    }

    public String getPosttype() {
        return posttype;
    }

    public void setPosttype(String posttype) {
        this.posttype = posttype;
    }

    public Admission getAdmissionIdadmission() {
        return admissionIdadmission;
    }

    public void setAdmissionIdadmission(Admission admissionIdadmission) {
        this.admissionIdadmission = admissionIdadmission;
    }

    public Faculty getFacultyIdfaculty() {
        return facultyIdfaculty;
    }

    public void setFacultyIdfaculty(Faculty facultyIdfaculty) {
        this.facultyIdfaculty = facultyIdfaculty;
    }

    public Users getUsersPermissionIdpermission() {
        return usersPermissionIdpermission;
    }

    public void setUsersPermissionIdpermission(Users usersPermissionIdpermission) {
        this.usersPermissionIdpermission = usersPermissionIdpermission;
    }

    public Users getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(Users usersIdusers) {
        this.usersIdusers = usersIdusers;
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
        hash += (idpost != null ? idpost.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Post)) {
            return false;
        }
        Post other = (Post) object;
        if ((this.idpost == null && other.idpost != null) || (this.idpost != null && !this.idpost.equals(other.idpost))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.pojo.Post[ idpost=" + idpost + " ]";
    }
    
}
