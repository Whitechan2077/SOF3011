package model;

import jakarta.persistence.*;

@Entity
@Table(name = "Mon_Hoc", schema = "dbo", catalog = "FLP")
public class MonHoc {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idMonHoc")
    private int idMonHoc;
    @Basic
    @Column(name = "idNganh")
    private int idNganh;
    @Basic
    @Column(name = "idNganhHep")
    private Integer idNganhHep;
    @Basic
    @Column(name = "tenMon")
    private String tenMon;
    @Basic
    @Column(name = "maMon")
    private String maMon;

    public int getIdMonHoc() {
        return idMonHoc;
    }

    public void setIdMonHoc(int idMonHoc) {
        this.idMonHoc = idMonHoc;
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

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MonHoc monHoc = (MonHoc) o;

        if (idMonHoc != monHoc.idMonHoc) return false;
        if (idNganh != monHoc.idNganh) return false;
        if (idNganhHep != null ? !idNganhHep.equals(monHoc.idNganhHep) : monHoc.idNganhHep != null) return false;
        if (tenMon != null ? !tenMon.equals(monHoc.tenMon) : monHoc.tenMon != null) return false;
        if (maMon != null ? !maMon.equals(monHoc.maMon) : monHoc.maMon != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMonHoc;
        result = 31 * result + idNganh;
        result = 31 * result + (idNganhHep != null ? idNganhHep.hashCode() : 0);
        result = 31 * result + (tenMon != null ? tenMon.hashCode() : 0);
        result = 31 * result + (maMon != null ? maMon.hashCode() : 0);
        return result;
    }
}
