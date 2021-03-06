/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Patient;
import Business.VitalSign;
import java.sql.Time;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Sheetal
 */
public class CreateVitalSignJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */ private Patient vitalsigndetails;
     
   String a,b,c,d;
    
    
    public CreateVitalSignJPanel( Patient pd) {
        initComponents();
         this.vitalsigndetails=pd;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtrespiratoryRate = new javax.swing.JTextField();
        txtheartRate = new javax.swing.JTextField();
        txtbloodPressure = new javax.swing.JTextField();
        txtweight = new javax.swing.JTextField();
        btncreateVitalSign = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Vital Sign Details");

        jLabel2.setText("Respiratory Rate");

        jLabel3.setText("Heart Rate");

        jLabel4.setText(" Blood Pressure");

        jLabel5.setText("Weight");
        jLabel5.setToolTipText("");

        txtrespiratoryRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrespiratoryRateActionPerformed(evt);
            }
        });

        txtheartRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtheartRateActionPerformed(evt);
            }
        });

        btncreateVitalSign.setText("Create Vital Sign");
        btncreateVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateVitalSignActionPerformed(evt);
            }
        });

        jLabel6.setText("/lb");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtbloodPressure, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtweight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(82, 82, 82)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtrespiratoryRate)
                                            .addComponent(txtheartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btncreateVitalSign)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtrespiratoryRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtheartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtweight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(48, 48, 48)
                .addComponent(btncreateVitalSign)
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtrespiratoryRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrespiratoryRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrespiratoryRateActionPerformed

    private void txtheartRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtheartRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtheartRateActionPerformed

    private void btncreateVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateVitalSignActionPerformed
        // TODO add your handling code here:
     try{

       a= txtrespiratoryRate.getText().trim();
       b= txtheartRate.getText().trim();
       c=txtbloodPressure.getText().trim();
       d=txtweight.getText().trim();
       VitalSign vitalSign=  new VitalSign(); 
       vitalSign.setRespiratoryrate(Integer.parseInt(a));
       vitalSign.setHeartrate(Integer.parseInt(b));
       vitalSign.setBloodpressure(Integer.parseInt(c));
       vitalSign.setWeight(Double.parseDouble(d));
       vitalsigndetails.createVitalSign(vitalSign);
       JOptionPane.showMessageDialog(this,"Vital Sign saved sucessfully"); 
           
       txtrespiratoryRate.setText("");
       txtheartRate.setText("");
       txtbloodPressure.setText("");
       txtweight.setText(""); 
        }
           
        
        catch(NumberFormatException e)
        {
           JOptionPane.showMessageDialog(this, "Please enter numeric values for all vital sign details", "FAILURE", JOptionPane.PLAIN_MESSAGE); 
        return;
        }
  
    }//GEN-LAST:event_btncreateVitalSignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreateVitalSign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtbloodPressure;
    private javax.swing.JTextField txtheartRate;
    private javax.swing.JTextField txtrespiratoryRate;
    private javax.swing.JTextField txtweight;
    // End of variables declaration//GEN-END:variables
}
