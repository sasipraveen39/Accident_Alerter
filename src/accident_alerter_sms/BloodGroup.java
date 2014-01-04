/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accident_alerter_sms;

import javax.swing.JFrame;

/**
 *
 * @author Sasi Praveen
 */
public class BloodGroup extends javax.swing.JFrame {

    /**
     * Creates new form BloodGroup
     */
    
    public BloodGroup(String blood_grp) {
        initComponents();
        Utilfunctions.setIconImage(this);
        Utilfunctions.setLocation(this);
        blood_grp_label.setText(blood_grp);
        this.setVisible(true);
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
        blood_grp_label = new javax.swing.JLabel();
        ok_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Accident Aleter");
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BLOOD GROUP");

        blood_grp_label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        blood_grp_label.setForeground(new java.awt.Color(255, 0, 0));
        blood_grp_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blood_grp_label.setText("blood_grp_label");

        ok_btn.setText("OK");
        ok_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blood_grp_label, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(ok_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(blood_grp_label)
                .addGap(18, 18, 18)
                .addComponent(ok_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ok_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_btnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ok_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blood_grp_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton ok_btn;
    // End of variables declaration//GEN-END:variables
}
