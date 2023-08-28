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
@Table(name = "benmarks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Benmarks.findAll", query = "SELECT b FROM Benmarks b"),
    @NamedQuery(name = "Benmarks.findByIdBenmarks", query = "SELECT b FROM Benmarks b WHERE b.idBenmarks = :idBenmarks"),
    @NamedQuery(name = "Benmarks.findByYear", query = "SELECT b FROM Benmarks b WHERE b.year = :year"),
    @NamedQuery(name = "Benmarks.findByDiemHocBa", query = "SELECT b FROM Benmarks b WHERE b.diemHocBa = :diemHocBa"),
    @NamedQuery(name = "Benmarks.findByDiemTHPT", query = "SELECT b FROM Benmarks b WHERE b.diemTHPT = :diemTHPT"),
    @NamedQuery(name = "Benmarks.findByDiemDGNL", query = "SELECT b FROM Benmarks b WHERE b.diemDGNL = :diemDGNL"),
    @NamedQuery(name = "Benmarks.findByBenmarkscol", query = "SELECT b FROM Benmarks b WHERE b.benmarkscol = :benmarkscol"),
    @NamedQuery(name = "Benmarks.findByFacultyidFaculty", query = "SELECT b FROM Benmarks b WHERE b.facultyidFaculty = :facultyidFaculty")})
public class Benmarks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idBenmarks")
    private Integer idBenmarks;
    @Size(max = 45)
    @Column(name = "year")
    private String year;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "diemHocBa")
    private Double diemHocBa;
    @Column(name = "diemTHPT")
    private Double diemTHPT;
    @Column(name = "diemDGNL")
    private Double diemDGNL;
    @Size(max = 45)
    @Column(name = "benmarkscol")
    private String benmarkscol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "faculty_idFaculty")
    private int facultyidFaculty;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "benmarksidBenmarks")
    private Collection<Faculty> facultyCollection;

    public Benmarks() {
    }

    public Benmarks(Integer idBenmarks) {
        this.idBenmarks = idBenmarks;
    }

    public Benmarks(Integer idBenmarks, int facultyidFaculty) {
        this.idBenmarks = idBenmarks;
        this.facultyidFaculty = facultyidFaculty;
    }

    public Integer getIdBenmarks() {
        return idBenmarks;
    }

    public void setIdBenmarks(Integer idBenmarks) {
        this.idBenmarks = idBenmarks;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Double getDiemHocBa() {
        return diemHocBa;
    }

    public void setDiemHocBa(Double diemHocBa) {
        this.diemHocBa = diemHocBa;
    }

    public Double getDiemTHPT() {
        return diemTHPT;
    }

    public void setDiemTHPT(Double diemTHPT) {
        this.diemTHPT = diemTHPT;
    }

    public Double getDiemDGNL() {
        return diemDGNL;
    }

    public void setDiemDGNL(Double diemDGNL) {
        this.diemDGNL = diemDGNL;
    }

    public String getBenmarkscol() {
        return benmarkscol;
    }

    public void setBenmarkscol(String benmarkscol) {
        this.benmarkscol = benmarkscol;
    }

    public int getFacultyidFaculty() {
        return facultyidFaculty;
    }

    public void setFacultyidFaculty(int facultyidFaculty) {
        this.facultyidFaculty = facultyidFaculty;
    }

    @XmlTransient
    public Collection<Faculty> getFacultyCollection() {
        return facultyCollection;
    }

    public void setFacultyCollection(Collection<Faculty> facultyCollection) {
        this.facultyCollection = facultyCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBenmarks != null ? idBenmarks.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Benmarks)) {
            return false;
        }
        Benmarks other = (Benmarks) object;
        if ((this.idBenmarks == null && other.idBenmarks != null) || (this.idBenmarks != null && !this.idBenmarks.equals(other.idBenmarks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.pojo.Benmarks[ idBenmarks=" + idBenmarks + " ]";
    }
    
}
