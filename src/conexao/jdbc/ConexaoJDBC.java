

package conexao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConexaoJDBC {

    public static void main(String[] args) {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/edetepbd";
            Connection con = DriverManager.getConnection(url, "edetep", "123");
            System.out.println("Con: "+con);
            Statement statement = con.createStatement();
            
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
}
