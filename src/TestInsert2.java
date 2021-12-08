
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class TestInsert2 {
  public static void main(String[] args) {
      Connection con = null;
      try{
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Product Name");
          String name = sc.next();
          
          System.out.println("Enter Price");
          float price = sc.nextFloat();
          
          System.out.println("Enter Description");
          String desc = sc.next();
          
          con = GetConnection.getConnection();
          
          String sql = "insert into product(name,price,description) values(?,?,?)";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, name);
          ps.setFloat(2, price);
          ps.setString(3, desc);
     
          int x = ps.executeUpdate();
          if(x!=0)
              System.out.println("Record Insereted...");
          else
              System.out.println("Reconrd Not Inserted....");
      }
      catch(Exception e){
        e.printStackTrace();
      }
      finally{
          try{
              con.close();
          }
          catch(Exception e){
              e.printStackTrace();
          }
      }
  }
    
}
