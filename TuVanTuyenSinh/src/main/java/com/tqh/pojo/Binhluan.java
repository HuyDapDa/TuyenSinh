/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "binhluan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Binhluan.findAll", query = "SELECT b FROM Binhluan b"),
    @NamedQuery(name = "Binhluan.findByIdbinhluan", query = "SELECT b FROM Binhluan b WHERE b.idbinhluan = :idbinhluan"),
    @NamedQuery(name = "Binhluan.findByNoiDungBinhLuan", query = "SELECT b FROM Binhluan b WHERE b.noiDungBinhLuan = :noiDungBinhLuan")})
public class Binhluan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idbinhluan")
    private Integer idbinhluan;
    @Size(max = 45)
    @Column(name = "noiDungBinhLuan")
    private String noiDungBinhLuan;

    public Binhluan() {
    }

    public Binhluan(Integer idbinhluan) {
        this.idbinhluan = idbinhluan;
    }

    public Integer getIdbinhluan() {
        return idbinhluan;
    }

    public void setIdbinhluan(Integer idbinhluan) {
        this.idbinhluan = idbinhluan;
    }

    public String getNoiDungBinhLuan() {
        return noiDungBinhLuan;
    }

    public void setNoiDungBinhLuan(String noiDungBinhLuan) {
        this.noiDungBinhLuan = noiDungBinhLuan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbinhluan != null ? idbinhluan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Binhluan)) {
            return false;
        }
        Binhluan other = (Binhluan) object;
        if ((this.idbinhluan == null && other.idbinhluan != null) || (this.idbinhluan != null && !this.idbinhluan.equals(other.idbinhluan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.configs.Binhluan[ idbinhluan=" + idbinhluan + " ]";
    }
    
}
