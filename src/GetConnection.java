
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
  private static Connection con; 
  public static Connection getConnection(){
    try{
      // 1:- Load the driver
      Class.forName("com.mysql.jdbc.Driver");
      con =  DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/productdb",
              "root",
              "root");
    }
    catch(Exception e){
        e.printStackTrace();
    }
    return con;
  }    
}
