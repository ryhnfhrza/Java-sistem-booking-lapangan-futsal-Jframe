package futsal;

import registrasiFrame.Registrasi;
import APP.DB;
import mainFrame.Main;

public class futsalRequest {
    
    public static void main(String[] args) {
        Main mainFrame = new Main();
        mainFrame.show();
        
        
        DB.loadConnection();
    }
}
