
package Wypozyczalnia;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Klient {
    

    public static int DodajKlienta(String ID_klienta, String Nr_prawojazdy, String Imie_klienta, String Nazwisko_klienta) {

         int status =0;
         try{
        
            Connection con =DB.getConnection();
            PreparedStatement ps= con.prepareStatement("insert into klient(ID_klienta,Nr_prawojazdy,Imie_klienta,Nazwisko_klienta) values(?,?,?,?)");
            ps.setString(2,Nr_prawojazdy);
            ps.setString(1,ID_klienta);
            ps.setString(3,Imie_klienta);
            ps.setString(4,Nazwisko_klienta);
            status =ps.executeUpdate();
            con.close();
}catch(Exception e){System.out.println(e);}
    return status; 
    
    
    }

    
}
