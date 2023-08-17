package model;

import jakarta.persistence.*;

@Entity
public class Users {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "userId")
    private int userId;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "idSinhVien",insertable = false,updatable = false)
    private Integer idSinhVien;
    @Basic
    @Column(name = "idGiangVien")
    private Integer idGiangVien;
    @Basic
    @Column(name = "idCanBo")
    private Integer idCanBo;
    @ManyToOne
    @JoinColumn(name = "idSinhVien", referencedColumnName = "idSinhVien")
    private SinhVien sinhVienByIdSinhVien;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIdSinhVien() {
        return idSinhVien;
    }

    public void setIdSinhVien(Integer idSinhVien) {
        this.idSinhVien = idSinhVien;
    }

    public Integer getIdGiangVien() {
        return idGiangVien;
    }

    public void setIdGiangVien(Integer idGiangVien) {
        this.idGiangVien = idGiangVien;
    }

    public Integer getIdCanBo() {
        return idCanBo;
    }

    public void setIdCanBo(Integer idCanBo) {
        this.idCanBo = idCanBo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (userId != users.userId) return false;
        if (username != null ? !username.equals(users.username) : users.username != null) return false;
        if (password != null ? !password.equals(users.password) : users.password != null) return false;
        if (idSinhVien != null ? !idSinhVien.equals(users.idSinhVien) : users.idSinhVien != null) return false;
        if (idGiangVien != null ? !idGiangVien.equals(users.idGiangVien) : users.idGiangVien != null) return false;
        if (idCanBo != null ? !idCanBo.equals(users.idCanBo) : users.idCanBo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (idSinhVien != null ? idSinhVien.hashCode() : 0);
        result = 31 * result + (idGiangVien != null ? idGiangVien.hashCode() : 0);
        result = 31 * result + (idCanBo != null ? idCanBo.hashCode() : 0);
        return result;
    }

    public SinhVien getSinhVienByIdSinhVien() {
        return sinhVienByIdSinhVien;
    }

    public void setSinhVienByIdSinhVien(SinhVien sinhVienByIdSinhVien) {
        this.sinhVienByIdSinhVien = sinhVienByIdSinhVien;
    }
}
