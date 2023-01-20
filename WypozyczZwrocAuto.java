package Wypozyczalnia;

import java.sql.*;
public class WypozyczZwrocAuto {
	
public static int WypozyczAuto(int wypozyczenieID, int AutoV, String IDate, String RDate, int Kaucja)
{
    int status =0;
    try{
        
        Connection con =DB.getConnection();
        PreparedStatement ps= con.prepareStatement("insert into wypozyczalnia values(?,?,?,?,?,?,?,?)");
        ps.setInt(1,wypozyczenieID);
        ps.setInt(2, AutoV);
        ps.setString(3,IDate);
        ps.setString(4,RDate);
        ps.setString(5,null);
        ps.setInt(6,Kaucja);
        ps.setInt(7, 1);
        ps.setInt(8, 0);
        status =ps.executeUpdate();
        con.close();
}catch(Exception e){System.out.println(e);}
    return status;
}

public static int WypozyczAutoUpdate(int AutoV){
    int status =0;
     try{
        Connection con =DB.getConnection();
        PreparedStatement ps= con.prepareStatement("update samochody SET Czy_dostepne=? WHERE ID_auta=?");
        ps.setInt(1,0);
        ps.setInt(2, AutoV);
        status =ps.executeUpdate();
        con.close();
}catch(Exception e){System.out.println(e);}
    return status;
   
}
public static int WypozyczeniaKlient(int wypozyczenieID, int klienta)
{
    int status =0;
    try{
        
        Connection con =DB.getConnection();
        PreparedStatement ps= con.prepareStatement("insert into wypozyczenie_klient values(?,?)");
        ps.setInt(1,wypozyczenieID);
        ps.setInt(2, klienta);
        status =ps.executeUpdate();
        con.close();
}catch(Exception e){System.out.println(e);}
    return status;
}
   
    public static int ZwrocAuto(int ID_wypozyczenia, String IFDate)
{
    int status =0;
    try{
        
        Connection con =DB.getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE wypozyczalnia SET Data_zwrotu=? WHERE ID_wypozyczenia=?");
        ps.setString(1,IFDate);
        ps.setInt(2, ID_wypozyczenia);
        status =ps.executeUpdate(); 
        con.close();
}catch(Exception e){System.out.println(e);}
    return status;
}     
   public static int ZwrocAuto2(int ID_wypozyczenia)
{
    int status =0;
    try{
        
        Connection con =DB.getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE samochody INNER JOIN wypozyczalnia  ON wypozyczalnia.ID_auta = samochody.ID_auta SET samochody.Czy_dostepne=1 WHERE ID_wypozyczenia=?");
        ps.setInt(1, ID_wypozyczenia);
        status =ps.executeUpdate(); 
        con.close();
}catch(Exception e){System.out.println(e);}
    return status;
}    
   }
    


