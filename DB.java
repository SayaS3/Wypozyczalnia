
package Wypozyczalnia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
    

	public static Connection getConnection(){
		Connection con=null;
		try{
                            Properties props = new Properties(); 
    props.put("user", "root");         
    props.put("password", "1234");
    props.put("useUnicode", "true");
    props.put("useServerPrepStmts", "false");
    props.put("characterEncoding", "UTF-8"); 

			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/wypozyczalnia3_1?allowLoadLocalInfile=true",props);
		}catch(ClassNotFoundException | SQLException e){System.out.println(e);}
		return con;
	}

}