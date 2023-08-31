/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.pojo;

import java.io.Serializable;
import java.util.Set;
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
    @Column(name = "postName")
    private String postName;
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
    @JoinColumn(name = "users_idusers", referencedColumnName = "idusers")
    @ManyToOne(optional = false)
    private Users usersIdusers;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postAdmissionIdadmission")
    private Set<Comment> commentSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postFacultyIdfaculty")
    private Set<Comment> commentSet1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postIdpost")
    private Set<Comment> commentSet2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postUsersIdusers")
    private Set<Comment> commentSet3;

    public Post() {
    }

    public Post(Integer idpost) {
        this.idpost = idpost;
    }

    public Post(Integer idpost, String postName, String postinformation) {
        this.idpost = idpost;
        this.postName = postName;
        this.postinformation = postinformation;
    }

    public Integer getIdpost() {
        return idpost;
    }

    public void setIdpost(Integer idpost) {
        this.idpost = idpost;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
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

    public Users getUsersIdusers() {
        return usersIdusers;
    }

    public void setUsersIdusers(Users usersIdusers) {
        this.usersIdusers = usersIdusers;
    }

    @XmlTransient
    public Set<Comment> getCommentSet() {
        return commentSet;
    }

    public void setCommentSet(Set<Comment> commentSet) {
        this.commentSet = commentSet;
    }

    @XmlTransient
    public Set<Comment> getCommentSet1() {
        return commentSet1;
    }

    public void setCommentSet1(Set<Comment> commentSet1) {
        this.commentSet1 = commentSet1;
    }

    @XmlTransient
    public Set<Comment> getCommentSet2() {
        return commentSet2;
    }

    public void setCommentSet2(Set<Comment> commentSet2) {
        this.commentSet2 = commentSet2;
    }

    @XmlTransient
    public Set<Comment> getCommentSet3() {
        return commentSet3;
    }

    public void setCommentSet3(Set<Comment> commentSet3) {
        this.commentSet3 = commentSet3;
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
