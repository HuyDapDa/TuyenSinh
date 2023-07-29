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
@Table(name = "thongtintuyensinh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Thongtintuyensinh.findAll", query = "SELECT t FROM Thongtintuyensinh t"),
    @NamedQuery(name = "Thongtintuyensinh.findByIdtuyenSinh", query = "SELECT t FROM Thongtintuyensinh t WHERE t.idtuyenSinh = :idtuyenSinh"),
    @NamedQuery(name = "Thongtintuyensinh.findByLoaiTuyenSinh", query = "SELECT t FROM Thongtintuyensinh t WHERE t.loaiTuyenSinh = :loaiTuyenSinh"),
    @NamedQuery(name = "Thongtintuyensinh.findByThongTin", query = "SELECT t FROM Thongtintuyensinh t WHERE t.thongTin = :thongTin")})
public class Thongtintuyensinh implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtuyenSinh")
    private Integer idtuyenSinh;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "loaiTuyenSinh")
    private String loaiTuyenSinh;
    @Size(max = 45)
    @Column(name = "thongTin")
    private String thongTin;

    public Thongtintuyensinh() {
    }

    public Thongtintuyensinh(Integer idtuyenSinh) {
        this.idtuyenSinh = idtuyenSinh;
    }

    public Thongtintuyensinh(Integer idtuyenSinh, String loaiTuyenSinh) {
        this.idtuyenSinh = idtuyenSinh;
        this.loaiTuyenSinh = loaiTuyenSinh;
    }

    public Integer getIdtuyenSinh() {
        return idtuyenSinh;
    }

    public void setIdtuyenSinh(Integer idtuyenSinh) {
        this.idtuyenSinh = idtuyenSinh;
    }

    public String getLoaiTuyenSinh() {
        return loaiTuyenSinh;
    }

    public void setLoaiTuyenSinh(String loaiTuyenSinh) {
        this.loaiTuyenSinh = loaiTuyenSinh;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtuyenSinh != null ? idtuyenSinh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Thongtintuyensinh)) {
            return false;
        }
        Thongtintuyensinh other = (Thongtintuyensinh) object;
        if ((this.idtuyenSinh == null && other.idtuyenSinh != null) || (this.idtuyenSinh != null && !this.idtuyenSinh.equals(other.idtuyenSinh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.configs.Thongtintuyensinh[ idtuyenSinh=" + idtuyenSinh + " ]";
    }
    
}
