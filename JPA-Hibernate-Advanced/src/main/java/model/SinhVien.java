package model;

import jakarta.persistence.*;

import java.util.Arrays;

@Entity
@Table(name = "Sinh_Vien", schema = "dbo", catalog = "FLP")
public class SinhVien {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idSinhVien")
    private int idSinhVien;
    @Basic
    @Column(name = "tenSinhVien")
    private String tenSinhVien;
    @Basic
    @Column(name = "idNganh")
    private int idNganh;
    @Basic
    @Column(name = "idNganhHep")
    private Integer idNganhHep;
    @Basic
    @Column(name = "gioiTinh")
    private boolean gioiTinh;
    @Basic
    @Column(name = "sdt")
    private String sdt;
    @Basic
    @Column(name = "diaChi")
    private String diaChi;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "hinhAnh")
    private byte[] hinhAnh;

    public int getIdSinhVien() {
        return idSinhVien;
    }

    public void setIdSinhVien(int idSinhVien) {
        this.idSinhVien = idSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public int getIdNganh() {
        return idNganh;
    }

    public void setIdNganh(int idNganh) {
        this.idNganh = idNganh;
    }

    public Integer getIdNganhHep() {
        return idNganhHep;
    }

    public void setIdNganhHep(Integer idNganhHep) {
        this.idNganhHep = idNganhHep;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(byte[] hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SinhVien sinhVien = (SinhVien) o;

        if (idSinhVien != sinhVien.idSinhVien) return false;
        if (idNganh != sinhVien.idNganh) return false;
        if (gioiTinh != sinhVien.gioiTinh) return false;
        if (tenSinhVien != null ? !tenSinhVien.equals(sinhVien.tenSinhVien) : sinhVien.tenSinhVien != null)
            return false;
        if (idNganhHep != null ? !idNganhHep.equals(sinhVien.idNganhHep) : sinhVien.idNganhHep != null) return false;
        if (sdt != null ? !sdt.equals(sinhVien.sdt) : sinhVien.sdt != null) return false;
        if (diaChi != null ? !diaChi.equals(sinhVien.diaChi) : sinhVien.diaChi != null) return false;
        if (email != null ? !email.equals(sinhVien.email) : sinhVien.email != null) return false;
        if (!Arrays.equals(hinhAnh, sinhVien.hinhAnh)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSinhVien;
        result = 31 * result + (tenSinhVien != null ? tenSinhVien.hashCode() : 0);
        result = 31 * result + idNganh;
        result = 31 * result + (idNganhHep != null ? idNganhHep.hashCode() : 0);
        result = 31 * result + (gioiTinh ? 1 : 0);
        result = 31 * result + (sdt != null ? sdt.hashCode() : 0);
        result = 31 * result + (diaChi != null ? diaChi.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(hinhAnh);
        return result;
    }
}
