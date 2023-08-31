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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
    @NamedQuery(name = "Benmarks.findByIdbenmarks", query = "SELECT b FROM Benmarks b WHERE b.idbenmarks = :idbenmarks"),
    @NamedQuery(name = "Benmarks.findByYear", query = "SELECT b FROM Benmarks b WHERE b.year = :year"),
    @NamedQuery(name = "Benmarks.findByDiemhocba", query = "SELECT b FROM Benmarks b WHERE b.diemhocba = :diemhocba"),
    @NamedQuery(name = "Benmarks.findByDiemthpt", query = "SELECT b FROM Benmarks b WHERE b.diemthpt = :diemthpt"),
    @NamedQuery(name = "Benmarks.findByDiemdgnl", query = "SELECT b FROM Benmarks b WHERE b.diemdgnl = :diemdgnl")})
public class Benmarks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbenmarks")
    private Integer idbenmarks;
    @Size(max = 45)
    @Column(name = "year")
    private String year;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "diemhocba")
    private Double diemhocba;
    @Column(name = "diemthpt")
    private Double diemthpt;
    @Column(name = "diemdgnl")
    private Double diemdgnl;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "benmarksIdbenmarks")
    private Set<Faculty> facultySet;

    public Benmarks() {
    }

    public Benmarks(Integer idbenmarks) {
        this.idbenmarks = idbenmarks;
    }

    public Integer getIdbenmarks() {
        return idbenmarks;
    }

    public void setIdbenmarks(Integer idbenmarks) {
        this.idbenmarks = idbenmarks;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Double getDiemhocba() {
        return diemhocba;
    }

    public void setDiemhocba(Double diemhocba) {
        this.diemhocba = diemhocba;
    }

    public Double getDiemthpt() {
        return diemthpt;
    }

    public void setDiemthpt(Double diemthpt) {
        this.diemthpt = diemthpt;
    }

    public Double getDiemdgnl() {
        return diemdgnl;
    }

    public void setDiemdgnl(Double diemdgnl) {
        this.diemdgnl = diemdgnl;
    }

    @XmlTransient
    public Set<Faculty> getFacultySet() {
        return facultySet;
    }

    public void setFacultySet(Set<Faculty> facultySet) {
        this.facultySet = facultySet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbenmarks != null ? idbenmarks.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Benmarks)) {
            return false;
        }
        Benmarks other = (Benmarks) object;
        if ((this.idbenmarks == null && other.idbenmarks != null) || (this.idbenmarks != null && !this.idbenmarks.equals(other.idbenmarks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.pojo.Benmarks[ idbenmarks=" + idbenmarks + " ]";
    }
    
}
