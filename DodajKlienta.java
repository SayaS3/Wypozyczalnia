
package Wypozyczalnia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DodajKlienta extends javax.swing.JFrame {
    static JFrame DodajKlienta;
public DefaultTableModel model;
    public DodajKlienta() {
        DB db = new DB();

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        initComponents();
        model = (DefaultTableModel) klientTabela.getModel();

        try (Connection Con = DB.getConnection()) {
            PreparedStatement ps = Con.prepareStatement("select * from klient", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int colnum = rsmd.getColumnCount();
            String[] Row = new String[colnum];
            klientTabela.setAutoCreateRowSorter(true);
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
        
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ID_klienta = new javax.swing.JTextField();
        btnDodajCzyt = new javax.swing.JButton();
        btnCofnij = new javax.swing.JButton();
        Nazwisko_klienta = new javax.swing.JTextField();
        Nr_prawojazdy = new javax.swing.JTextField();
        Imie_klienta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        klientTabela = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ID_klienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_klientaActionPerformed(evt);
            }
        });

        btnDodajCzyt.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        btnDodajCzyt.setText("Dodaj klienta");
        btnDodajCzyt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajCzytActionPerformed(evt);
            }
        });

        btnCofnij.setText("Cofnij");
        btnCofnij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCofnijActionPerformed(evt);
            }
        });

        Nazwisko_klienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nazwisko_klientaActionPerformed(evt);
            }
        });

        Nr_prawojazdy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nr_prawojazdyActionPerformed(evt);
            }
        });

        Imie_klienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imie_klientaActionPerformed(evt);
            }
        });

        jLabel1.setText("ID_klienta");

        jLabel2.setText("Nr_prawojazdy");

        jLabel3.setText("Imie_klienta");

        jLabel4.setText("Nazwisko_klienta");

        klientTabela.setModel(new javax.swing.table.DefaultTableModel(
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
        });
        jScrollPane1.setViewportView(klientTabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nr_prawojazdy, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID_klienta, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Imie_klienta, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nazwisko_klienta, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 250, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(382, 382, 382)
                                .addComponent(btnCofnij))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(346, 346, 346)
                                .addComponent(btnDodajCzyt)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_klienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nr_prawojazdy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Imie_klienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nazwisko_klienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnDodajCzyt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCofnij)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ID_klientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_klientaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_klientaActionPerformed

    private void btnCofnijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCofnijActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MainWindow.MainWindow.setVisible(true);
    }//GEN-LAST:event_btnCofnijActionPerformed

    private void Nazwisko_klientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nazwisko_klientaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nazwisko_klientaActionPerformed

    private void btnDodajCzytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajCzytActionPerformed
        // TODO add your handling code here:
             String ID_klienta1 = ID_klienta.getText();
             String Nr_prawojazdy1 = Nr_prawojazdy.getText();
             String Imie_klienta1 = Imie_klienta.getText();
             String Nazwisko_klienta1= Nazwisko_klienta.getText();
       
                
                if(KlientDodaj.DodajCzyt(ID_klienta1,Nr_prawojazdy1,Imie_klienta1, Nazwisko_klienta1)!=0)
                {
                    JOptionPane.showMessageDialog(DodajKlienta.this, "Dodano klienta!","Powodzenie!", JOptionPane.ERROR_MESSAGE);
                    ID_klienta.setText("");
                    Nr_prawojazdy.setText("");
                    Imie_klienta.setText("");
                    Nazwisko_klienta.setText("");
                }
                else
                       JOptionPane.showMessageDialog(DodajKlienta.this, "Błąd podczas dodawania klienta","Niepowodzenie!", JOptionPane.ERROR_MESSAGE);
   
    }//GEN-LAST:event_btnDodajCzytActionPerformed

    private void Nr_prawojazdyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nr_prawojazdyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nr_prawojazdyActionPerformed

    private void Imie_klientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imie_klientaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Imie_klientaActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DodajKlienta = new DodajKlienta();
                DodajKlienta.setLocationRelativeTo(null);
                DodajKlienta.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_klienta;
    private javax.swing.JTextField Imie_klienta;
    private javax.swing.JTextField Nazwisko_klienta;
    private javax.swing.JTextField Nr_prawojazdy;
    private javax.swing.JButton btnCofnij;
    private javax.swing.JButton btnDodajCzyt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable klientTabela;
    // End of variables declaration//GEN-END:variables

   
}
