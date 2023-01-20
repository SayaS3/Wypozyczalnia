package Wypozyczalnia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.*;
import java.sql.DriverManager;
import java.util.Properties;
import javax.swing.table.TableRowSorter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.ArrayList;
import java.util.List;

public class Wyszukiwanie extends javax.swing.JFrame {

    public DefaultTableModel model;
static JFrame Wyszukiwanie;
    public Wyszukiwanie() throws SQLException {
        DB db = new DB();

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        initComponents();
        model = (DefaultTableModel) tabllBaza.getModel();

        try (Connection Con = DB.getConnection()) {
            PreparedStatement ps = Con.prepareStatement("SELECT samochody.ID_auta, samochody.Nr_rejestracyjny, samochody.Marka, samochody.Model, samochody.Przebieg, samochody.Ilosc_miejsc, samochody.Kolor, samochody.Skrzynia_biegow, samochody.Rodzaj_paliwa,samochody.Kategoria_samochodu, samochody.cena_za_h, samochody.Data_waznosci_przegladu, samochody.Data_konca_ubezpieczenia,samochody.`Koszt_ubezpieczenia`, `wypozyczalnia`.ID_wypozyczenia, `wypozyczalnia`.Data_godzina_wypozyczenia, `wypozyczalnia`.Termin_zwrotu, `wypozyczalnia`.Data_zwrotu, `wypozyczalnia`.Kaucja, `wypozyczalnia`.Czy_w_terminie, `wypozyczalnia`.Kara FROM samochody INNER JOIN wypozyczalnia ON `wypozyczalnia`.ID_auta = `samochody`.ID_auta", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int colnum = rsmd.getColumnCount();
            String[] Row = new String[colnum];
            tabllBaza.setAutoCreateRowSorter(true);
            while (rs.next()) {
                for (int i = 1; i <= colnum; i++) {
                    Row[i - 1] = rs.getString(i);
                }
                
                model.addRow(Row);
                tabllBaza.getColumn("ID_auta").setMinWidth(0);
                tabllBaza.getColumn("ID_auta").setMaxWidth(0);
                tabllBaza.getColumn("ID_auta").setWidth(0);
                tabllBaza.getColumn("ID_auta").setPreferredWidth(0);
                tabllBaza.getColumn("Nr_rejestracyjny").setMinWidth(0);
                tabllBaza.getColumn("Nr_rejestracyjny").setMaxWidth(0);
                tabllBaza.getColumn("Nr_rejestracyjny").setWidth(0);
                tabllBaza.getColumn("Nr_rejestracyjny").setPreferredWidth(0);
                tabllBaza.getColumn("Model").setMinWidth(0);
                tabllBaza.getColumn("Model").setMaxWidth(0);
                tabllBaza.getColumn("Model").setWidth(0);
                tabllBaza.getColumn("Model").setPreferredWidth(0);
                tabllBaza.getColumn("Marka").setMinWidth(0);
                tabllBaza.getColumn("Marka").setMaxWidth(0);
                tabllBaza.getColumn("Marka").setWidth(0);
                tabllBaza.getColumn("Marka").setPreferredWidth(0);
                tabllBaza.getColumn("Przebieg").setMinWidth(0);
                tabllBaza.getColumn("Przebieg").setMaxWidth(0);
                tabllBaza.getColumn("Przebieg").setWidth(0);
                tabllBaza.getColumn("Przebieg").setPreferredWidth(0);
                tabllBaza.getColumn("Ilosc_miejsc").setMinWidth(0);
                tabllBaza.getColumn("Ilosc_miejsc").setMaxWidth(0);
                tabllBaza.getColumn("Ilosc_miejsc").setWidth(0);
                tabllBaza.getColumn("Ilosc_miejsc").setPreferredWidth(0);
                tabllBaza.getColumn("Kolor").setMinWidth(0);
                tabllBaza.getColumn("Kolor").setMaxWidth(0);
                tabllBaza.getColumn("Kolor").setWidth(0);    
                tabllBaza.getColumn("Kolor").setPreferredWidth(0);
                tabllBaza.getColumn("Skrzynia_biegow").setMinWidth(0);
                tabllBaza.getColumn("Skrzynia_biegow").setMaxWidth(0);
                tabllBaza.getColumn("Skrzynia_biegow").setWidth(0);
                tabllBaza.getColumn("Skrzynia_biegow").setPreferredWidth(0);
                tabllBaza.getColumn("Rodzaj_paliwa").setMinWidth(0);
                tabllBaza.getColumn("Rodzaj_paliwa").setMaxWidth(0);
                tabllBaza.getColumn("Rodzaj_paliwa").setWidth(0);
                tabllBaza.getColumn("Rodzaj_paliwa").setPreferredWidth(0);
                tabllBaza.getColumn("Kategoria_samochodu").setMinWidth(0);
                tabllBaza.getColumn("Kategoria_samochodu").setMaxWidth(0);
                tabllBaza.getColumn("Kategoria_samochodu").setWidth(0);
                tabllBaza.getColumn("Kategoria_samochodu").setPreferredWidth(0);
                tabllBaza.getColumn("cena_za_h").setMinWidth(0);
                tabllBaza.getColumn("cena_za_h").setMaxWidth(0);
                tabllBaza.getColumn("cena_za_h").setWidth(0);
                tabllBaza.getColumn("cena_za_h").setPreferredWidth(0);
                tabllBaza.getColumn("Data_waznosci_przegladu").setMinWidth(0);
                tabllBaza.getColumn("Data_waznosci_przegladu").setMaxWidth(0);
                tabllBaza.getColumn("Data_waznosci_przegladu").setWidth(0);
                tabllBaza.getColumn("Data_waznosci_przegladu").setPreferredWidth(0);
                tabllBaza.getColumn("Data_konca_ubezpieczenia").setMinWidth(0);
                tabllBaza.getColumn("Data_konca_ubezpieczenia").setMaxWidth(0);
                tabllBaza.getColumn("Data_konca_ubezpieczenia").setWidth(0);
                tabllBaza.getColumn("Data_konca_ubezpieczenia").setPreferredWidth(0);
                tabllBaza.getColumn("Koszt_ubezpieczenia").setMinWidth(0);
                tabllBaza.getColumn("Koszt_ubezpieczenia").setMaxWidth(0);
                tabllBaza.getColumn("Koszt_ubezpieczenia").setWidth(0);
                tabllBaza.getColumn("Koszt_ubezpieczenia").setPreferredWidth(0);
                tabllBaza.getColumn("ID_wypozyczenia").setMinWidth(0);
                tabllBaza.getColumn("ID_wypozyczenia").setMaxWidth(0);
                tabllBaza.getColumn("ID_wypozyczenia").setWidth(0);
                tabllBaza.getColumn("ID_wypozyczenia").setPreferredWidth(0);
                tabllBaza.getColumn("Data_godzina_wypozyczenia").setMinWidth(0);
                tabllBaza.getColumn("Data_godzina_wypozyczenia").setMaxWidth(0);
                tabllBaza.getColumn("Data_godzina_wypozyczenia").setWidth(0);
                tabllBaza.getColumn("Data_godzina_wypozyczenia").setPreferredWidth(0);
                tabllBaza.getColumn("Termin_zwrotu").setMinWidth(0);
                tabllBaza.getColumn("Termin_zwrotu").setMaxWidth(0);
                tabllBaza.getColumn("Termin_zwrotu").setWidth(0);
                tabllBaza.getColumn("Termin_zwrotu").setPreferredWidth(0);
                tabllBaza.getColumn("Data_zwrotu").setMinWidth(0);
                tabllBaza.getColumn("Data_zwrotu").setMaxWidth(0);
                tabllBaza.getColumn("Data_zwrotu").setWidth(0);
                tabllBaza.getColumn("Data_zwrotu").setPreferredWidth(0);
                tabllBaza.getColumn("Kaucja").setMinWidth(0);
                tabllBaza.getColumn("Kaucja").setMaxWidth(0);
                tabllBaza.getColumn("Kaucja").setWidth(0);
                tabllBaza.getColumn("Kaucja").setPreferredWidth(0);
                tabllBaza.getColumn("Czy_w_terminie").setMinWidth(0);
                tabllBaza.getColumn("Czy_w_terminie").setMaxWidth(0);
                tabllBaza.getColumn("Czy_w_terminie").setWidth(0);
                tabllBaza.getColumn("Czy_w_terminie").setPreferredWidth(0);
                tabllBaza.getColumn("Kara").setMinWidth(0);
                tabllBaza.getColumn("Kara").setMaxWidth(0);
                tabllBaza.getColumn("Kara").setWidth(0);
                tabllBaza.getColumn("Kara").setPreferredWidth(0);
                doLayout();
            }
            Con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jCheckBox11 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabllBaza = new javax.swing.JTable();
        btnWyjscie = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        KategoriaSamochoduBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        CenaZaHBox = new javax.swing.JComboBox<>();
        SzukajButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ModelBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IloscMiejscBox = new javax.swing.JComboBox<>();
        KolorBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SkrzyniaBiegowBox = new javax.swing.JComboBox<>();
        MarkaBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        RodzajPaliwaBox = new javax.swing.JComboBox<>();
        ExportToExcelButton = new javax.swing.JButton();

        jScrollPane2.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabllBaza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "ID_auta", "Nr_rejestracyjny", "Marka", "Model", "Przebieg", "Ilosc_miejsc", "Kolor", "Skrzynia_biegow", "Rodzaj_paliwa", "Kategoria_samochodu", "cena_za_h", "Data_waznosci_przegladu", "Data_konca_ubezpieczenia", "Koszt_ubezpieczenia", "ID_wypozyczenia", "Data_godzina_wypozyczenia", "Termin_zwrotu", "Data_zwrotu", "Kaucja", "Czy_w_terminie", "Kara"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false,false, false, false, false, false,false, false, false, false, false,false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabllBaza);

        btnWyjscie.setText("Wyjście");
        btnWyjscie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWyjscieActionPerformed(evt);
            }
        });

        jLabel1.setText("Samochody");

        jLabel2.setText("Wypozyczalnia");

        jRadioButton1.setText("ID_auta");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Marka");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("Przebieg");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setText("Ilosc_miejsc");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton7.setText("Kolor");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton8.setText("Kategoria_samochodu");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jRadioButton9.setText("cena_za_h");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        jRadioButton10.setText("Data_waznosci_przegladu");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        jRadioButton11.setText("Skrzynia_biegow");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Nr_rejestracyjny");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Model");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton12.setText("Rodzaj_paliwa");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        jRadioButton13.setText("ID_wypozyczenia");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });

        jRadioButton14.setText("Data_zwrotu");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });

        jRadioButton15.setText("Kaucja");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });

        jRadioButton16.setText("Czy_w_terminie");
        jRadioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton16ActionPerformed(evt);
            }
        });

        jRadioButton17.setText("Data_godzina_wypozyczenia");
        jRadioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton17ActionPerformed(evt);
            }
        });

        jRadioButton18.setText("Termin_zwrotu");
        jRadioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton18ActionPerformed(evt);
            }
        });

        jRadioButton19.setText("Kara");
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });

        jRadioButton25.setText("Data_konca_ubezpieczenia");
        jRadioButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton25ActionPerformed(evt);
            }
        });

        jRadioButton26.setText("Koszt_ubezpieczenia");
        jRadioButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton26ActionPerformed(evt);
            }
        });

        jLabel9.setText("Kategoria_samochodu:");

        KategoriaSamochoduBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<wybierz>", "duzy", "kombi", "maly", "minivan", "premium", "sredni", "SUV" }));
        KategoriaSamochoduBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KategoriaSamochoduBoxActionPerformed(evt);
            }
        });

        jLabel10.setText("cena_za_h:");

        CenaZaHBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<wybierz>", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46",  "47", "48", "49", "50"  }));

        SzukajButton.setText("Szukaj");
        SzukajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SzukajButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Marka:");

        jLabel5.setText("Model:");

        jLabel6.setText("Ilosc_miejsc:");

        IloscMiejscBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<wybierz>", "2", "4" }));

        KolorBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<wybierz>", "bezowy", "bialy", "brazowy", "czarny", "czerwony", "niebieski", "pomaranczowy", "srebny", "szary", "zielony" }));

        jLabel7.setText("Kolor:");

        jLabel8.setText("Skrzynia biegów:");

        SkrzyniaBiegowBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<wybierz>", "manualna", "automatyczna"}));

        MarkaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<wybierz>", "Aston Martin","Audi", "BMW", "Ford", "Honda", "Jeep", "Kia", "Mazda", "Mercedes-Benz", "Porsche", "Toyota", "Volkswagen"   }));
        MarkaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarkaBoxActionPerformed(evt);
            }
        });

        jLabel11.setText("Rodzaj_paliwa:");

        RodzajPaliwaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<wybierz>", "benzyna", "LPG", "olej napedowy" }));

        ExportToExcelButton.setText("Export to Excel");
        ExportToExcelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportToExcelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnWyjscie)
                        .addContainerGap(1378, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SzukajButton)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(KolorBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MarkaBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IloscMiejscBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(SkrzyniaBiegowBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)
                                        .addComponent(RodzajPaliwaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                    .addComponent(KategoriaSamochoduBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CenaZaHBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ModelBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton2)
                                            .addComponent(jRadioButton1)
                                            .addComponent(jRadioButton3)
                                            .addComponent(jRadioButton4)
                                            .addComponent(jRadioButton5)
                                            .addComponent(jRadioButton6)
                                            .addComponent(jRadioButton7)
                                            .addComponent(jRadioButton25)
                                            .addComponent(jRadioButton12)
                                            .addComponent(jRadioButton8)
                                            .addComponent(jRadioButton9)
                                            .addComponent(jRadioButton10)
                                            .addComponent(jRadioButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton11)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel1)
                                        .addGap(90, 90, 90)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(163, 163, 163)
                                        .addComponent(jRadioButton13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(163, 163, 163)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton18)
                                            .addComponent(jRadioButton17)
                                            .addComponent(jRadioButton14)
                                            .addComponent(jRadioButton15)
                                            .addComponent(jRadioButton16)
                                            .addComponent(jRadioButton19))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane1)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ExportToExcelButton)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MarkaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton2)
                                .addComponent(jRadioButton17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ModelBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IloscMiejscBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(KolorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SkrzyniaBiegowBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RodzajPaliwaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(KategoriaSamochoduBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CenaZaHBox, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SzukajButton)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton15)
                                    .addComponent(jRadioButton5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton6)
                                    .addComponent(jRadioButton16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton7)
                                    .addComponent(jRadioButton19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton12)
                                .addGap(10, 10, 10)
                                .addComponent(jRadioButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(162, 162, 162))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ExportToExcelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnWyjscie)
                        .addContainerGap())))
        );

        ModelBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<wybierz>", "190E", "5000S", "500SEL", "626", "745", "929", "Accord", "Avalon", "Boxster", "Cherokee", "Coupe GT", "E350", "Explorer", "F-Series","F-Series Super Duty", "F150", "Forte", "Jetta", "Miata-MX-5", "Milenia", "MX-5", "New Beetle", "Odyssey", "Ranger", "rio", "riolet", "RS4", "RX-8", "S8", "SL-Class", "Taurus X", "Tercel", "Vantage", "X5 M"  }));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWyjscieActionPerformed
        // TODO add your handling code hereset
        this.dispose();
    }//GEN-LAST:event_btnWyjscieActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed

    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed

    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
