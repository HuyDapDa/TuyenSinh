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
import javax.persistence.Id;
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
    @NamedQuery(name = "Faculty.findByIdFaculty", query = "SELECT f FROM Faculty f WHERE f.idFaculty = :idFaculty"),
    @NamedQuery(name = "Faculty.findByFalcutyName", query = "SELECT f FROM Faculty f WHERE f.falcutyName = :falcutyName"),
    @NamedQuery(name = "Faculty.findByWebsite", query = "SELECT f FROM Faculty f WHERE f.website = :website"),
    @NamedQuery(name = "Faculty.findByIntroVideo", query = "SELECT f FROM Faculty f WHERE f.introVideo = :introVideo")})
public class Faculty implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idFaculty")
    private Integer idFaculty;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "falcutyName")
    private String falcutyName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "website")
    private String website;
    @Size(max = 50)
    @Column(name = "introVideo")
    private String introVideo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "faculty")
    private Collection<Benmarks> benmarksCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "faculty")
    private Collection<Post> postCollection;

    public Faculty() {
    }

    public Faculty(Integer idFaculty) {
        this.idFaculty = idFaculty;
    }

    public Faculty(Integer idFaculty, String falcutyName, String website) {
        this.idFaculty = idFaculty;
        this.falcutyName = falcutyName;
        this.website = website;
    }

    public Integer getIdFaculty() {
        return idFaculty;
    }

    public void setIdFaculty(Integer idFaculty) {
        this.idFaculty = idFaculty;
    }

    public String getFalcutyName() {
        return falcutyName;
    }

    public void setFalcutyName(String falcutyName) {
        this.falcutyName = falcutyName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getIntroVideo() {
        return introVideo;
    }

    public void setIntroVideo(String introVideo) {
        this.introVideo = introVideo;
    }

    @XmlTransient
    public Collection<Benmarks> getBenmarksCollection() {
        return benmarksCollection;
    }

    public void setBenmarksCollection(Collection<Benmarks> benmarksCollection) {
        this.benmarksCollection = benmarksCollection;
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
        hash += (idFaculty != null ? idFaculty.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Faculty)) {
            return false;
        }
        Faculty other = (Faculty) object;
        if ((this.idFaculty == null && other.idFaculty != null) || (this.idFaculty != null && !this.idFaculty.equals(other.idFaculty))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.pojo.Faculty[ idFaculty=" + idFaculty + " ]";
    }
    
}
