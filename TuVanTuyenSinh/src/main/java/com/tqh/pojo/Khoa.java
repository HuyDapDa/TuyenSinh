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
@Table(name = "khoa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Khoa.findAll", query = "SELECT k FROM Khoa k"),
    @NamedQuery(name = "Khoa.findByIdKhoa", query = "SELECT k FROM Khoa k WHERE k.idKhoa = :idKhoa"),
    @NamedQuery(name = "Khoa.findByNameKhoa", query = "SELECT k FROM Khoa k WHERE k.nameKhoa = :nameKhoa"),
    @NamedQuery(name = "Khoa.findByChuongTrinhDaoTao", query = "SELECT k FROM Khoa k WHERE k.chuongTrinhDaoTao = :chuongTrinhDaoTao"),
    @NamedQuery(name = "Khoa.findByWebsites", query = "SELECT k FROM Khoa k WHERE k.websites = :websites"),
    @NamedQuery(name = "Khoa.findByVideoGioiThieu", query = "SELECT k FROM Khoa k WHERE k.videoGioiThieu = :videoGioiThieu"),
    @NamedQuery(name = "Khoa.findByDiemTB", query = "SELECT k FROM Khoa k WHERE k.diemTB = :diemTB")})
public class Khoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idKhoa")
    private Integer idKhoa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nameKhoa")
    private String nameKhoa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "chuongTrinhDaoTao")
    private String chuongTrinhDaoTao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "websites")
    private String websites;
    @Size(max = 50)
    @Column(name = "videoGioiThieu")
    private String videoGioiThieu;
    @Column(name = "diemTB")
    private Integer diemTB;

    public Khoa() {
    }

    public Khoa(Integer idKhoa) {
        this.idKhoa = idKhoa;
    }

    public Khoa(Integer idKhoa, String nameKhoa, String chuongTrinhDaoTao, String websites) {
        this.idKhoa = idKhoa;
        this.nameKhoa = nameKhoa;
        this.chuongTrinhDaoTao = chuongTrinhDaoTao;
        this.websites = websites;
    }

    public Integer getIdKhoa() {
        return idKhoa;
    }

    public void setIdKhoa(Integer idKhoa) {
        this.idKhoa = idKhoa;
    }

    public String getNameKhoa() {
        return nameKhoa;
    }

    public void setNameKhoa(String nameKhoa) {
        this.nameKhoa = nameKhoa;
    }

    public String getChuongTrinhDaoTao() {
        return chuongTrinhDaoTao;
    }

    public void setChuongTrinhDaoTao(String chuongTrinhDaoTao) {
        this.chuongTrinhDaoTao = chuongTrinhDaoTao;
    }

    public String getWebsites() {
        return websites;
    }

    public void setWebsites(String websites) {
        this.websites = websites;
    }

    public String getVideoGioiThieu() {
        return videoGioiThieu;
    }

    public void setVideoGioiThieu(String videoGioiThieu) {
        this.videoGioiThieu = videoGioiThieu;
    }

    public Integer getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(Integer diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKhoa != null ? idKhoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Khoa)) {
            return false;
        }
        Khoa other = (Khoa) object;
        if ((this.idKhoa == null && other.idKhoa != null) || (this.idKhoa != null && !this.idKhoa.equals(other.idKhoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tqh.configs.Khoa[ idKhoa=" + idKhoa + " ]";
    }
    
}
