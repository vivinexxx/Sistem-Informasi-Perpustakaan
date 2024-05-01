package com.mycompany.aplikasiperpus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author vivin
 */
public class FormHome extends javax.swing.JFrame {

    public FormHome() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jLabel3 = new javax.swing.JLabel();
        frameLogin = new javax.swing.JInternalFrame();
        lUsername = new javax.swing.JLabel();
        lPass = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        fPass = new javax.swing.JPasswordField();
        bBatal = new javax.swing.JButton();
        bOK = new javax.swing.JButton();
        cbPass = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miLogout = new javax.swing.JMenuItem();
        mDatabase = new javax.swing.JMenu();
        miBuku = new javax.swing.JMenuItem();
        miTransaksi = new javax.swing.JMenuItem();
        miPeminjam = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIA PERPUS");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel3.setText("SISTEM INFORMASI PERPUSTAKAAN ");

        frameLogin.setTitle("Login");
        frameLogin.setVisible(true);

        lUsername.setText("Username");

        lPass.setText("Password");

        fPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fPassActionPerformed(evt);
            }
        });

        bBatal.setText("Batal");
        bBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBatalActionPerformed(evt);
            }
        });

        bOK.setText("OK");
        bOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOKActionPerformed(evt);
            }
        });

        cbPass.setText("Lihat Password");
        cbPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameLoginLayout = new javax.swing.GroupLayout(frameLogin.getContentPane());
        frameLogin.getContentPane().setLayout(frameLoginLayout);
        frameLoginLayout.setHorizontalGroup(
            frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLoginLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(frameLoginLayout.createSequentialGroup()
                        .addComponent(lPass)
                        .addGap(18, 18, 18)
                        .addComponent(fPass))
                    .addGroup(frameLoginLayout.createSequentialGroup()
                        .addComponent(lUsername)
                        .addGap(18, 18, 18)
                        .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameLoginLayout.createSequentialGroup()
                .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frameLoginLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frameLoginLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(bBatal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bOK)))
                .addGap(21, 21, 21))
        );
        frameLoginLayout.setVerticalGroup(
            frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLoginLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUsername)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPass)
                    .addComponent(fPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBatal)
                    .addComponent(bOK))
                .addGap(21, 21, 21))
        );

        jMenu1.setText("Home");

        miLogout.setText("Log out");
        miLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(miLogout);

        jMenuBar1.add(jMenu1);

        mDatabase.setText("Database");
        mDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDatabaseActionPerformed(evt);
            }
        });

        miBuku.setText("Buku");
        miBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBukuActionPerformed(evt);
            }
        });
        mDatabase.add(miBuku);

        miTransaksi.setText("Transaksi");
        miTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTransaksiActionPerformed(evt);
            }
        });
        mDatabase.add(miTransaksi);

        miPeminjam.setText("Peminjam");
        miPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPeminjamActionPerformed(evt);
            }
        });
        mDatabase.add(miPeminjam);

        jMenuBar1.add(mDatabase);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(frameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(frameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLogoutActionPerformed
        int logOut = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Message", JOptionPane.YES_NO_OPTION);
        if (logOut == JOptionPane.YES_OPTION) {
            FormHome home;
            home = new FormHome();
            home.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_miLogoutActionPerformed

    private void bBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBatalActionPerformed
        FormHome home;
        home = new FormHome();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bBatalActionPerformed

    private void cbPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPassActionPerformed
        if (cbPass.isSelected()) {
            fPass.setEchoChar((char) 0);
        } else {
            fPass.setEchoChar('*');
        }
    }//GEN-LAST:event_cbPassActionPerformed

    private void bOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOKActionPerformed
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            String sql = "SELECT * FROM admin where username = '"+tfUsername.getText() +"' and password = '"+fPass.getText()+"'";
            
            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();
            
            if (rs.next()){
                JOptionPane.showMessageDialog(rootPane, "Berhasil Login");
                frameLogin.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Username atau password salah");
            }
            } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            
     }
    }//GEN-LAST:event_bOKActionPerformed

    private void fPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fPassActionPerformed

    }//GEN-LAST:event_fPassActionPerformed

    private void mDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDatabaseActionPerformed
        Database db = new Database();
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mDatabaseActionPerformed

    private void miBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBukuActionPerformed
        Database db = new Database();
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_miBukuActionPerformed

    private void miPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPeminjamActionPerformed
        Peminjam pinjam = new Peminjam ();
        pinjam.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_miPeminjamActionPerformed

    private void miTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTransaksiActionPerformed
        Transaksi ts = new Transaksi();
        ts.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_miTransaksiActionPerformed

     public Connection getConnection() {
        String URL = "jdbc:mariadb://3j3.h.filess.io:3305/appperpus_percareill";
        String host = "3j3.h.filess.io";
        String port = "3305";
        String usr = "appperpus_percareill";
        String db = "appperpus_percareill";
        String pwd = "120ddd92207c0f348d20540a4a6e17222529738b";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, usr, pwd);
            if (conn != null) {
                System.out.println("Koneksi ke database berhasil terbentuk");
            } else {
                System.out.println("Maaf, koneksi ke database gagal terbentuk");
            }
        } catch (SQLException ex) {
            System.out.println("Maaf, koneksi tidak berhasil.");
            System.out.println(ex.getMessage());
        }
        return conn;
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
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBatal;
    private javax.swing.JButton bOK;
    private javax.swing.JCheckBox cbPass;
    private javax.swing.JPasswordField fPass;
    private javax.swing.JInternalFrame frameLogin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel lPass;
    private javax.swing.JLabel lUsername;
    private javax.swing.JMenu mDatabase;
    private javax.swing.JMenuItem miBuku;
    private javax.swing.JMenuItem miLogout;
    private javax.swing.JMenuItem miPeminjam;
    private javax.swing.JMenuItem miTransaksi;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
