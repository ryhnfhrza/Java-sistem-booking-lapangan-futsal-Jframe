
package registrasiFrame;

import javax.swing.JOptionPane;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import APP.DB;
import mainFrame.Main;

public class Bal {
    public boolean insertDataSignUp(Bean beanObj) {
        try {
            DB.con.setAutoCommit(false);
            
            if (beanObj.getUsername().isEmpty() || beanObj.getPassword().isEmpty() || beanObj.getNoHp().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Mohon lengkapi semua data yang diperlukan.");
                return false; // Batalkan operasi jika ada data yang kosong
            }
            
            if (!beanObj.getPassword().equals(beanObj.getReTypePassword())) {
                JOptionPane.showMessageDialog(null, "Password dan re-Type password berbeda.");
                return false; // Batalkan operasi jika password tidak cocok
            }
            
            String query = "INSERT INTO user VALUES (null,?,?,?)"; 
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1,beanObj.getUsername());
            ps.setString(2,beanObj.getPassword());
            ps.setString(3,beanObj.getNoHp());

            // Eksekusi pernyataan SQL
            ps.executeUpdate();

            // Lakukan komit transaksi
            DB.con.commit();

            JOptionPane.showMessageDialog(null, "Berhasil melakukan registrasi");
            return true; // Registrasi berhasil
        } catch(Exception e) {
            // Lakukan rollback transaksi jika terjadi kesalahan
            try {
                DB.con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            JOptionPane.showMessageDialog(null,""+ e);
            return false; // Registrasi gagal
        } finally {
            try {
                DB.con.setAutoCommit(true);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    public boolean isValidPhoneNumber(String phoneNumber) {
    // Format nomor telepon Indonesia: 081x-xxxx-xxxx atau 081x xxx xxxx
    String regex = "^(\\+62|62|0)(\\d{3,4}-?){2}\\d{3,4}$";
    return phoneNumber.matches(regex);
}
}



