
package APP;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;


public class DB {
    public static Connection con = null;
    
    public static void loadConnection(){
        String url = "jdbc:mysql://localhost:3306/futsal";
        String root = "root";
        String pass = "Rayhan22";
        
        try {
            con = DriverManager.getConnection(url,root,pass);
            
            if (con != null){
            JOptionPane.showMessageDialog(null, "database has been successfully connected");
                
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "error in database loading" + e);
        }
    }
}
