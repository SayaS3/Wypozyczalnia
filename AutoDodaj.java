package Wypozyczalnia;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AutoDodaj {


  
    public static int ZapiszAuto(String id_auta, String Nr_rejestracyjny,String Model, String Marka, String Przebieg, String Ilosc_miejsc, 
            String Kolor, String Skrzynia_biegow, String Rodzaj_paliwa, String Kategoria_samochodu, String cena_za_h, 
            String Data_waznosci_przegladu, String Data_konca_ubezpieczenia, String Koszt_ubezpieczenia) {
            int status= 0;
        try(Connection con = DB.getConnection()) {
		PreparedStatement ps=con.prepareStatement("insert into samochody(ID_auta, `Nr_rejestracyjny`, Marka, Model, Przebieg, "
                        + "`Ilosc_miejsc`, Kolor, `Skrzynia_biegow`, `Rodzaj_paliwa`, `Kategoria_samochodu`, `cena_za_h`, `Data_waznosci_przegladu`, `Data_konca_ubezpieczenia`, `Koszt_ubezpieczenia`, `Czy_dostepne`) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,id_auta);
                ps.setString(2,Nr_rejestracyjny);
                ps.setString(3,Marka);
                ps.setString(4,Model);
                ps.setString(5,Przebieg);
                ps.setString(6,Ilosc_miejsc);
                ps.setString(7,Kolor);
                ps.setString(8,Skrzynia_biegow);
                ps.setString(9,Rodzaj_paliwa);
                ps.setString(10,Kategoria_samochodu);
                ps.setString(11,cena_za_h);
                ps.setString(12,Data_waznosci_przegladu);
                ps.setString(13,Data_konca_ubezpieczenia);
                ps.setString(14,Koszt_ubezpieczenia);
                ps.setInt(15, 1);
		status=ps.executeUpdate();
                con.close();
	}catch(Exception e){System.out.println(e);}
	return status;    
    }

    


    

            
    
 

}
