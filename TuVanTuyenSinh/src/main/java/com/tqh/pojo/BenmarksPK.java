/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Admin
 */
@Embeddable
public class BenmarksPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idBenmarks")
    private int idBenmarks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "faculty_idFaculty")
    private int facultyidFaculty;

    public BenmarksPK() {
    }

    public BenmarksPK(int idBenmarks, int facultyidFaculty) {
        this.idBenmarks = idBenmarks;
        this.facultyidFaculty = facultyidFaculty;
    }

    public int getIdBenmarks() {
        return idBenmarks;
    }

    public void setIdBenmarks(int idBenmarks) {
        this.idBenmarks = idBenmarks;
    }

    public int getFacultyidFaculty() {
        return facultyidFaculty;
    }

    public void setFacultyidFaculty(int facultyidFaculty) {
        this.facultyidFaculty = facultyidFaculty;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idBenmarks;
        hash += (int) facultyidFaculty;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BenmarksPK)) {
            return false;
        }
        BenmarksPK other = (BenmarksPK) object;
        if (this.idBenmarks != other.idBenmarks) {
            return false;
        }
        if (this.facultyidFaculty != other.facultyidFaculty) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.pojo.BenmarksPK[ idBenmarks=" + idBenmarks + ", facultyidFaculty=" + facultyidFaculty + " ]";
    }
    
}
