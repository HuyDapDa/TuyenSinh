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
@Table(name = "faculty")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Faculty.findAll", query = "SELECT f FROM Faculty f"),
    @NamedQuery(name = "Faculty.findByIdfaculty", query = "SELECT f FROM Faculty f WHERE f.idfaculty = :idfaculty"),
    @NamedQuery(name = "Faculty.findByFacultyname", query = "SELECT f FROM Faculty f WHERE f.facultyname = :facultyname"),
    @NamedQuery(name = "Faculty.findByWebsite", query = "SELECT f FROM Faculty f WHERE f.website = :website"),
    @NamedQuery(name = "Faculty.findByIntrovideo", query = "SELECT f FROM Faculty f WHERE f.introvideo = :introvideo")})
public class Faculty implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfaculty")
    private Integer idfaculty;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "facultyname")
    private String facultyname;
    @Size(max = 45)
    @Column(name = "website")
    private String website;
    @Size(max = 45)
    @Column(name = "introvideo")
    private String introvideo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facultyIdfaculty")
    private Set<Post> postSet;
    @JoinColumn(name = "benmarks_idbenmarks", referencedColumnName = "idbenmarks")
    @ManyToOne(optional = false)
    private Benmarks benmarksIdbenmarks;

    public Faculty() {
    }

    public Faculty(Integer idfaculty) {
        this.idfaculty = idfaculty;
    }

    public Faculty(Integer idfaculty, String facultyname) {
        this.idfaculty = idfaculty;
        this.facultyname = facultyname;
    }

    public Integer getIdfaculty() {
        return idfaculty;
    }

    public void setIdfaculty(Integer idfaculty) {
        this.idfaculty = idfaculty;
    }

    public String getFacultyname() {
        return facultyname;
    }

    public void setFacultyname(String facultyname) {
        this.facultyname = facultyname;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getIntrovideo() {
        return introvideo;
    }

    public void setIntrovideo(String introvideo) {
        this.introvideo = introvideo;
    }

    @XmlTransient
    public Set<Post> getPostSet() {
        return postSet;
    }

    public void setPostSet(Set<Post> postSet) {
        this.postSet = postSet;
    }

    public Benmarks getBenmarksIdbenmarks() {
        return benmarksIdbenmarks;
    }

    public void setBenmarksIdbenmarks(Benmarks benmarksIdbenmarks) {
        this.benmarksIdbenmarks = benmarksIdbenmarks;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfaculty != null ? idfaculty.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Faculty)) {
            return false;
        }
        Faculty other = (Faculty) object;
        if ((this.idfaculty == null && other.idfaculty != null) || (this.idfaculty != null && !this.idfaculty.equals(other.idfaculty))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.pojo.Faculty[ idfaculty=" + idfaculty + " ]";
    }
    
}
