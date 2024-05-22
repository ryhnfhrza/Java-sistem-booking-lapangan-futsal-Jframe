
package bookingFrame;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import APP.DB;


public class BookingFrameRepository {
    
    public void Booking(BookingCreateRequest booking){
        try{
            String query = "insert into booking (jam_main,lapangan,namaTeam,noTelp) values (?,?,?,?)";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1, );
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"" +e);
        }
    }
    
}
