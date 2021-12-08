
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class TestInsert {
  public static void main(String[] args) {
   Connection con = null;
    try{ 
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Product Name");
      String name = sc.next();
      
      System.out.println("Enter Price");
      float price =sc.nextFloat();
      
      System.out.println("Enter Description");
      String desc = sc.next();
      
      String sql="insert into product(name,price,description)"
          + " values('"+name+"',"+price+",'"+desc+"')";
      con = GetConnection.getConnection();
      
      // 3: Get statement object to execute sql query
      Statement st = con.createStatement();
    
      int x = st.executeUpdate(sql);
      if(x!=0)
        System.out.println("Record Inserted...");
      else
        System.out.println("Record Not Inserted...");
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
