
package Wypozyczalnia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Properties;
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
        btnDodajKlienta = new javax.swing.JButton();
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
        btnUsnKlienta = new javax.swing.JButton();

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

        btnDodajKlienta.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        btnDodajKlienta.setText("Dodaj klienta");
        btnDodajKlienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajKlientaActionPerformed(evt);
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

        btnUsnKlienta.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        btnUsnKlienta.setText("Usuń klienta");
        btnUsnKlienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsnKlientaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodajKlienta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUsnKlienta))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Nr_prawojazdy, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ID_klienta, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Imie_klienta, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nazwisko_klienta, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 214, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCofnij)
                .addGap(359, 359, 359))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodajKlienta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsnKlienta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnDodajKlientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajKlientaActionPerformed
        // TODO add your handling code here:
             String ID_klienta1 = ID_klienta.getText();
             String Nr_prawojazdy1 = Nr_prawojazdy.getText();
             String Imie_klienta1 = Imie_klienta.getText();
             String Nazwisko_klienta1= Nazwisko_klienta.getText();
       
                
                if(Klient.DodajKlienta(ID_klienta1,Nr_prawojazdy1,Imie_klienta1, Nazwisko_klienta1)!=0)
                {
                    JOptionPane.showMessageDialog(DodajKlienta.this, "Dodano klienta!","Powodzenie!", JOptionPane.ERROR_MESSAGE);
                    ID_klienta.setText("");
                    Nr_prawojazdy.setText("");
                    Imie_klienta.setText("");
                    Nazwisko_klienta.setText("");
                }
                else
                       JOptionPane.showMessageDialog(DodajKlienta.this, "Błąd podczas dodawania klienta, ID_klienta musi być unikalne!","Niepowodzenie!", JOptionPane.ERROR_MESSAGE);
   
    }//GEN-LAST:event_btnDodajKlientaActionPerformed

    private void Nr_prawojazdyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nr_prawojazdyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nr_prawojazdyActionPerformed

    private void Imie_klientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imie_klientaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Imie_klientaActionPerformed

    private void btnUsnKlientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsnKlientaActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Czy napewno chcesz usunąć tego klienta?", "Wybierz opcje", JOptionPane.YES_NO_OPTION);
        int column = 0;
        int selectedRow = klientTabela.getSelectedRow();
        String value = klientTabela.getModel().getValueAt(selectedRow, column).toString();
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
                        String sql = "delete from klient where id_klienta=?";
                        PreparedStatement pstmt = con.prepareStatement(sql);
                        pstmt.setInt(1, Integer.parseInt(value));
                        pstmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Klient został usunięty!");

                        model.removeRow(klientTabela.getSelectedRow());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }

                }
            }
        }
    }//GEN-LAST:event_btnUsnKlientaActionPerformed

    
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
    private javax.swing.JButton btnDodajKlienta;
    private javax.swing.JButton btnUsnKlienta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable klientTabela;
    // End of variables declaration//GEN-END:variables

   
}
