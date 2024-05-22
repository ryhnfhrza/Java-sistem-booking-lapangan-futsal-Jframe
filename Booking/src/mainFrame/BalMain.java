package mainFrame;

import APP.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BalMain {
    
    public boolean checkLogin(String username, String password) {
        try {
            String query = "SELECT username, password FROM user WHERE username = ? AND password = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);

            // Eksekusi pernyataan SQL
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Jika ditemukan pengguna dengan username dan password yang cocok
                JOptionPane.showMessageDialog(null, "Berhasil Login");
                return true;
            } else {
                // Jika tidak ditemukan pengguna dengan username dan password yang cocok
                JOptionPane.showMessageDialog(null, "Username atau password salah");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            return false;
        }
    }
}
