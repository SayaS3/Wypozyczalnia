
package Wypozyczalnia;

import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ZwrocAuto extends javax.swing.JFrame {
static JFrame ZwrocAuto;
    public ZwrocAuto() {
        initComponents();
           Calendar cal = Calendar.getInstance();

        IDate.setText(String.valueOf(cal.get(Calendar.DATE)));
        IMonth.setText(String.valueOf(cal.get(Calendar.MONTH)+1));
        IYear.setText(String.valueOf(cal.get(Calendar.YEAR)));
        IHour.setText(String.valueOf(cal.get(Calendar.HOUR_OF_DAY)));
        IMinutes.setText(String.valueOf(cal.get(Calendar.MINUTE)));
        ISeconds.setText(String.valueOf(cal.get(Calendar.SECOND)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnZwroc = new javax.swing.JButton();
        btnCofnij = new javax.swing.JButton();
        zwrotID = new javax.swing.JTextField();
        IMonth = new javax.swing.JTextField();
        IYear = new javax.swing.JTextField();
        IDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IMinutes = new javax.swing.JTextField();
        ISeconds = new javax.swing.JTextField();
        IHour = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel1.setText("ID_wypozyczenia");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel4.setText("Data zwrotu");

        btnZwroc.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        btnZwroc.setText("Zwróć");
        btnZwroc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZwrocActionPerformed(evt);
            }
        });

        btnCofnij.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnCofnij.setText("Cofnij");
        btnCofnij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCofnijActionPerformed(evt);
            }
        });

        zwrotID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zwrotIDActionPerformed(evt);
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

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel5.setText("-");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel6.setText("-");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zwrotID, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(23, 23, 23)
                        .addComponent(IHour, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ISeconds, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCofnij, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnZwroc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(zwrotID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(IYear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IHour, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(IMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(ISeconds, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnZwroc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCofnij))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZwrocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZwrocActionPerformed
        // TODO add your handling code here:
        
        int ID_wypozyczenia;
        ID_wypozyczenia = Integer.parseInt(zwrotID.getText());
        String IFDate = IYear.getText() + "-"+IMonth.getText()+"-"+IDate.getText() + " " +IHour.getText() + ":"+ IMinutes.getText()+ ":" + ISeconds.getText();
        System.out.println(IFDate);

                   if(ID_wypozyczenia !=0)
                   {
                        WypozyczZwrocAuto.ZwrocAuto(ID_wypozyczenia,IFDate);
                        WypozyczZwrocAuto.ZwrocAuto2(ID_wypozyczenia);
                        JOptionPane.showMessageDialog(ZwrocAuto.this, "Auto zostalo zwrócone!","Powodzenie!", JOptionPane.ERROR_MESSAGE);
                        zwrotID.setText("");
                   }
                   else
                        JOptionPane.showMessageDialog(ZwrocAuto.this, "Błąd podczas zwracania auta!","Niepowodzenie!", JOptionPane.ERROR_MESSAGE);
                       
               
    }//GEN-LAST:event_btnZwrocActionPerformed

    private void btnCofnijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCofnijActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MainWindow.MainWindow.setVisible(true);
    }//GEN-LAST:event_btnCofnijActionPerformed

    private void zwrotIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zwrotIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zwrotIDActionPerformed

    private void IMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IMonthActionPerformed

    private void IDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDateActionPerformed

    private void IMinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMinutesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IMinutesActionPerformed

    private void IHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IHourActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ZwrocAuto= new ZwrocAuto();
                ZwrocAuto.setLocationRelativeTo(null);
                ZwrocAuto.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDate;
    private javax.swing.JTextField IHour;
    private javax.swing.JTextField IMinutes;
    private javax.swing.JTextField IMonth;
    private javax.swing.JTextField ISeconds;
    private javax.swing.JTextField IYear;
    private javax.swing.JButton btnCofnij;
    private javax.swing.JButton btnZwroc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField zwrotID;
    // End of variables declaration//GEN-END:variables
}
