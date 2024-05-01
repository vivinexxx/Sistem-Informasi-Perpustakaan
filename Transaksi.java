package com.mycompany.aplikasiperpus;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vivin
 */
public class Transaksi extends javax.swing.JFrame {

    private JFrame frame;
    private DefaultTableModel tableModel;

    public Transaksi() {
        initComponents();
    }

    private void upDateDB() {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            String sql = "select * from transaksi";
            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();

            int q = stData.getColumnCount();

            DefaultTableModel RecordTable = (DefaultTableModel) jTable2.getModel();
            RecordTable.setRowCount(0);

            while (rs.next()) {
                Vector columnData = new Vector();

                for (int i = 1; i <= q; i++) {
                    columnData.add(rs.getString("kode_transaksi"));
                    columnData.add(rs.getString("kode_peminjam"));
                    columnData.add(rs.getString("kode_buku"));
                    columnData.add(rs.getString("tanggal_pinjam"));
                    columnData.add(rs.getString("tanggal_kembali"));
                    columnData.add(rs.getString("keterangan"));
                }
                RecordTable.addRow(columnData);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }

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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lKodePeminjam = new javax.swing.JLabel();
        lKodeBuku = new javax.swing.JLabel();
        lTglPinjam = new javax.swing.JLabel();
        lTglKembali = new javax.swing.JLabel();
        tfKodePeminjam = new javax.swing.JTextField();
        tfTglKembali = new javax.swing.JTextField();
        tfKodeBuku = new javax.swing.JTextField();
        dcTglPinjam = new com.toedter.calendar.JDateChooser();
        cbKeterangan = new javax.swing.JComboBox<>();
        lKeterangan = new javax.swing.JLabel();
        lKodeTransaksi = new javax.swing.JLabel();
        tfKodeTransaksi = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        bTambah = new javax.swing.JButton();
        bTampil = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        bCari = new javax.swing.JButton();
        bPrint = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        mHome = new javax.swing.JMenu();
        miLogout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miBuku = new javax.swing.JMenuItem();
        miPeminjam = new javax.swing.JMenuItem();
        miTransaksi = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel1.setText("Sistem Informasi Perpustakaan");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informasi Peminjam"));

        lKodePeminjam.setText("ID Peminjam");

        lKodeBuku.setText("ID Buku");

        lTglPinjam.setText("Tanggal Pinjam");

        lTglKembali.setText("Tanggal kembali");

        tfKodePeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKodePeminjamActionPerformed(evt);
            }
        });

        tfTglKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfTglKembaliMouseClicked(evt);
            }
        });
        tfTglKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTglKembaliActionPerformed(evt);
            }
        });

        dcTglPinjam.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dcTglPinjamPropertyChange(evt);
            }
        });

        cbKeterangan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==pilih==", "Pinjam", "Kembali" }));

        lKeterangan.setText("Keterangan");

        lKodeTransaksi.setText("ID Transaksi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lKodePeminjam)
                    .addComponent(lKodeBuku)
                    .addComponent(lKodeTransaksi))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfKodePeminjam, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(tfKodeBuku)
                    .addComponent(tfKodeTransaksi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTglKembali)
                    .addComponent(lKeterangan)
                    .addComponent(lTglPinjam))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lTglPinjam)
                        .addComponent(lKodeTransaksi)
                        .addComponent(tfKodeTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lTglKembali))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lKeterangan)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lKodePeminjam)
                            .addComponent(tfKodePeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lKodeBuku))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bTambah.setText("Tambah");
        bTambah.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bTampil.setText("Tampilkan");
        bTampil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTampilActionPerformed(evt);
            }
        });

        bUpdate.setText("Update");
        bUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bHapus.setText("Hapus");
        bHapus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bReset.setText("Reset");
        bReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bCari.setText("Cari");
        bCari.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCariActionPerformed(evt);
            }
        });

        bPrint.setText("Print");
        bPrint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(bUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bHapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bTampil, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(bPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTampil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(bCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bReset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel2.setText("TRANSAKSI PEMINJAMAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 159, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(292, 292, 292))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "kode_transaksi", "kode_peminjam", "kode_buku", "tanggal_pinjam", "tanggal_kembali", "keterangan"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(150);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(150);
        }

        mHome.setText("Home");
        mHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mHomeActionPerformed(evt);
            }
        });

        miLogout.setText("Log out");
        miLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLogoutActionPerformed(evt);
            }
        });
        mHome.add(miLogout);

        jMenuBar1.add(mHome);

        jMenu2.setText("Database");

        miBuku.setText("Buku");
        miBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBukuActionPerformed(evt);
            }
        });
        jMenu2.add(miBuku);

        miPeminjam.setText("Peminjam");
        miPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPeminjamActionPerformed(evt);
            }
        });
        jMenu2.add(miPeminjam);

        miTransaksi.setText("Transaksi");
        miTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTransaksiActionPerformed(evt);
            }
        });
        jMenu2.add(miTransaksi);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void miPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPeminjamActionPerformed
        Peminjam pj = new Peminjam();
        pj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_miPeminjamActionPerformed

    private void tfKodePeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKodePeminjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKodePeminjamActionPerformed

    private void tfTglKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTglKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTglKembaliActionPerformed

    private void mHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mHomeActionPerformed
        FormHome home = new FormHome();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mHomeActionPerformed

    private void miBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBukuActionPerformed
        Database buku = new Database();
        buku.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_miBukuActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = getConnection();
            String sql = "INSERT INTO transaksi (kode_transaksi, kode_peminjam, kode_buku, tanggal_pinjam, tanggal_kembali, keterangan) VALUES ( ?, ?, ?, ?, ?, ?)";
            pst = conn.prepareStatement(sql);

            pst.setString(1, tfKodeTransaksi.getText());
            pst.setString(2, tfKodePeminjam.getText());
            pst.setString(3, tfKodeBuku.getText());
            // Ensure that the date is formatted correctly before setting it in the prepared statement
            Date tglPinjam = dcTglPinjam.getDate();
            String formattedTglPinjam = null;
            if (tglPinjam != null) {
                formattedTglPinjam = new SimpleDateFormat("MMM d, y").format(tglPinjam);
                pst.setString(4, formattedTglPinjam); // Use the formatted date here
            }
            pst.setString(5, tfTglKembali.getText());
            pst.setString(6, (String) cbKeterangan.getSelectedItem());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
            upDateDB();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bTambahActionPerformed

    private void tfTglKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfTglKembaliMouseClicked
    }//GEN-LAST:event_tfTglKembaliMouseClicked

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = getConnection();
            String sql = "UPDATE transaksi SET kode_peminjam = ?, kode_buku = ?, tanggal_pinjam = ?, tanggal_kembali = ?, keterangan = ? WHERE kode_transaksi = ?";
            pst = conn.prepareStatement(sql);

            pst.setString(1, tfKodePeminjam.getText());
            pst.setString(2, tfKodeBuku.getText());

            Date tglPinjam = dcTglPinjam.getDate();
            String formattedTglPinjam = null;
            if (tglPinjam != null) {
                formattedTglPinjam = new SimpleDateFormat("MMM d, y").format(tglPinjam);
            }
            pst.setString(3, formattedTglPinjam);
            pst.setString(4, tfTglKembali.getText());
            pst.setString(5, (String) cbKeterangan.getSelectedItem());
            pst.setString(6, tfKodeTransaksi.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate");
            upDateDB();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTampilActionPerformed
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            String sql = "SELECT * FROM transaksi";
            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();

            DefaultTableModel tableModel = new DefaultTableModel();
            jTable2.setModel(tableModel);

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(metaData.getColumnName(i));
            }

            while (rs.next()) {
                Vector<Object> rowData = new Vector<>(columnCount);
                for (int i = 1; i <= columnCount; i++) {
                    rowData.add(rs.getString("kode_transaksi"));
                    rowData.add(rs.getString("kode_peminjam"));
                    rowData.add(rs.getString("kode_buku"));
                    rowData.add(rs.getString("tanggal_pinjam"));
                    rowData.add(rs.getString("tanggal_kembali"));
                    rowData.add(rs.getString("keterangan"));
                }
                tableModel.addRow(rowData);
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_bTampilActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        DefaultTableModel recordTable = (DefaultTableModel) jTable2.getModel();
        int selectedRows = jTable2.getSelectedRow();

        Connection conn = null;
        PreparedStatement pst = null;

        try {
            int deleteItem = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data?", "Warning", JOptionPane.YES_NO_OPTION);
            if (deleteItem == JOptionPane.YES_OPTION) {
                conn = getConnection();
                String sql = "DELETE FROM transaksi WHERE kode_transaksi=?";
                pst = conn.prepareStatement(sql);

                pst.setString(1, recordTable.getValueAt(selectedRows, 0).toString());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data dihapus");
                upDateDB();

                tfKodeTransaksi.setText("");
                tfKodePeminjam.setText("");
                tfKodeBuku.setText("");
                dcTglPinjam.setDate(null);
                tfTglKembali.setText("");
                cbKeterangan.setSelectedItem("==pilih==");

            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_bHapusActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        tfKodeTransaksi.setText("");
        tfKodePeminjam.setText("");
        tfKodeBuku.setText("");
        dcTglPinjam.setDate(null);
        tfTglKembali.setText("");
        cbKeterangan.setSelectedItem("==pilih==");
    }//GEN-LAST:event_bResetActionPerformed

    private void bPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrintActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();

        try ( BufferedWriter writer = new BufferedWriter(new FileWriter("TransaksiBuku.txt"))) {
              for (int i = 0; i < tableModel.getColumnCount(); i++) {
                writer.write(String.format("%-20s", tableModel.getColumnName(i)));

                if (i < tableModel.getColumnCount() - 1) {
                    writer.write("\t");
                }
            }
            writer.newLine();

            for (int i = 0; i < tableModel.getRowCount(); i++) {
                for (int j = 0; j < tableModel.getColumnCount(); j++) {
                    writer.write(String.format("%-20s", tableModel.getValueAt(i, j).toString()));
                    if (j < tableModel.getColumnCount() - 1) {
                        writer.write("\t");
                    }
                }
                writer.newLine();
            }

            System.out.println("Data berhasil disimpan ke dalam file TransaksiBuku.txt");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_bPrintActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) jTable2.getModel();
        int selectedRows = jTable2.getSelectedRow();

        tfKodeTransaksi.setText(RecordTable.getValueAt(selectedRows, 0).toString());
        tfKodePeminjam.setText(RecordTable.getValueAt(selectedRows, 1).toString());
        tfKodeBuku.setText(RecordTable.getValueAt(selectedRows, 2).toString());

        try {
            Date tglPinjam = new SimpleDateFormat("MMM d, y").parse(RecordTable.getValueAt(selectedRows, 3).toString());
            dcTglPinjam.setDate(tglPinjam);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        tfTglKembali.setText(RecordTable.getValueAt(selectedRows, 4).toString());
        cbKeterangan.setSelectedItem(RecordTable.getValueAt(selectedRows, 5).toString());

    }//GEN-LAST:event_jTable2MouseClicked

    private void dcTglPinjamPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcTglPinjamPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = dcTglPinjam.getDate();
            if (selectedDate != null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(selectedDate);
                calendar.add(Calendar.MONTH, 1);
                Date newDate = calendar.getTime();

                String formattedDate = new SimpleDateFormat("MMM d, y").format(newDate);
                tfTglKembali.setText(formattedDate);
            } else {
                tfTglKembali.setText("");
            }
        }
    }//GEN-LAST:event_dcTglPinjamPropertyChange

    private void bCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCariActionPerformed
   try (
        Connection conn = getConnection();) {
        String sql = "SELECT * FROM transaksi WHERE kode_transaksi = ? OR kode_peminjam = ? OR "
                + "kode_buku = ? OR tanggal_pinjam = ? OR tanggal_kembali = ? OR keterangan = ?";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            Date tglPinjam = dcTglPinjam.getDate();
            String formattedTglPinjam = null;
            if (tglPinjam != null) {
                formattedTglPinjam = new SimpleDateFormat("MMM d, y").format(tglPinjam);
            } 
            pst.setString(1, tfKodeTransaksi.getText());
            pst.setString(2, tfKodePeminjam.getText());
            pst.setString(3, tfKodeBuku.getText());
            pst.setString(4, formattedTglPinjam);
            pst.setString(5, tfTglKembali.getText());
            pst.setString(6, (String) cbKeterangan.getSelectedItem());

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            boolean dataDitemukan = false;
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String kodeTransaksi = rs.getString("kode_transaksi");
                    String kodePeminjam = rs.getString("kode_peminjam");
                    String kodeBuku = rs.getString("kode_buku");
                    String tgglPinjam = rs.getString("tanggal_pinjam");
                    String tgglKembali = rs.getString("tanggal_kembali");
                    String keterangan = rs.getString("keterangan");
                    model.addRow(new Object[]{kodeTransaksi, kodePeminjam, kodeBuku, tgglPinjam, tgglKembali, keterangan});
                    dataDitemukan = true;
                }
            }
            if (!dataDitemukan) {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Kesalahan Database: " + ex.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_bCariActionPerformed

    private void miTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTransaksiActionPerformed
        Transaksi ts = new Transaksi();
        this.setVisible(true);
    }//GEN-LAST:event_miTransaksiActionPerformed

    public static void main(String args[]) throws IOException {

        Database p = new Database();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCari;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bPrint;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bTampil;
    private javax.swing.JButton bUpdate;
    private javax.swing.JComboBox<String> cbKeterangan;
    private com.toedter.calendar.JDateChooser dcTglPinjam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lKeterangan;
    private javax.swing.JLabel lKodeBuku;
    private javax.swing.JLabel lKodePeminjam;
    private javax.swing.JLabel lKodeTransaksi;
    private javax.swing.JLabel lTglKembali;
    private javax.swing.JLabel lTglPinjam;
    private javax.swing.JMenu mHome;
    private javax.swing.JMenuItem miBuku;
    private javax.swing.JMenuItem miLogout;
    private javax.swing.JMenuItem miPeminjam;
    private javax.swing.JMenuItem miTransaksi;
    private javax.swing.JTextField tfKodeBuku;
    private javax.swing.JTextField tfKodePeminjam;
    private javax.swing.JTextField tfKodeTransaksi;
    private javax.swing.JTextField tfTglKembali;
    // End of variables declaration//GEN-END:variables
}
