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
import java.sql.Statement;
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

public class Auta extends javax.swing.JFrame {

    public DefaultTableModel model;
    public static JFrame Auta;
    public Auta() throws SQLException {
        DB db = new DB();

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        initComponents();
        model = (DefaultTableModel) tabllBaza.getModel();

        try (Connection Con = DB.getConnection()) {
            PreparedStatement ps = Con.prepareStatement("select * from samochody", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
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
        jLabelKsiazki = new javax.swing.JLabel();
        btnWyjscie = new javax.swing.JButton();
        AutoDodajPrzycisk = new javax.swing.JButton();
        ExportToExcelButton = new javax.swing.JButton();
        AutoUsunPrzycisk = new javax.swing.JButton();
        MarkaBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ModelBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        IloscMiejscBox = new javax.swing.JComboBox<>();
        KolorBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SkrzyniaBiegowBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        RodzajPaliwaBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        KategoriaSamochoduBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        CenaZaHBox = new javax.swing.JComboBox<>();
        SzukajButton = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        ImportFromExcelButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jScrollPane2.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabllBaza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "ID_auta", "Nr_rejestracyjny", "Marka", "Model", "Przebieg", "Ilosc_miejsc", "Kolor", "Skrzynia_biegow", "Rodzaj_paliwa", "Kategoria_samochodu", "cena_za_h"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false,
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabllBaza);

        jLabelKsiazki.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabelKsiazki.setText("Auta");

        btnWyjscie.setText("Wyjście");
        btnWyjscie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWyjscieActionPerformed(evt);
            }
        });

        AutoDodajPrzycisk.setText("Dodaj auto");
        AutoDodajPrzycisk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoDodajPrzyciskActionPerformed(evt);
            }
        });

        ExportToExcelButton.setText("Export to Excel");
        ExportToExcelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportToExcelButtonActionPerformed(evt);
            }
        });

        AutoUsunPrzycisk.setText("Usuń Auto");
        AutoUsunPrzycisk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoUsunPrzyciskActionPerformed(evt);
            }
        });

        MarkaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<wybierz>", "Aston Martin","Audi", "BMW", "Ford", "Honda", "Jeep", "Kia", "Mazda", "Mercedes-Benz", "Porsche", "Toyota", "Volkswagen"   }));
        MarkaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarkaBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Marka:");

        jLabel4.setText("Model:");

        jLabel5.setText("Ilosc_miejsc:");

        IloscMiejscBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<wybierz>", "2", "4" }));

        KolorBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<wybierz>", "bezowy", "bialy", "brazowy", "czarny", "czerwony", "niebieski", "pomaranczowy", "srebny", "szary", "zielony" }));

        jLabel6.setText("Kolor:");

        jLabel7.setText("Skrzynia biegów:");

        SkrzyniaBiegowBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<wybierz>", "manualna", "automatyczna"}));

        jLabel8.setText("Rodzaj_paliwa:");

        RodzajPaliwaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<wybierz>", "benzyna", "LPG", "olej napedowy" }));

        jLabel9.setText("Kategoria_samochodu:");

        KategoriaSamochoduBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<wybierz>", "duzy", "kombi", "maly", "minivan", "premium", "sredni", "SUV" }));

        jLabel10.setText("cena_za_h:");

        CenaZaHBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<wybierz>", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46",  "47", "48", "49", "50"  }));
        CenaZaHBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CenaZaHBoxActionPerformed(evt);
            }
        });

        SzukajButton.setText("Szukaj");
        SzukajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SzukajButtonActionPerformed(evt);
            }
        });

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("id_auta");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Nr_rejestracyjny");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Marka");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setSelected(true);
        jCheckBox4.setText("Model");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setSelected(true);
        jCheckBox5.setText("Przebieg");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setSelected(true);
        jCheckBox6.setText("ilosc miejsc");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setSelected(true);
        jCheckBox7.setText("Kolor");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setSelected(true);
        jCheckBox8.setText("Skrzynia biegów");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox10.setSelected(true);
        jCheckBox10.setText("Kategoria samochodu");
        jCheckBox10.setAutoscrolls(true);
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jCheckBox14.setSelected(true);
        jCheckBox14.setText("Cena za godzine");
        jCheckBox14.setAutoscrolls(true);
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        jCheckBox9.setSelected(true);
        jCheckBox9.setText("Rodzaj paliwa");
        jCheckBox9.setAutoscrolls(true);
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        ImportFromExcelButton.setText("Import from Excel");
        ImportFromExcelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportFromExcelButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Przeglady/ubezpieczenia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 78, Short.MAX_VALUE)
                                .addComponent(SzukajButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AutoUsunPrzycisk, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AutoDodajPrzycisk, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jCheckBox1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCheckBox2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCheckBox3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCheckBox5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox9))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelKsiazki)
                                    .addGap(279, 279, 279)
                                    .addComponent(ImportFromExcelButton)))
                            .addComponent(ExportToExcelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(KolorBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 114, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(MarkaBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ModelBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IloscMiejscBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(SkrzyniaBiegowBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(RodzajPaliwaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(KategoriaSamochoduBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(CenaZaHBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 483, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnWyjscie)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AutoDodajPrzycisk)
                    .addComponent(ExportToExcelButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImportFromExcelButton)
                    .addComponent(jLabelKsiazki, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AutoUsunPrzycisk)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MarkaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ModelBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IloscMiejscBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KolorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SkrzyniaBiegowBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RodzajPaliwaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(KategoriaSamochoduBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CenaZaHBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SzukajButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWyjscie)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox10))
                .addContainerGap())
        );

        ModelBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<wybierz>", "190E", "5000S", "500SEL", "626", "745", "929", "Accord", "Avalon", "Boxster", "Cherokee", "Coupe GT", "E350", "Explorer", "F-Series","F-Series Super Duty", "F150", "Forte", "Jetta", "Miata-MX-5", "Milenia", "MX-5", "New Beetle", "Odyssey", "Ranger", "rio", "riolet", "RS4", "RX-8", "S8", "SL-Class", "Taurus X", "Tercel", "Vantage", "X5 M"  }));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWyjscieActionPerformed
        // TODO add your handling code hereset
        this.dispose();
    }//GEN-LAST:event_btnWyjscieActionPerformed

    private void AutoDodajPrzyciskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoDodajPrzyciskActionPerformed
        this.setVisible(false);
        DodajAuto.main(new String[]{});
    }//GEN-LAST:event_AutoDodajPrzyciskActionPerformed

    private void AutoUsunPrzyciskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoUsunPrzyciskActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Czy napewno chcesz usunąć to auto?", "Wybierz opcje", JOptionPane.YES_NO_OPTION);
        int column = 0;
        int selectedRow = tabllBaza.getSelectedRow();
        String value = tabllBaza.getModel().getValueAt(selectedRow, column).toString();
        if (result == JOptionPane.OK_OPTION) {
            if (selectedRow >= 0) {
                if (value != null) {
                    try {
                      
                        Connection con = null;
                        Properties props = new Properties();
                        props.put("user", "root");
                        props.put("password", "kupa1234");
                        props.put("useUnicode", "true");
                        props.put("useServerPrepStmts", "false");
                        props.put("characterEncoding", "UTF-8");

                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wypozyczalnia3_1", props);
                        String sql = "delete from samochody where id_auta=?";
                        PreparedStatement pstmt = con.prepareStatement(sql);
                        pstmt.setInt(1, Integer.parseInt(value));
                        pstmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Auto zostało usunięte!");

                        model.removeRow(tabllBaza.getSelectedRow());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }

                }
            }
        }
    }//GEN-LAST:event_AutoUsunPrzyciskActionPerformed
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

    private void MarkaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarkaBoxActionPerformed

    }//GEN-LAST:event_MarkaBoxActionPerformed

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
        if(MarkaBox.getSelectedItem().toString() != "<wybierz>"){
        filters.add(firstFilter);
        }
        if(ModelBox.getSelectedItem().toString() != "<wybierz>"){
        filters.add(secondFilter);
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
       if(CenaZaHBox.getSelectedItem().toString() != "<wybierz>"){
        filters.add(EigthFilter);
        }
        
        /* The row must match every filters */
        final RowFilter<DefaultTableModel, Object> compoundRowFilter = RowFilter.andFilter(filters);

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
        sorter.setRowFilter(compoundRowFilter);

        tabllBaza.setRowSorter(sorter);


    }//GEN-LAST:event_SzukajButtonActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(!jCheckBox2.isSelected()){
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
        
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(!jCheckBox1.isSelected()){
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
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        if(!jCheckBox10.isSelected()){
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
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if(!jCheckBox3.isSelected()){
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
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if(!jCheckBox4.isSelected()){
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
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if(!jCheckBox5.isSelected()){
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
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        if(!jCheckBox6.isSelected()){
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
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        if(!jCheckBox7.isSelected()){
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
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        if(!jCheckBox8.isSelected()){
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
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        if(!jCheckBox14.isSelected()){
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
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        if(!jCheckBox9.isSelected()){
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
    }//GEN-LAST:event_jCheckBox9ActionPerformed
 private static DB db = new DB();
public static boolean importFromCSV(String path) {
         
        try{
            Statement statement = db.getConnection().createStatement();
            String query = "";
            query = "LOAD DATA LOCAL INFILE " + '"' + path + '"' + " " + "INTO TABLE samochody FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n' IGNORE 1 ROWS";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(Auta, "Zaimportowano!","Powodzenie", JOptionPane.ERROR_MESSAGE);
            return true;
        } catch(Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(Auta, "Błąd podczas dodawania danych! Sprawdz poprawnosc pliku!","Niepowodzenie", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    } 

    private void ImportFromExcelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportFromExcelButtonActionPerformed
           JFileChooser jFileChooser = new JFileChooser();
           jFileChooser.showOpenDialog(this);
           String importPath1 = jFileChooser.getSelectedFile().toString();
           String importPath = importPath1.replace("\\","/");
           importFromCSV(importPath);
        System.out.println(importPath);
        
    }//GEN-LAST:event_ImportFromExcelButtonActionPerformed

    private void CenaZaHBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CenaZaHBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CenaZaHBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        ubezpieczeniaiprzeglady.main(new String[]{});
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Auta = new Auta();
                    Auta.setLocationRelativeTo(null);
                    Auta.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Auta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AutoDodajPrzycisk;
    private javax.swing.JButton AutoUsunPrzycisk;
    private javax.swing.JComboBox<String> CenaZaHBox;
    private javax.swing.JButton ExportToExcelButton;
    private javax.swing.JComboBox<String> IloscMiejscBox;
    private javax.swing.JButton ImportFromExcelButton;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelKsiazki;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JTable tabllBaza;
    // End of variables declaration//GEN-END:variables

}
