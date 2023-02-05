
package Wypozyczalnia;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import static Wypozyczalnia.MainWindow.MainWindow;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class WpozyczAuto extends javax.swing.JFrame {
public DefaultTableModel model;
public static JFrame WpozyczAuto;
    public WpozyczAuto() {
        initComponents();
        int year;
        Calendar cal = Calendar.getInstance();
        year = cal.get(Calendar.YEAR);
        String TodayYear;
        TodayYear = String.valueOf(year);
        IYear.setText(TodayYear);
        String TodayMonth = String.valueOf(cal.get(Calendar.MONTH)+1);
        IMonth.setText(TodayMonth);
        String TodayDate = String.valueOf(cal.get(Calendar.DATE));
        IDate.setText(TodayDate);
        String TodayHour = String.valueOf(cal.get(Calendar.HOUR_OF_DAY));
        IHour.setText(TodayHour);
        String TodayMinutes = String.valueOf(cal.get(Calendar.MINUTE));
        IMinutes.setText(TodayMinutes);
        String TodaySeconds = String.valueOf(cal.get(Calendar.SECOND));
        ISeconds.setText(TodaySeconds);
        Calendar addcal = null;
        addcal = cal;
        addcal.add(Calendar.DAY_OF_YEAR,15);

        RDate.setText(String.valueOf(addcal.get(Calendar.DATE)));
        RMonth.setText(String.valueOf(addcal.get(Calendar.MONTH)+1));
        RYear.setText(String.valueOf(addcal.get(Calendar.YEAR)));
        RHour.setText(String.valueOf(addcal.get(Calendar.HOUR_OF_DAY)));
        RMinutes.setText(String.valueOf(addcal.get(Calendar.MINUTE)));
        RSeconds.setText(String.valueOf(addcal.get(Calendar.SECOND)));
        IHour.setText(String.valueOf(addcal.get(Calendar.HOUR_OF_DAY)));
        IMinutes.setText(String.valueOf(addcal.get(Calendar.MINUTE)));
        ISeconds.setText(String.valueOf(addcal.get(Calendar.SECOND)));
        DB db = new DB();

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
    
        model = (DefaultTableModel) klientTable.getModel();
    DefaultTableModel model2 = (DefaultTableModel) AutaTable.getModel();
        try (Connection Con = DB.getConnection()) {
            PreparedStatement ps = Con.prepareStatement("select * from klient", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int colnum = rsmd.getColumnCount();
            String[] Row = new String[colnum];
            klientTable.setAutoCreateRowSorter(true);
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
        
         try (Connection Con = DB.getConnection()) {
            PreparedStatement ps = Con.prepareStatement("select * from samochody WHERE Czy_dostepne=1", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int colnum = rsmd.getColumnCount();
            String[] Row = new String[colnum];
            AutaTable.setAutoCreateRowSorter(true);
            while (rs.next()) {
                for (int i = 1; i <= colnum; i++) {
                    Row[i - 1] = rs.getString(i);
                }
                model2.addRow(Row);
                
            }
            Con.close();
        } catch (Exception e) {
            System.out.println(e);
        }try (Connection Con = DB.getConnection()) {
            PreparedStatement ps = Con.prepareStatement("select count(*) from wypozyczalnia", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery();

      rs.next();
      int count = rs.getInt(1);
      int inkrementacja = count +1;
            Con.close();
            wypozyczenie_ID.setText(String.valueOf(inkrementacja));
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnWypozycz = new javax.swing.JButton();
        btnCofnij = new javax.swing.JButton();
        auto_ID = new javax.swing.JTextField();
        klient_ID = new javax.swing.JTextField();
        IMonth = new javax.swing.JTextField();
        RMonth = new javax.swing.JTextField();
        IYear = new javax.swing.JTextField();
        IDate = new javax.swing.JTextField();
        RYear = new javax.swing.JTextField();
        RDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AutaTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        klientTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        KaucjaField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        wypozyczenie_ID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        IMinutes = new javax.swing.JTextField();
        ISeconds = new javax.swing.JTextField();
        IHour = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        RMinutes = new javax.swing.JTextField();
        RSeconds = new javax.swing.JTextField();
        RHour = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(121, 22, 127));
        setForeground(new java.awt.Color(30, 51, 252));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel3.setText("Data Wypozyczenia");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel4.setText("Termin oddania");

        btnWypozycz.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        btnWypozycz.setText("Wypożycz");
        btnWypozycz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWypozyczActionPerformed(evt);
            }
        });

        btnCofnij.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnCofnij.setText("Cofnij");
        btnCofnij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCofnijActionPerformed(evt);
            }
        });

        auto_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auto_IDActionPerformed(evt);
            }
        });

        klient_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klient_IDActionPerformed(evt);
            }
        });

        IMonth.setEditable(false);
        IMonth.setBackground(new java.awt.Color(193, 193, 193));
        IMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMonthActionPerformed(evt);
            }
        });

        IYear.setEditable(false);
        IYear.setBackground(new java.awt.Color(193, 193, 193));

        IDate.setEditable(false);
        IDate.setBackground(new java.awt.Color(193, 193, 193));
        IDate.setToolTipText("");
        IDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDateActionPerformed(evt);
            }
        });

        RYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RYearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel5.setText("-");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel6.setText("-");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel7.setText("-");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel8.setText("-");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel9.setText("ID_wypozyczenia");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel10.setText("ID_klienta");

        AutaTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(AutaTable);

        klientTable.setModel((new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "ID_klienta", "Nr_prawojazdy", "Imie_klienta", "Nazwisko_klienta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        }));
        jScrollPane2.setViewportView(klientTable);

        jLabel1.setText("Dostępne auta: ");

        jLabel2.setText("klienci:");

        KaucjaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaucjaFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel11.setText("Kaucja");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel12.setText("ID_auta");

        IMinutes.setEditable(false);
        IMinutes.setBackground(new java.awt.Color(193, 193, 193));
        IMinutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMinutesActionPerformed(evt);
            }
        });

        ISeconds.setEditable(false);
        ISeconds.setBackground(new java.awt.Color(193, 193, 193));

        IHour.setEditable(false);
        IHour.setBackground(new java.awt.Color(193, 193, 193));
        IHour.setToolTipText("");
        IHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHourActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel13.setText(":");

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel14.setText(":");

        RSeconds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSecondsActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel17.setText(":");

        jLabel18.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel18.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(KaucjaField, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                                .addComponent(wypozyczenie_ID))
                            .addComponent(auto_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(klient_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnWypozycz, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(RDate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(RMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RYear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(IDate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(IMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(IYear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)))
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(IHour, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(IMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ISeconds, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RHour, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(RMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(544, 544, 544))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCofnij)
                .addGap(522, 522, 522))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(wypozyczenie_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(auto_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(klient_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KaucjaField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(IDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(IMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(IYear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(IHour, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(IMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(ISeconds, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(RMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(RYear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(RHour, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(RSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnWypozycz, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCofnij)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWypozyczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWypozyczActionPerformed
        int wypozyczenieID;
        wypozyczenieID= Integer.parseInt(wypozyczenie_ID.getText());
        int AutoV;
        AutoV = Integer.parseInt(auto_ID.getText());
        int IDklientaNV;
        IDklientaNV = Integer.parseInt(klient_ID.getText());
        int Kaucja;
        Kaucja=Integer.parseInt(KaucjaField.getText());
        String IFDate = IYear.getText() + "-"+IMonth.getText()+"-"+IDate.getText() + " " +IHour.getText() + ":"+ IMinutes.getText()+ ":" + ISeconds.getText();
        String RFDate = RYear.getText() + "-"+RMonth.getText()+"-"+RDate.getText() + " " +RHour.getText() + ":"+ RMinutes.getText()+ ":" + RSeconds.getText();;

            if(WypozyczZwrocAuto.WypozyczAuto(wypozyczenieID, AutoV, IFDate, RFDate, Kaucja)!=0 && WypozyczZwrocAuto.WypozyczeniaKlient(wypozyczenieID, IDklientaNV) !=0)
            {
                
                JOptionPane.showMessageDialog(null, "Auto zostało wypożyczone!");
                klient_ID.setText("");
                auto_ID.setText("");
                WypozyczZwrocAuto.WypozyczAutoUpdate(AutoV);
                
            }
            else{
              JOptionPane.showMessageDialog(WpozyczAuto.this, "Bład podczas wypożyczania auta! ID_wypozyczenia musi być unikalne a auto dostępne!","Niepowodzenie!", JOptionPane.ERROR_MESSAGE);
            }
            
            

    }//GEN-LAST:event_btnWypozyczActionPerformed

    private void btnCofnijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCofnijActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MainWindow.setVisible(true);
    }//GEN-LAST:event_btnCofnijActionPerformed

    private void auto_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auto_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_auto_IDActionPerformed

    private void IDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDateActionPerformed

    private void IMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IMonthActionPerformed

    private void RYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RYearActionPerformed

    private void klient_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klient_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_klient_IDActionPerformed

    private void KaucjaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaucjaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KaucjaFieldActionPerformed

    private void IMinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMinutesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IMinutesActionPerformed

    private void IHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IHourActionPerformed

    private void RSecondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSecondsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RSecondsActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               WpozyczAuto = new WpozyczAuto();
               WpozyczAuto.setLocationRelativeTo(null);
               WpozyczAuto.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AutaTable;
    private javax.swing.JTextField IDate;
    private javax.swing.JTextField IHour;
    private javax.swing.JTextField IMinutes;
    private javax.swing.JTextField IMonth;
    private javax.swing.JTextField ISeconds;
    private javax.swing.JTextField IYear;
    private javax.swing.JTextField KaucjaField;
    private javax.swing.JTextField RDate;
    private javax.swing.JTextField RHour;
    private javax.swing.JTextField RMinutes;
    private javax.swing.JTextField RMonth;
    private javax.swing.JTextField RSeconds;
    private javax.swing.JTextField RYear;
    private javax.swing.JTextField auto_ID;
    private javax.swing.JButton btnCofnij;
    private javax.swing.JButton btnWypozycz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable klientTable;
    private javax.swing.JTextField klient_ID;
    private javax.swing.JTextField wypozyczenie_ID;
    // End of variables declaration//GEN-END:variables
}
