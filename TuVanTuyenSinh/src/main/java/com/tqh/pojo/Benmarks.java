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
@Table(name = "benmarks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Benmarks.findAll", query = "SELECT b FROM Benmarks b"),
    @NamedQuery(name = "Benmarks.findByIdBenmarks", query = "SELECT b FROM Benmarks b WHERE b.benmarksPK.idBenmarks = :idBenmarks"),
    @NamedQuery(name = "Benmarks.findByYear", query = "SELECT b FROM Benmarks b WHERE b.year = :year"),
    @NamedQuery(name = "Benmarks.findByDiemHocBa", query = "SELECT b FROM Benmarks b WHERE b.diemHocBa = :diemHocBa"),
    @NamedQuery(name = "Benmarks.findByDiemTHPT", query = "SELECT b FROM Benmarks b WHERE b.diemTHPT = :diemTHPT"),
    @NamedQuery(name = "Benmarks.findByDiemDGNL", query = "SELECT b FROM Benmarks b WHERE b.diemDGNL = :diemDGNL"),
    @NamedQuery(name = "Benmarks.findByFacultyidFaculty", query = "SELECT b FROM Benmarks b WHERE b.benmarksPK.facultyidFaculty = :facultyidFaculty")})
public class Benmarks implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BenmarksPK benmarksPK;
    @Size(max = 50)
    @Column(name = "year")
    private String year;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "diemHocBa")
    private Double diemHocBa;
    @Column(name = "diemTHPT")
    private Double diemTHPT;
    @Column(name = "diemDGNL")
    private Double diemDGNL;
    @JoinColumn(name = "faculty_idFaculty", referencedColumnName = "idFaculty", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Faculty faculty;

    public Benmarks() {
    }

    public Benmarks(BenmarksPK benmarksPK) {
        this.benmarksPK = benmarksPK;
    }

    public Benmarks(int idBenmarks, int facultyidFaculty) {
        this.benmarksPK = new BenmarksPK(idBenmarks, facultyidFaculty);
    }

    public BenmarksPK getBenmarksPK() {
        return benmarksPK;
    }

    public void setBenmarksPK(BenmarksPK benmarksPK) {
        this.benmarksPK = benmarksPK;
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

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (benmarksPK != null ? benmarksPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Benmarks)) {
            return false;
        }
        Benmarks other = (Benmarks) object;
        if ((this.benmarksPK == null && other.benmarksPK != null) || (this.benmarksPK != null && !this.benmarksPK.equals(other.benmarksPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.pojo.Benmarks[ benmarksPK=" + benmarksPK + " ]";
    }
    
}
