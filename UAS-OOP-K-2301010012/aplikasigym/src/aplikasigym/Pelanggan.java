/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasigym;

/**
 *
 * @author INSTIKI
 */
import java.sql.Date;

/**
 * Kelas Model (POJO) untuk merepresentasikan data seorang pelanggan.
 * Package: com.gym.model
 */
public class Pelanggan {
    private int id_pelanggan;
    private String nama_lengkap;
    private String no_telepon;
    private String alamat;
    private Date tanggal_bergabung;
    private String jenis_membership;
    private boolean status_aktif;

    // Getters dan Setters untuk semua variabel
    public int getId_pelanggan() { return id_pelanggan; }
    public void setId_pelanggan(int id_pelanggan) { this.id_pelanggan = id_pelanggan; }
    public String getNama_lengkap() { return nama_lengkap; }
    public void setNama_lengkap(String nama_lengkap) { this.nama_lengkap = nama_lengkap; }
    public String getNo_telepon() { return no_telepon; }
    public void setNo_telepon(String no_telepon) { this.no_telepon = no_telepon; }
    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
    public Date getTanggal_bergabung() { return tanggal_bergabung; }
    public void setTanggal_bergabung(Date tanggal_bergabung) { this.tanggal_bergabung = tanggal_bergabung; }
    public String getJenis_membership() { return jenis_membership; }
    public void setJenis_membership(String jenis_membership) { this.jenis_membership = jenis_membership; }
    public boolean isStatus_aktif() { return status_aktif; }
    public void setStatus_aktif(boolean status_aktif) { this.status_aktif = status_aktif; }
}