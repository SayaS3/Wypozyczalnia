
package Wypozyczalnia;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DodajAuto extends javax.swing.JFrame {
public static JFrame DodajAuto;
    public DodajAuto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ID_autaBox = new javax.swing.JTextField();
        MarkaBox = new javax.swing.JTextField();
        Nr_rejestracyjnyBox = new javax.swing.JTextField();
        PrzebiegBox = new javax.swing.JTextField();
        btnDodajKsiazke = new javax.swing.JButton();
        btnCofnij = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ModelBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Ilosc_miejscBox = new javax.swing.JTextField();
        KolorBox = new javax.swing.JTextField();
        Rodzaj_paliwaBox = new javax.swing.JTextField();
        Skrzynia_biegowBox = new javax.swing.JTextField();
        Cena_za_hBox = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Kategoria_samochoduBox = new javax.swing.JTextField();
        KosztUbezpieczeniaBox = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        RMonth = new javax.swing.JTextField();
        RYear = new javax.swing.JTextField();
        RDate = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        RMonth1 = new javax.swing.JTextField();
        RYear1 = new javax.swing.JTextField();
        RDate1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        jLabel18.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel18.setText("Data ważnosci przeglądu");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel1.setText("ID_auta");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel3.setText("Marka");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel4.setText("Nr_rejestracyjny");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel6.setText("cena za godzine");

        ID_autaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_autaBoxActionPerformed(evt);
            }
        });

        MarkaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarkaBoxActionPerformed(evt);
            }
        });

        Nr_rejestracyjnyBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nr_rejestracyjnyBoxActionPerformed(evt);
            }
        });

        PrzebiegBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrzebiegBoxActionPerformed(evt);
            }
        });

        btnDodajKsiazke.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        btnDodajKsiazke.setText("Dodaj auto");
        btnDodajKsiazke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajKsiazkeActionPerformed(evt);
            }
        });

        btnCofnij.setText("Cofnij");
        btnCofnij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCofnijActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel2.setText("Model");

        ModelBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelBoxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel7.setText("Ilosc_miejsc");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel8.setText("Kolor");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel9.setText("rodzaj paliwa");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel10.setText("Kategoria samochodu");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel11.setText("Skrzynia biegow");

        Ilosc_miejscBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ilosc_miejscBoxActionPerformed(evt);
            }
        });

        KolorBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KolorBoxActionPerformed(evt);
            }
        });

        Rodzaj_paliwaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rodzaj_paliwaBoxActionPerformed(evt);
            }
        });

        Skrzynia_biegowBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Skrzynia_biegowBoxActionPerformed(evt);
            }
        });

        Cena_za_hBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cena_za_hBoxActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel12.setText("Przebieg");

        Kategoria_samochoduBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kategoria_samochoduBoxActionPerformed(evt);
            }
        });

        KosztUbezpieczeniaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KosztUbezpieczeniaBoxActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel17.setText("Data ważnosci przeglądu");

        jLabel19.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel19.setText("Data końca ubezpieczenia");

        jLabel20.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel20.setText("Koszt ubezpieczenia");

        RYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RYearActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel21.setText("-");

        jLabel22.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel22.setText("-");

        RYear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RYear1ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel23.setText("-");

        jLabel24.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel24.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCofnij, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDodajKsiazke, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel19))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Cena_za_hBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Nr_rejestracyjnyBox, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                                .addComponent(MarkaBox, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                                .addComponent(ID_autaBox, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                                .addComponent(PrzebiegBox)
                                                .addComponent(ModelBox)
                                                .addComponent(Ilosc_miejscBox, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(KolorBox)
                                                .addComponent(Rodzaj_paliwaBox)
                                                .addComponent(Skrzynia_biegowBox))
                                            .addComponent(Kategoria_samochoduBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(RDate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(RMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(RYear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(RDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(KosztUbezpieczeniaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_autaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nr_rejestracyjnyBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MarkaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ModelBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrzebiegBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ilosc_miejscBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KolorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Skrzynia_biegowBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rodzaj_paliwaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kategoria_samochoduBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cena_za_hBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)
                        .addComponent(RMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)
                        .addComponent(RYear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23)
                        .addComponent(RMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24)
                        .addComponent(RYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KosztUbezpieczeniaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnDodajKsiazke, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCofnij))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ID_autaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_autaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_autaBoxActionPerformed

    private void MarkaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarkaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarkaBoxActionPerformed

    private void Nr_rejestracyjnyBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nr_rejestracyjnyBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nr_rejestracyjnyBoxActionPerformed

    private void PrzebiegBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrzebiegBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrzebiegBoxActionPerformed

    private void btnCofnijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCofnijActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Auta.main(new String[]{});
    }//GEN-LAST:event_btnCofnijActionPerformed

    private void btnDodajKsiazkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajKsiazkeActionPerformed
        // TODO add your handling code here:
        String id_auta = ID_autaBox.getText();
        String Nr_rejestracyjny = Nr_rejestracyjnyBox.getText();
        String Marka = MarkaBox.getText();
        String Model = ModelBox.getText();
        String Przebieg = PrzebiegBox.getText();
        String Ilosc_miejsc = Ilosc_miejscBox.getText();
        String Kolor = KolorBox.getText();
        String Skrzynia_biegow= Skrzynia_biegowBox.getText();
        String RodzajPaliwa = Rodzaj_paliwaBox.getText();
        String KategoriaSamochodu = Kategoria_samochoduBox.getText();
        String cena_za_h = Cena_za_hBox.getText();
        String Data_Waznosci_przegladu = RYear.getText() + "-"+RMonth.getText()+"-"+RDate.getText();
        String Data_konca_ubezpieczenia = RYear.getText() + "-"+RMonth.getText()+"-"+RDate.getText();
        String Koszt_ubepieczenia = KosztUbezpieczeniaBox.getText();

        if(AutoDodaj.ZapiszAuto(id_auta,Nr_rejestracyjny,Model,Marka,Przebieg,Ilosc_miejsc,Kolor,Skrzynia_biegow,RodzajPaliwa,KategoriaSamochodu,cena_za_h,Data_Waznosci_przegladu, 
        Data_konca_ubezpieczenia,Koszt_ubepieczenia)!=0)
            {
                JOptionPane.showMessageDialog(DodajAuto.this, "Dodano samochód!","Powodzenie", JOptionPane.ERROR_MESSAGE);
                ID_autaBox.setText("");
                Nr_rejestracyjnyBox.setText("");
                MarkaBox.setText("");
                ModelBox.setText("");
                PrzebiegBox.setText("");
                
            }
            else
                JOptionPane.showMessageDialog(DodajAuto.this, "Błąd podczas dodawania samochodu!","Niepowodzenie", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_btnDodajKsiazkeActionPerformed

    private void ModelBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModelBoxActionPerformed

    private void Ilosc_miejscBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ilosc_miejscBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ilosc_miejscBoxActionPerformed

    private void KolorBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KolorBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KolorBoxActionPerformed

    private void Rodzaj_paliwaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rodzaj_paliwaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rodzaj_paliwaBoxActionPerformed

    private void Skrzynia_biegowBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Skrzynia_biegowBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Skrzynia_biegowBoxActionPerformed

    private void Cena_za_hBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cena_za_hBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cena_za_hBoxActionPerformed

    private void Kategoria_samochoduBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kategoria_samochoduBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kategoria_samochoduBoxActionPerformed

    private void KosztUbezpieczeniaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KosztUbezpieczeniaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KosztUbezpieczeniaBoxActionPerformed

    private void RYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RYearActionPerformed

    private void RYear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RYear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RYear1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DodajAuto = new DodajAuto();
                DodajAuto.setLocationRelativeTo(null);
                DodajAuto.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cena_za_hBox;
    private javax.swing.JTextField ID_autaBox;
    private javax.swing.JTextField Ilosc_miejscBox;
    private javax.swing.JTextField Kategoria_samochoduBox;
    private javax.swing.JTextField KolorBox;
    private javax.swing.JTextField KosztUbezpieczeniaBox;
    private javax.swing.JTextField MarkaBox;
    private javax.swing.JTextField ModelBox;
    private javax.swing.JTextField Nr_rejestracyjnyBox;
    private javax.swing.JTextField PrzebiegBox;
    private javax.swing.JTextField RDate;
    private javax.swing.JTextField RDate1;
    private javax.swing.JTextField RMonth;
    private javax.swing.JTextField RMonth1;
    private javax.swing.JTextField RYear;
    private javax.swing.JTextField RYear1;
    private javax.swing.JTextField Rodzaj_paliwaBox;
    private javax.swing.JTextField Skrzynia_biegowBox;
    private javax.swing.JButton btnCofnij;
    private javax.swing.JButton btnDodajKsiazke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
