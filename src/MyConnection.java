
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author User
 */
public class MyConnection {
    public static Connection connectdb(){
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/CSE", "cse", "310");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    
}
