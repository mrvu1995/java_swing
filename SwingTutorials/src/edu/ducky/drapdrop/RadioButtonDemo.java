/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.drapdrop;

/**
 *
 * @author Admin
 */
public class RadioButtonDemo extends javax.swing.JFrame {

    /**
     * Creates new form RadioButtonDemo
     */
    public RadioButtonDemo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        rdJava = new javax.swing.JRadioButton();
        rdHtml = new javax.swing.JRadioButton();
        rdCss = new javax.swing.JRadioButton();
        bSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup1.add(rdJava);
        rdJava.setText("Java");
        rdJava.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup1.add(rdHtml);
        rdHtml.setText("HTML");
        rdHtml.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rdHtml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdHtmlActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdCss);
        rdCss.setText("CSS");

        bSave.setText("Save");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdCss)
                    .addComponent(rdHtml)
                    .addComponent(bSave)
                    .addComponent(rdJava))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(rdJava)
                .addGap(18, 18, 18)
                .addComponent(rdHtml)
                .addGap(18, 18, 18)
                .addComponent(rdCss)
                .addGap(36, 36, 36)
                .addComponent(bSave)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdHtmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdHtmlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdHtmlActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        if(rdJava.isSelected()) {
            System.out.println("I learn " + rdJava.getText());
        }
        else if(rdHtml.isSelected()) {
            System.out.println("I learn " + rdHtml.getText());
        }
        else if(rdCss.isSelected()) {
            System.out.println("I learn " + rdCss.getText());
        } else {
            System.out.println("Please select a choice");
        }        
    }//GEN-LAST:event_bSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RadioButtonDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadioButtonDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadioButtonDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadioButtonDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RadioButtonDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton rdCss;
    private javax.swing.JRadioButton rdHtml;
    private javax.swing.JRadioButton rdJava;
    // End of variables declaration//GEN-END:variables
}
