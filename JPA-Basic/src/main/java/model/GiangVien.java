package model;

import jakarta.persistence.*;

import java.util.Arrays;

@Entity
@Table(name = "Giang_Vien", schema = "dbo", catalog = "FLP")
public class GiangVien {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idGiangVien")
    private int idGiangVien;
    @Basic
    @Column(name = "tenGiangVien")
    private String tenGiangVien;
    @Basic
    @Column(name = "idNganh")
    private int idNganh;
    @Basic
    @Column(name = "sdt")
    private String sdt;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "gioiTinh")
    private boolean gioiTinh;
    @Basic
    @Column(name = "hinhAnh")
    private byte[] hinhAnh;
    @Basic
    @Column(name = "diaChi")
    private String diaChi;

    public int getIdGiangVien() {
        return idGiangVien;
    }

    public void setIdGiangVien(int idGiangVien) {
        this.idGiangVien = idGiangVien;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public int getIdNganh() {
        return idNganh;
    }

    public void setIdNganh(int idNganh) {
        this.idNganh = idNganh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public byte[] getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(byte[] hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GiangVien giangVien = (GiangVien) o;

        if (idGiangVien != giangVien.idGiangVien) return false;
        if (idNganh != giangVien.idNganh) return false;
        if (gioiTinh != giangVien.gioiTinh) return false;
        if (tenGiangVien != null ? !tenGiangVien.equals(giangVien.tenGiangVien) : giangVien.tenGiangVien != null)
            return false;
        if (sdt != null ? !sdt.equals(giangVien.sdt) : giangVien.sdt != null) return false;
        if (email != null ? !email.equals(giangVien.email) : giangVien.email != null) return false;
        if (!Arrays.equals(hinhAnh, giangVien.hinhAnh)) return false;
        if (diaChi != null ? !diaChi.equals(giangVien.diaChi) : giangVien.diaChi != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGiangVien;
        result = 31 * result + (tenGiangVien != null ? tenGiangVien.hashCode() : 0);
        result = 31 * result + idNganh;
        result = 31 * result + (sdt != null ? sdt.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (gioiTinh ? 1 : 0);
        result = 31 * result + Arrays.hashCode(hinhAnh);
        result = 31 * result + (diaChi != null ? diaChi.hashCode() : 0);
        return result;
    }
}
