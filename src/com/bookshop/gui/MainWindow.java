/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookshop.gui;

import java.awt.GridLayout;
import java.awt.Toolkit;

/**
 *
 * @author amila
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        setTitle("Universal BookShop");
        setFrameIcon();
        this.setSize(500,350);
        jPanel1.setLayout(new GridLayout(3,2));
        jPanel1.setSize(450,300);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btnAddBook = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("MainFrame"); // NOI18N
        setResizable(false);

        jPanel1.setLayout(new java.awt.GridLayout());

        btnAddBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bookshop/gui/book.png"))); // NOI18N
        btnAddBook.setText("Add Book");
        btnAddBook.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddBook);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bookshop/gui/trash.png"))); // NOI18N
        jButton1.setText("Remove Book");
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bookshop/gui/find.png"))); // NOI18N
        jButton2.setText("Search Books");
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bookshop/gui/interact.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(btnUpdate);

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bookshop/gui/Print.png"))); // NOI18N
        btnPrint.setText("Print Book List");
        btnPrint.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(btnPrint);

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bookshop/gui/shutdown.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed
        // TODO add your handling code here:
        InsertFrame inf = new InsertFrame();
        inf.setVisible(true);
    }//GEN-LAST:event_btnAddBookActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
     /*
     * This method is used to Exit the main window
     */
        this.dispose();
        
    }//GEN-LAST:event_btnExitActionPerformed

    private void setFrameIcon(){
    this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bookshelf.png")));
    
    }
    
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
