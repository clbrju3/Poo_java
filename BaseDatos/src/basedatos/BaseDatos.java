
package basedatos;
import java.sql.*;
public class BaseDatos {

    public static void main(String[] args) {
       try{
           String h="camisa";
       Connection x=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafeteria","root","M1t2o!B2rn1l");
       PreparedStatement y=x.prepareStatement("select codigo from prod where nombre=?;");
       y.setString(1,h);
       
       ResultSet gr=y.executeQuery();
       while (gr.next()){
           System.out.println(gr.getString(1));}
       }
       
       catch(Exception e){
       e.printStackTrace();}
    }
    
}
