package My_classes;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;




public class DB {
    static Connection c;
    //create a connection beween the project & mysql database
    public static Connection getConnection(){
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            String url = "jdbc:mySQL://localhost:3306/newlibrary?useSSL=false";
            String username = "root";
            String password = "Khuyen293@";
            c = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;    
    }
    
    
    
    
}
