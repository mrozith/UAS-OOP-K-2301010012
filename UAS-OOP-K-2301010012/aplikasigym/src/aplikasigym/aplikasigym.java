/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasigym;

/**
 *
 * @author INSTIKI
 */
import com.gym.model.Pelanggan;
import com.gym.util.KoneksiDatabase;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Kelas ini berisi semua logika untuk mengelola data pelanggan di database.
 * Package: com.gym.dao
 */
public class aplikasigym {

    // Method untuk CREATE (Menambah data)
    public void tambahPelanggan(Pelanggan pelanggan) throws SQLException {
        String sql = "INSERT INTO pelanggan (nama_lengkap, no_telepon, alamat, tanggal_bergabung, jenis_membership, status_aktif) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = KoneksiDatabase.getKoneksi();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, pelanggan.getNama_lengkap());
            ps.setString(2, pelanggan.getNo_telepon());
            ps.setString(3, pelanggan.getAlamat());
            ps.setDate(4, pelanggan.getTanggal_bergabung());
            ps.setString(5, pelanggan.getJenis_membership());
            ps.setBoolean(6, pelanggan.isStatus_aktif());
            ps.executeUpdate();
        }
    }

    // Method untuk READ (Mengambil semua data)
    public List<Pelanggan> semuaPelanggan() throws SQLException {
        List<Pelanggan> daftarPelanggan = new ArrayList<>();
        String sql = "SELECT * FROM pelanggan ORDER BY nama_lengkap ASC";
        
        try (Connection conn = KoneksiDatabase.getKoneksi();
             Statement s = conn.createStatement();
             ResultSet rs = s.executeQuery(sql)) {
            
            while (rs.next()) {
                Pelanggan p = new Pelanggan();
                p.setId_pelanggan(rs.getInt("id_pelanggan"));
                p.setNama_lengkap(rs.getString("nama_lengkap"));
                p.setNo_telepon(rs.getString("no_telepon"));
                p.setAlamat(rs.getString("alamat"));
                p.setTanggal_bergabung(rs.getDate("tanggal_bergabung"));
                p.setJenis_membership(rs.getString("jenis_membership"));
                p.setStatus_aktif(rs.getBoolean("status_aktif"));
                daftarPelanggan.add(p);
            }
        }
        return daftarPelanggan;
    }

    // Method untuk UPDATE (Mengubah data)
    public void updatePelanggan(Pelanggan pelanggan) throws SQLException {
        String sql = "UPDATE pelanggan SET nama_lengkap=?, no_telepon=?, alamat=?, tanggal_bergabung=?, jenis_membership=?, status_aktif=? WHERE id_pelanggan=?";
        try (Connection conn = KoneksiDatabase.getKoneksi();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, pelanggan.getNama_lengkap());
            ps.setString(2, pelanggan.getNo_telepon());
            ps.setString(3, pelanggan.getAlamat());
            ps.setDate(4, pelanggan.getTanggal_bergabung());
            ps.setString(5, pelanggan.getJenis_membership());
            ps.setBoolean(6, pelanggan.isStatus_aktif());
            ps.setInt(7, pelanggan.getId_pelanggan());
            ps.executeUpdate();
        }
    }

    // Method untuk DELETE (Menghapus data)
    public void hapusPelanggan(int id) throws SQLException {
        String sql = "DELETE FROM pelanggan WHERE id_pelanggan=?";
        try (Connection conn = KoneksiDatabase.getKoneksi();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}
