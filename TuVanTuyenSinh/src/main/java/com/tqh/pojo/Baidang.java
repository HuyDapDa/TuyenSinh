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
@Table(name = "baidang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Baidang.findAll", query = "SELECT b FROM Baidang b"),
    @NamedQuery(name = "Baidang.findByIdbaidang", query = "SELECT b FROM Baidang b WHERE b.idbaidang = :idbaidang"),
    @NamedQuery(name = "Baidang.findByNoiDungBaiDang", query = "SELECT b FROM Baidang b WHERE b.noiDungBaiDang = :noiDungBaiDang")})
public class Baidang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idbaidang")
    private Integer idbaidang;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "noiDungBaiDang")
    private String noiDungBaiDang;

    public Baidang() {
    }

    public Baidang(Integer idbaidang) {
        this.idbaidang = idbaidang;
    }

    public Baidang(Integer idbaidang, String noiDungBaiDang) {
        this.idbaidang = idbaidang;
        this.noiDungBaiDang = noiDungBaiDang;
    }

    public Integer getIdbaidang() {
        return idbaidang;
    }

    public void setIdbaidang(Integer idbaidang) {
        this.idbaidang = idbaidang;
    }

    public String getNoiDungBaiDang() {
        return noiDungBaiDang;
    }

    public void setNoiDungBaiDang(String noiDungBaiDang) {
        this.noiDungBaiDang = noiDungBaiDang;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbaidang != null ? idbaidang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Baidang)) {
            return false;
        }
        Baidang other = (Baidang) object;
        if ((this.idbaidang == null && other.idbaidang != null) || (this.idbaidang != null && !this.idbaidang.equals(other.idbaidang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.configs.Baidang[ idbaidang=" + idbaidang + " ]";
    }
    
}
