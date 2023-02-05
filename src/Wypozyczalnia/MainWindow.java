
package Wypozyczalnia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainWindow extends javax.swing.JFrame {
    
    public static JFrame MainWindow;

    public JFrame GetLibrarianLogin() {
       return MainWindow;
    }
    
    public MainWindow() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnZobaczKlient = new javax.swing.JButton();
        btnWpyAuto = new javax.swing.JButton();
        btnOddajAuto = new javax.swing.JButton();
        btnDodajKlient = new javax.swing.JButton();
        btnZobaczKlient1 = new javax.swing.JButton();
        btnZobaczAuta = new javax.swing.JButton();
        btnWypAuta = new javax.swing.JButton();
        btnWyjscie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.darkGray);

        btnZobaczKlient.setBackground(java.awt.Color.gray);
        btnZobaczKlient.setText("Zobacz wypożyczalnie");
        btnZobaczKlient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZobaczKlientActionPerformed(evt);
            }
        });

        btnWpyAuto.setBackground(java.awt.Color.gray);
        btnWpyAuto.setText("Wypożycz auto");
        btnWpyAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWpyAutoActionPerformed(evt);
            }
        });

        btnOddajAuto.setBackground(java.awt.Color.gray);
        btnOddajAuto.setText("Oddaj auto");
        btnOddajAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOddajAutoActionPerformed(evt);
            }
        });

        btnDodajKlient.setBackground(java.awt.Color.gray);
        btnDodajKlient.setText("Dodaj klienta");
        btnDodajKlient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajKlientActionPerformed(evt);
            }
        });

        btnZobaczKlient1.setBackground(java.awt.Color.gray);
        btnZobaczKlient1.setText("Archiwum");
        btnZobaczKlient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZobaczKlient1ActionPerformed(evt);
            }
        });

        btnZobaczAuta.setBackground(java.awt.Color.gray);
        btnZobaczAuta.setText("Auta");
        btnZobaczAuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZobaczAutaActionPerformed(evt);
            }
        });

        btnWypAuta.setBackground(java.awt.Color.gray);
        btnWypAuta.setText("Łączenie tabel");
        btnWypAuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWypAutaActionPerformed(evt);
            }
        });

        btnWyjscie.setBackground(java.awt.Color.gray);
        btnWyjscie.setText("Wyjście");
        btnWyjscie.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnWyjscie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWyjscieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnWyjscie, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnWypAuta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnZobaczAuta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnZobaczKlient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnZobaczKlient1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDodajKlient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOddajAuto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnWpyAuto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnWpyAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOddajAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDodajKlient, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnZobaczKlient1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnZobaczKlient, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnZobaczAuta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnWypAuta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnWyjscie, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWpyAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWpyAutoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        WpozyczAuto.main(new String[] {});
    }//GEN-LAST:event_btnWpyAutoActionPerformed

    private void btnOddajAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOddajAutoActionPerformed
        // TODO add your handling code here:
       this.setVisible(false);
        ZwrocAuto.main(new String[]{});
    }//GEN-LAST:event_btnOddajAutoActionPerformed

    private void btnWyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWyjscieActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_btnWyjscieActionPerformed

    private void btnDodajKlientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajKlientActionPerformed
        // TODO add your handling code hereer
        this.setVisible(false);
        DodajKlienta.main(new String[]{});
    }//GEN-LAST:event_btnDodajKlientActionPerformed

    private void btnWypAutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWypAutaActionPerformed
        // TODO add your handling code here:
        Wyszukiwanie.main(new String[]{});
    }//GEN-LAST:event_btnWypAutaActionPerformed

    private void btnZobaczKlientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZobaczKlientActionPerformed
        // TODO add your handling code here:
        wypozyczalnia.main(new String[]{});
    }//GEN-LAST:event_btnZobaczKlientActionPerformed

    private void btnZobaczAutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZobaczAutaActionPerformed
        // TODO add your handling code here:

        Auta.main(new String[] {});
    }//GEN-LAST:event_btnZobaczAutaActionPerformed

    private void btnZobaczKlient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZobaczKlient1ActionPerformed
        Archiwum.main(new String[]{});
    }//GEN-LAST:event_btnZobaczKlient1ActionPerformed

    public static void main(String args[]) {
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 
                MainWindow = new MainWindow();
                MainWindow.setTitle("Wypożyczalnia");
                MainWindow.setLocationRelativeTo(null);
                MainWindow.setVisible(true);
                DB db = new DB();
                
        try (Connection Con = DB.getConnection()) {
            PreparedStatement ps = Con.prepareStatement("call arh();", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ps.executeQuery();

            PreparedStatement ps2 = Con.prepareStatement("call arhdel();", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ps2.executeQuery();
            Con.close();
            PreparedStatement ps3 = Con.prepareStatement("call procedura();", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ps3.executeQuery();
            Con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

            }
        });

        
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajKlient;
    private javax.swing.JButton btnOddajAuto;
    private javax.swing.JButton btnWpyAuto;
    private javax.swing.JButton btnWyjscie;
    private javax.swing.JButton btnWypAuta;
    private javax.swing.JButton btnZobaczAuta;
    private javax.swing.JButton btnZobaczKlient;
    private javax.swing.JButton btnZobaczKlient1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