if(!jRadioButton1.isSelected()){
          tabllBaza.getColumn("ID_auta").setMinWidth(0);
            tabllBaza.getColumn("ID_auta").setMaxWidth(0);
            tabllBaza.getColumn("ID_auta").setWidth(0);
            tabllBaza.getColumn("ID_auta").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 50;
            tabllBaza.getColumn("ID_auta").setMinWidth(5);
                tabllBaza.getColumn("ID_auta").setMaxWidth(width);
                tabllBaza.getColumn("ID_auta").setWidth(width);
                tabllBaza.getColumn("ID_auta").setPreferredWidth(width);
                doLayout();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
       if(!jRadioButton2.isSelected()){
          tabllBaza.getColumn("Nr_rejestracyjny").setMinWidth(0);
            tabllBaza.getColumn("Nr_rejestracyjny").setMaxWidth(0);
            tabllBaza.getColumn("Nr_rejestracyjny").setWidth(0);
            tabllBaza.getColumn("Nr_rejestracyjny").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 70;
            tabllBaza.getColumn("Nr_rejestracyjny").setMinWidth(5);
                tabllBaza.getColumn("Nr_rejestracyjny").setMaxWidth(width);
                tabllBaza.getColumn("Nr_rejestracyjny").setWidth(width);
                tabllBaza.getColumn("Nr_rejestracyjny").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
      if(!jRadioButton3.isSelected()){
          tabllBaza.getColumn("Model").setMinWidth(0);
            tabllBaza.getColumn("Model").setMaxWidth(0);
            tabllBaza.getColumn("Model").setWidth(0);
            tabllBaza.getColumn("Model").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 75;
            tabllBaza.getColumn("Model").setMinWidth(5);
                tabllBaza.getColumn("Model").setMaxWidth(width);
                tabllBaza.getColumn("Model").setWidth(width);
                tabllBaza.getColumn("Model").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
       if(!jRadioButton4.isSelected()){
          tabllBaza.getColumn("Marka").setMinWidth(0);
            tabllBaza.getColumn("Marka").setMaxWidth(0);
            tabllBaza.getColumn("Marka").setWidth(0);
            tabllBaza.getColumn("Marka").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 100;
            tabllBaza.getColumn("Marka").setMinWidth(5);
                tabllBaza.getColumn("Marka").setMaxWidth(width);
                tabllBaza.getColumn("Marka").setWidth(width);
                tabllBaza.getColumn("Marka").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        if(!jRadioButton5.isSelected()){
          tabllBaza.getColumn("Przebieg").setMinWidth(0);
            tabllBaza.getColumn("Przebieg").setMaxWidth(0);
            tabllBaza.getColumn("Przebieg").setWidth(0);
            tabllBaza.getColumn("Przebieg").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 70;
            tabllBaza.getColumn("Przebieg").setMinWidth(5);
                tabllBaza.getColumn("Przebieg").setMaxWidth(width);
                tabllBaza.getColumn("Przebieg").setWidth(width);
                tabllBaza.getColumn("Przebieg").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        if(!jRadioButton6.isSelected()){
          tabllBaza.getColumn("Ilosc_miejsc").setMinWidth(0);
            tabllBaza.getColumn("Ilosc_miejsc").setMaxWidth(0);
            tabllBaza.getColumn("Ilosc_miejsc").setWidth(0);
            tabllBaza.getColumn("Ilosc_miejsc").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 70;
            tabllBaza.getColumn("Ilosc_miejsc").setMinWidth(5);
                tabllBaza.getColumn("Ilosc_miejsc").setMaxWidth(width);
                tabllBaza.getColumn("Ilosc_miejsc").setWidth(width);
                tabllBaza.getColumn("Ilosc_miejsc").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
     if(!jRadioButton7.isSelected()){
          tabllBaza.getColumn("Kolor").setMinWidth(0);
            tabllBaza.getColumn("Kolor").setMaxWidth(0);
            tabllBaza.getColumn("Kolor").setWidth(0);
            tabllBaza.getColumn("Kolor").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 80;
            tabllBaza.getColumn("Kolor").setMinWidth(5);
                tabllBaza.getColumn("Kolor").setMaxWidth(width);
                tabllBaza.getColumn("Kolor").setWidth(width);
                tabllBaza.getColumn("Kolor").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        if(!jRadioButton11.isSelected()){
          tabllBaza.getColumn("Skrzynia_biegow").setMinWidth(0);
            tabllBaza.getColumn("Skrzynia_biegow").setMaxWidth(0);
            tabllBaza.getColumn("Skrzynia_biegow").setWidth(0);
            tabllBaza.getColumn("Skrzynia_biegow").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 80;
            tabllBaza.getColumn("Skrzynia_biegow").setMinWidth(5);
                tabllBaza.getColumn("Skrzynia_biegow").setMaxWidth(width);
                tabllBaza.getColumn("Skrzynia_biegow").setWidth(width);
                tabllBaza.getColumn("Skrzynia_biegow").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        if(!jRadioButton12.isSelected()){
          tabllBaza.getColumn("Rodzaj_paliwa").setMinWidth(0);
            tabllBaza.getColumn("Rodzaj_paliwa").setMaxWidth(0);
            tabllBaza.getColumn("Rodzaj_paliwa").setWidth(0);
            tabllBaza.getColumn("Rodzaj_paliwa").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 80;
            tabllBaza.getColumn("Rodzaj_paliwa").setMinWidth(5);
                tabllBaza.getColumn("Rodzaj_paliwa").setMaxWidth(width);
                tabllBaza.getColumn("Rodzaj_paliwa").setWidth(width);
                tabllBaza.getColumn("Rodzaj_paliwa").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        if(!jRadioButton8.isSelected()){
          tabllBaza.getColumn("Kategoria_samochodu").setMinWidth(0);
            tabllBaza.getColumn("Kategoria_samochodu").setMaxWidth(0);
            tabllBaza.getColumn("Kategoria_samochodu").setWidth(0);
            tabllBaza.getColumn("Kategoria_samochodu").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 70;
            tabllBaza.getColumn("Kategoria_samochodu").setMinWidth(5);
                tabllBaza.getColumn("Kategoria_samochodu").setMaxWidth(width);
                tabllBaza.getColumn("Kategoria_samochodu").setWidth(width);
                tabllBaza.getColumn("Kategoria_samochodu").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        if(!jRadioButton9.isSelected()){
          tabllBaza.getColumn("cena_za_h").setMinWidth(0);
            tabllBaza.getColumn("cena_za_h").setMaxWidth(0);
            tabllBaza.getColumn("cena_za_h").setWidth(0);
            tabllBaza.getColumn("cena_za_h").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 40;
            tabllBaza.getColumn("cena_za_h").setMinWidth(5);
                tabllBaza.getColumn("cena_za_h").setMaxWidth(width);
                tabllBaza.getColumn("cena_za_h").setWidth(width);
                tabllBaza.getColumn("cena_za_h").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        if(!jRadioButton10.isSelected()){
          tabllBaza.getColumn("Data_waznosci_przegladu").setMinWidth(0);
            tabllBaza.getColumn("Data_waznosci_przegladu").setMaxWidth(0);
            tabllBaza.getColumn("Data_waznosci_przegladu").setWidth(0);
            tabllBaza.getColumn("Data_waznosci_przegladu").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 40;
            tabllBaza.getColumn("Data_waznosci_przegladu").setMinWidth(5);
                tabllBaza.getColumn("Data_waznosci_przegladu").setMaxWidth(width);
                tabllBaza.getColumn("Data_waznosci_przegladu").setWidth(width);
                tabllBaza.getColumn("Data_waznosci_przegladu").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton25ActionPerformed
        if(!jRadioButton25.isSelected()){
          tabllBaza.getColumn("Data_konca_ubezpieczenia").setMinWidth(0);
            tabllBaza.getColumn("Data_konca_ubezpieczenia").setMaxWidth(0);
            tabllBaza.getColumn("Data_konca_ubezpieczenia").setWidth(0);
            tabllBaza.getColumn("Data_konca_ubezpieczenia").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 40;
            tabllBaza.getColumn("Data_konca_ubezpieczenia").setMinWidth(5);
                tabllBaza.getColumn("Data_konca_ubezpieczenia").setMaxWidth(width);
                tabllBaza.getColumn("Data_konca_ubezpieczenia").setWidth(width);
                tabllBaza.getColumn("Data_konca_ubezpieczenia").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton25ActionPerformed

    private void jRadioButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton26ActionPerformed
        if(!jRadioButton26.isSelected()){
          tabllBaza.getColumn("Koszt_ubezpieczenia").setMinWidth(0);
            tabllBaza.getColumn("Koszt_ubezpieczenia").setMaxWidth(0);
            tabllBaza.getColumn("Koszt_ubezpieczenia").setWidth(0);
            tabllBaza.getColumn("Koszt_ubezpieczenia").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 40;
            tabllBaza.getColumn("Koszt_ubezpieczenia").setMinWidth(5);
                tabllBaza.getColumn("Koszt_ubezpieczenia").setMaxWidth(width);
                tabllBaza.getColumn("Koszt_ubezpieczenia").setWidth(width);
                tabllBaza.getColumn("Koszt_ubezpieczenia").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton26ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        if(!jRadioButton13.isSelected()){
          tabllBaza.getColumn("ID_wypozyczenia").setMinWidth(0);
            tabllBaza.getColumn("ID_wypozyczenia").setMaxWidth(0);
            tabllBaza.getColumn("ID_wypozyczenia").setWidth(0);
            tabllBaza.getColumn("ID_wypozyczenia").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 40;
            tabllBaza.getColumn("ID_wypozyczenia").setMinWidth(5);
                tabllBaza.getColumn("ID_wypozyczenia").setMaxWidth(width);
                tabllBaza.getColumn("ID_wypozyczenia").setWidth(width);
                tabllBaza.getColumn("ID_wypozyczenia").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed
        if(!jRadioButton17.isSelected()){
          tabllBaza.getColumn("Data_godzina_wypozyczenia").setMinWidth(0);
            tabllBaza.getColumn("Data_godzina_wypozyczenia").setMaxWidth(0);
            tabllBaza.getColumn("Data_godzina_wypozyczenia").setWidth(0);
            tabllBaza.getColumn("Data_godzina_wypozyczenia").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 40;
            tabllBaza.getColumn("Data_godzina_wypozyczenia").setMinWidth(5);
                tabllBaza.getColumn("Data_godzina_wypozyczenia").setMaxWidth(width);
                tabllBaza.getColumn("Data_godzina_wypozyczenia").setWidth(width);
                tabllBaza.getColumn("Data_godzina_wypozyczenia").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed
        if(!jRadioButton18.isSelected()){
          tabllBaza.getColumn("Termin_zwrotu").setMinWidth(0);
            tabllBaza.getColumn("Termin_zwrotu").setMaxWidth(0);
            tabllBaza.getColumn("Termin_zwrotu").setWidth(0);
            tabllBaza.getColumn("Termin_zwrotu").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 40;
            tabllBaza.getColumn("Termin_zwrotu").setMinWidth(5);
                tabllBaza.getColumn("Termin_zwrotu").setMaxWidth(width);
                tabllBaza.getColumn("Termin_zwrotu").setWidth(width);
                tabllBaza.getColumn("Termin_zwrotu").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        if(!jRadioButton14.isSelected()){
          tabllBaza.getColumn("Data_zwrotu").setMinWidth(0);
            tabllBaza.getColumn("Data_zwrotu").setMaxWidth(0);
            tabllBaza.getColumn("Data_zwrotu").setWidth(0);
            tabllBaza.getColumn("Data_zwrotu").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 40;
            tabllBaza.getColumn("Data_zwrotu").setMinWidth(5);
                tabllBaza.getColumn("Data_zwrotu").setMaxWidth(width);
                tabllBaza.getColumn("Data_zwrotu").setWidth(width);
                tabllBaza.getColumn("Data_zwrotu").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        if(!jRadioButton15.isSelected()){
          tabllBaza.getColumn("Kaucja").setMinWidth(0);
            tabllBaza.getColumn("Kaucja").setMaxWidth(0);
            tabllBaza.getColumn("Kaucja").setWidth(0);
            tabllBaza.getColumn("Kaucja").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 40;
            tabllBaza.getColumn("Kaucja").setMinWidth(5);
                tabllBaza.getColumn("Kaucja").setMaxWidth(width);
                tabllBaza.getColumn("Kaucja").setWidth(width);
                tabllBaza.getColumn("Kaucja").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed
        if(!jRadioButton16.isSelected()){
          tabllBaza.getColumn("Czy_w_terminie").setMinWidth(0);
            tabllBaza.getColumn("Czy_w_terminie").setMaxWidth(0);
            tabllBaza.getColumn("Czy_w_terminie").setWidth(0);
            tabllBaza.getColumn("Czy_w_terminie").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 40;
            tabllBaza.getColumn("Czy_w_terminie").setMinWidth(5);
                tabllBaza.getColumn("Czy_w_terminie").setMaxWidth(width);
                tabllBaza.getColumn("Czy_w_terminie").setWidth(width);
                tabllBaza.getColumn("Czy_w_terminie").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton16ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        if(!jRadioButton19.isSelected()){
          tabllBaza.getColumn("Kara").setMinWidth(0);
            tabllBaza.getColumn("Kara").setMaxWidth(0);
            tabllBaza.getColumn("Kara").setWidth(0);
            tabllBaza.getColumn("Kara").setPreferredWidth(0);
            doLayout();
        }else {
            final int width = 40;
            tabllBaza.getColumn("Kara").setMinWidth(5);
                tabllBaza.getColumn("Kara").setMaxWidth(width);
                tabllBaza.getColumn("Kara").setWidth(width);
                tabllBaza.getColumn("Kara").setPreferredWidth(width);
                doLayout();
        }
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void SzukajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SzukajButtonActionPerformed
        final RowFilter<DefaultTableModel, Object> firstFilter = RowFilter.regexFilter(MarkaBox.getSelectedItem().toString(), 2);
        final RowFilter<DefaultTableModel, Object> secondFilter = RowFilter.regexFilter(ModelBox.getSelectedItem().toString(), 3);
        final RowFilter<DefaultTableModel, Object> thirdFilter = RowFilter.regexFilter(KolorBox.getSelectedItem().toString(), 6);
        final RowFilter<DefaultTableModel, Object> FourthFilter = RowFilter.regexFilter(IloscMiejscBox.getSelectedItem().toString(), 5);
        final RowFilter<DefaultTableModel, Object> FifthFilter = RowFilter.regexFilter(SkrzyniaBiegowBox.getSelectedItem().toString(), 7);
        final RowFilter<DefaultTableModel, Object> SixthFilter = RowFilter.regexFilter(RodzajPaliwaBox.getSelectedItem().toString(), 8);
        final RowFilter<DefaultTableModel, Object> SeventhFilter = RowFilter.regexFilter(KategoriaSamochoduBox.getSelectedItem().toString(), 9);
        final RowFilter<DefaultTableModel, Object> EigthFilter = RowFilter.regexFilter(CenaZaHBox.getSelectedItem().toString(), 10);
        final List<RowFilter<DefaultTableModel, Object>> filters = new ArrayList<RowFilter<DefaultTableModel, Object>>();
        if(ModelBox.getSelectedItem().toString() != "<wybierz>"){
            filters.add(secondFilter);
        }
        if(MarkaBox.getSelectedItem().toString() != "<wybierz>"){
            filters.add(firstFilter);
        }
        if(KolorBox.getSelectedItem().toString() != "<wybierz>"){
            filters.add(thirdFilter);
        }
        if(IloscMiejscBox.getSelectedItem().toString() != "<wybierz>"){
            filters.add(FourthFilter);
        }
        if(SkrzyniaBiegowBox.getSelectedItem().toString() != "<wybierz>"){
            filters.add(FifthFilter);
        }
        if(RodzajPaliwaBox.getSelectedItem().toString() != "<wybierz>"){
            filters.add(SixthFilter);
        }
        if(KategoriaSamochoduBox.getSelectedItem().toString() != "<wybierz>"){
            filters.add(SeventhFilter);
        }

        /* The row must match every filters */
        final RowFilter<DefaultTableModel, Object> compoundRowFilter = RowFilter.andFilter(filters);

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
        sorter.setRowFilter(compoundRowFilter);

        tabllBaza.setRowSorter(sorter);

    }//GEN-LAST:event_SzukajButtonActionPerformed

    private void MarkaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarkaBoxActionPerformed

    }//GEN-LAST:event_MarkaBoxActionPerformed
public void openFile(String file) {
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
    private void ExportToExcelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportToExcelButtonActionPerformed
        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();

            if (saveFile != null) {
                saveFile = new File(saveFile.toString() + ".xlsx");
                Workbook wb = new XSSFWorkbook();
                Sheet sheet = wb.createSheet("customer");

                Row rowCol = sheet.createRow(0);
                for (int i = 0; i < tabllBaza.getColumnCount(); i++) {
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(tabllBaza.getColumnName(i));
                }

                for (int j = 0; j < tabllBaza.getRowCount(); j++) {
                    Row row = sheet.createRow(j + 1);
                    for (int k = 0; k < tabllBaza.getColumnCount(); k++) {
                        Cell cell = row.createCell(k);
                        if (tabllBaza.getValueAt(j, k) != null) {
                            cell.setCellValue(tabllBaza.getValueAt(j, k).toString());
                        }
                    }
                }
                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                wb.write(out);
                wb.close();
                out.close();
                openFile(saveFile.toString());
            } else {
                JOptionPane.showMessageDialog(null, "Nie udało sie utworzyc pliku");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException io) {
            System.out.println(io);
        }
    }//GEN-LAST:event_ExportToExcelButtonActionPerformed

    private void KategoriaSamochoduBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KategoriaSamochoduBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KategoriaSamochoduBoxActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Wyszukiwanie = new Wyszukiwanie();
                    Wyszukiwanie.setLocationRelativeTo(null);
                    Wyszukiwanie.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Wyszukiwanie.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CenaZaHBox;
    private javax.swing.JButton ExportToExcelButton;
    private javax.swing.JComboBox<String> IloscMiejscBox;
    private javax.swing.JComboBox<String> KategoriaSamochoduBox;
    private javax.swing.JComboBox<String> KolorBox;
    private javax.swing.JComboBox<String> MarkaBox;
    private javax.swing.JComboBox<String> ModelBox;
    private javax.swing.JComboBox<String> RodzajPaliwaBox;
    private javax.swing.JComboBox<String> SkrzyniaBiegowBox;
    private javax.swing.JButton SzukajButton;
    private javax.swing.JButton btnWyjscie;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JTable tabllBaza;
    // End of variables declaration//GEN-END:variables

}
