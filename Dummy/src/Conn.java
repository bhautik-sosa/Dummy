import java.sql.*;

public class Conn {
     Connection cn;
     PreparedStatement pr;
     Conn( String q) {
         String url = "jdbc:mysql://localhost:3306/Dummy";
         String username = "root";
         String password = "Sosa@2004";
         try {
             Class.forName("com.mysql.jdbc.Driver");
             cn =DriverManager.getConnection(url ,username , password);
             pr = cn.prepareStatement(q);
             if(cn.isClosed()) System.out.println("Not connected");
             else System.out.println("Connection Established");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

     }
}
