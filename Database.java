package com.mycompany.aplikasiperpus;

import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vivin
 */
public class Database extends javax.swing.JFrame {
    String filename;
    String txtFileName;
    private JFrame frame;
    private DefaultTableModel tableModel;

    public Database() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        lKode = new javax.swing.JLabel();
        lJudul = new javax.swing.JLabel();
        lKategori = new javax.swing.JLabel();
        lPenerbit = new javax.swing.JLabel();
        lNamaPengarang = new javax.swing.JLabel();
        lTahun = new javax.swing.JLabel();
        lLetak = new javax.swing.JLabel();
        tfKode = new javax.swing.JTextField();
        tfNamaPengarang = new javax.swing.JTextField();
        tfTahun = new javax.swing.JTextField();
        tfLetak = new javax.swing.JTextField();
        tfJudul = new javax.swing.JTextField();
        tfPenerbit = new javax.swing.JTextField();
        cbKategori = new javax.swing.JComboBox<>();
        bJmlHlm = new javax.swing.JLabel();
        tfJumlahHlm = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfGambar = new javax.swing.JTextField();
        bUpload = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        bUpdate = new javax.swing.JButton();
        bTampil = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bPrint = new javax.swing.JButton();
        bCari = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        bTambah = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mHome = new javax.swing.JMenu();
        miLogout = new javax.swing.JMenuItem();
        mDatabase = new javax.swing.JMenu();
        miBuku = new javax.swing.JMenuItem();
        miPeminjam = new javax.swing.JMenuItem();
        miTransaksi = new javax.swing.JMenuItem();

        jButton7.setText("jButton7");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Database");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informasi Buku"));

        lKode.setText("Kode Buku");

        lJudul.setText("Judul Buku");

        lKategori.setText("Kategori");

        lPenerbit.setText("Penerbit");

        lNamaPengarang.setText("Nama Pengarang");

        lTahun.setText("Tahun Terbit");

        lLetak.setText("Letak");

        cbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==PILIH==", "Fiksi", "Pengetahuan", "Novel", "Biografi", "Non Fiksi" }));

        bJmlHlm.setText("Jumlah Hlm");

        tfJumlahHlm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJumlahHlmActionPerformed(evt);
            }
        });

        jLabel3.setText("Gambar Buku");

        bUpload.setText("Upload");
        bUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lJudul)
                    .addComponent(lKode)
                    .addComponent(lPenerbit)
                    .addComponent(lLetak)
                    .addComponent(jLabel3))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfKode, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(tfJudul))
                            .addComponent(tfPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLetak, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bJmlHlm)
                            .addComponent(lKategori)
                            .addComponent(lNamaPengarang)
                            .addComponent(lTahun))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfJumlahHlm, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNamaPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bUpload)))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lKode)
                    .addComponent(lNamaPengarang)
                    .addComponent(tfNamaPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lJudul)
                    .addComponent(lKategori)
                    .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTahun)
                    .addComponent(tfTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPenerbit)
                    .addComponent(tfPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lLetak)
                    .addComponent(tfLetak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfJumlahHlm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bJmlHlm))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfGambar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bUpload))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "kode_buku", "judul_buku", "nama_pengarang", "kategori", "penerbit", "tahun_terbit", "letak", "jumlah_halaman", "gambar_buku", "status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bTampil.setText("Tampilkan");
        bTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTampilActionPerformed(evt);
            }
        });

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bPrint.setText("Print");
        bPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrintActionPerformed(evt);
            }
        });

        bCari.setText("Cari");
        bCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCariActionPerformed(evt);
            }
        });

        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(bTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bTampil)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(bCari, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTampil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setText("SISTEM INFORMASI PERPUSTAKAAN");

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel2.setText("DATABASE BUKU");

        jMenuBar1.setBorder(null);

        mHome.setText("Home");

        miLogout.setText("Log out");
        miLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLogoutActionPerformed(evt);
            }
        });
        mHome.add(miLogout);

        jMenuBar1.add(mHome);

        mDatabase.setText("Database");

        miBuku.setText("Buku");
        miBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBukuActionPerformed(evt);
            }
        });
        mDatabase.add(miBuku);

        miPeminjam.setText("Peminjam");
        miPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPeminjamActionPerformed(evt);
            }
        });
        mDatabase.add(miPeminjam);

        miTransaksi.setText("Transaksi");
        miTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTransaksiActionPerformed(evt);
            }
        });
        mDatabase.add(miTransaksi);

        jMenuBar1.add(mDatabase);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void upDateDB() {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            conn = getConnection();

            String sql = "SELECT * FROM books";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            DefaultTableModel recordTable = (DefaultTableModel) jTable1.getModel();
            recordTable.setRowCount(0);

            while (rs.next()) {
                Vector<Object> rowData = new Vector<>();

                rowData.add(rs.getString("kode_buku"));
                rowData.add(rs.getString("judul"));
                rowData.add(rs.getString("nama_pengarang"));
                rowData.add(rs.getString("kategori"));
                rowData.add(rs.getString("penerbit"));
                rowData.add(rs.getString("tahun_terbit"));
                rowData.add(rs.getString("letak"));
                rowData.add(rs.getString("jumlah_halaman"));
                rowData.add(rs.getString("gambar_buku"));
                

                String sqlStatus = "SELECT keterangan FROM transaksi WHERE kode_buku = ?";
                try ( PreparedStatement pstStatus = conn.prepareStatement(sqlStatus)) {
                    pstStatus.setString(1, rs.getString("kode_buku"));
                    try ( ResultSet rsStatus = pstStatus.executeQuery()) {
                        if (rsStatus.next()) {
                            String keterangan = rsStatus.getString("keterangan");
                            if ("Pinjam".equals(keterangan)) {
                                rowData.add("Tidak Tersedia");
                            } else if ("Kembali".equals(keterangan)) {
                                rowData.add("Tersedia");
                            }
                        } else {
                            rowData.add("Tersedia");
                        }
                    }
                }
                recordTable.addRow(rowData);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
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
    }

    private String getBookStatus(Connection conn, String bookCode) throws SQLException {
        String sqlStatus = "SELECT keterangan FROM transaksi WHERE kode_buku = ?";

        try ( PreparedStatement pstStatus = conn.prepareStatement(sqlStatus)) {
            pstStatus.setString(1, bookCode);

            try ( ResultSet rsStatus = pstStatus.executeQuery()) {
                if (rsStatus.next()) {
                    return rsStatus.getString("keterangan");
                }
            }
        }
        return "Tersedia";
    }

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        Connection conn = null;
        PreparedStatement pst = null;
        PreparedStatement pstStatus = null;

        try {
            conn = getConnection();
            String sql = "UPDATE books SET judul= ?, nama_pengarang = ?, kategori = ?, penerbit = ?, tahun_terbit = ?,"
                    + " letak = ?, jumlah_halaman = ?, gambar_buku = ? WHERE kode_buku = ? ";
            pst = conn.prepareStatement(sql);

            pst.setString(1, tfJudul.getText());
            pst.setString(2, tfNamaPengarang.getText());
            pst.setString(3, (String) cbKategori.getSelectedItem());
            pst.setString(4, tfPenerbit.getText());
            pst.setString(5, tfTahun.getText());
            pst.setString(6, tfLetak.getText());
            pst.setString(7, tfJumlahHlm.getText());
            pst.setString(8, tfGambar.getText());
            pst.setString(9, tfKode.getText());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data berhasil diupdate");
            upDateDB();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrintActionPerformed
        MessageFormat header = new MessageFormat("Printing in progress");
        MessageFormat footer = new MessageFormat("Page(0,number, integer)");

        try {
            jTable1.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("No Pinter Found", e.getMessage());
        }
    }//GEN-LAST:event_bPrintActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        tfKode.setText("");
        tfJudul.setText("");
        tfNamaPengarang.setText("");
        cbKategori.setSelectedItem("==PILIH==");
        tfTahun.setText("");
        tfPenerbit.setText("");
        tfLetak.setText("");
        tfJumlahHlm.setText("");
        tfGambar.setText("");
    }//GEN-LAST:event_bResetActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = getConnection();
            String sql = "INSERT INTO books (kode_buku, judul, nama_pengarang, kategori, penerbit, tahun_terbit, letak, jumlah_halaman, gambar_buku) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pst = conn.prepareStatement(sql);

            pst.setString(1, tfKode.getText());
            pst.setString(2, tfJudul.getText());
            pst.setString(3, tfNamaPengarang.getText());
            pst.setString(4, (String) cbKategori.getSelectedItem());
            pst.setString(5, tfPenerbit.getText());
            pst.setString(6, tfTahun.getText());
            pst.setString(7, tfLetak.getText());
            pst.setString(8, tfJumlahHlm.getText());
            pst.setString(9, tfGambar.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
            upDateDB();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace(); 
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_bTambahActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        int selectedRows = jTable1.getSelectedRow();

        tfKode.setText(RecordTable.getValueAt(selectedRows, 0).toString());
        tfJudul.setText(RecordTable.getValueAt(selectedRows, 1).toString());
        tfNamaPengarang.setText(RecordTable.getValueAt(selectedRows, 2).toString());
        cbKategori.setSelectedItem(RecordTable.getValueAt(selectedRows, 3).toString());
        tfPenerbit.setText(RecordTable.getValueAt(selectedRows, 4).toString());
        tfTahun.setText(RecordTable.getValueAt(selectedRows, 5).toString());
        tfLetak.setText(RecordTable.getValueAt(selectedRows, 6).toString());
        tfJumlahHlm.setText(RecordTable.getValueAt(selectedRows, 7).toString());
        tfGambar.setText(RecordTable.getValueAt(selectedRows, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void bCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCariActionPerformed
        String kd = tfKode.getText().toUpperCase().trim();
        String jdl = tfJudul.getText().toUpperCase().trim();
        String nmPengarang = tfNamaPengarang.getText().toUpperCase().trim();
        String pnrbt = tfPenerbit.getText().toUpperCase().trim();
        String thn = tfTahun.getText().toUpperCase().trim();
        String ltk = tfLetak.getText().toUpperCase().trim();
        try ( Connection conn = getConnection()) {
            String sql = "SELECT kode_buku, judul, nama_pengarang, kategori, penerbit, tahun_terbit,letak, jumlah_halaman, gambar_buku, status FROM books WHERE kode_buku like ? OR judul like ? OR nama_pengarang like ? OR kategori like ? OR penerbit like ? OR tahun_terbit like ? OR letak like ?";
            try ( PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setString(1, kd);
                pst.setString(2, jdl);
                pst.setString(3, nmPengarang);
                pst.setString(4, (String) cbKategori.getSelectedItem());
                pst.setString(5, pnrbt);
                pst.setString(6, thn);
                pst.setString(7, ltk);

                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);

                boolean dataDitemukan = false;
                try ( ResultSet rs = pst.executeQuery()) {
                    while (rs.next()) {
                        String kodeBuku = rs.getString("kode_buku");
                        String judulBuku = rs.getString("judul");
                        String namaPengarang = rs.getString("nama_pengarang");
                        String kategori = rs.getString("kategori");
                        String penerbit = rs.getString("penerbit");
                        String tahunTerbit = rs.getString("tahun_terbit");
                        String letak = rs.getString("letak");
                        String jumlahHlm = rs.getString("jumlah_halaman");
                        String gbrBuku = rs.getString("gambar_buku");
                        String status = rs.getString("status");

                        model.addRow(new Object[]{kodeBuku, judulBuku, namaPengarang, kategori, penerbit, tahunTerbit, letak, jumlahHlm, gbrBuku, status});
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

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        DefaultTableModel recordTable = (DefaultTableModel) jTable1.getModel();
        int selectedRows = jTable1.getSelectedRow();
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            int deleteItem = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data?", "Warning", JOptionPane.YES_NO_OPTION);
            if (deleteItem == JOptionPane.YES_OPTION) {
                conn = getConnection();
                String sql = "DELETE FROM books WHERE kode_buku=?";
                pst = conn.prepareStatement(sql);

                pst.setString(1, recordTable.getValueAt(selectedRows, 0).toString());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record(s) Deleted");

                upDateDB();

                tfKode.setText("");
                tfJudul.setText("");
                tfNamaPengarang.setText("");
                cbKategori.setSelectedItem("Fiksi");
                tfTahun.setText("");
                tfPenerbit.setText("");
                tfJumlahHlm.setText("");
                tfGambar.setText("");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            // Close resources in a finally block
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
    }//GEN-LAST:event_bHapusActionPerformed

    private void bTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTampilActionPerformed
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            conn = getConnection();

            String sql = "SELECT kode_buku, judul, nama_pengarang, kategori, penerbit, tahun_terbit,letak, jumlah_halaman, gambar_buku, status FROM books";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            DefaultTableModel tableModel = new DefaultTableModel();
            jTable1.setModel(tableModel);

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(metaData.getColumnName(i));
            }

            while (rs.next()) {
                Vector<Object> rowData = new Vector<>(columnCount);

                rowData.add(rs.getString("kode_buku"));
                rowData.add(rs.getString("judul"));
                rowData.add(rs.getString("nama_pengarang"));
                rowData.add(rs.getString("kategori"));
                rowData.add(rs.getString("penerbit"));
                rowData.add(rs.getString("tahun_terbit"));
                rowData.add(rs.getString("letak"));
                rowData.add(rs.getString("jumlah_halaman"));
                rowData.add(rs.getString("gambar_buku"));

                String sqlStatus = "SELECT keterangan FROM transaksi WHERE kode_buku = ?";
                try ( PreparedStatement pstStatus = conn.prepareStatement(sqlStatus)) {
                    pstStatus.setString(1, rs.getString("kode_buku"));
                    try ( ResultSet rsStatus = pstStatus.executeQuery()) {
                        if (rsStatus.next()) {
                            String keterangan = rsStatus.getString("keterangan");
                            if ("Pinjam".equals(keterangan)) {
                                rowData.add("Tidak Tersedia");
                            } else if ("Kembali".equals(keterangan)) {
                                rowData.add("Tersedia");
                            }
                        } else {
                            rowData.add("Tersedia");
                        }
                    }
                }
                tableModel.addRow(rowData);
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
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
    }//GEN-LAST:event_bTampilActionPerformed

    private void miLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLogoutActionPerformed
        int logOut = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Message", JOptionPane.YES_NO_OPTION);
        if (logOut == JOptionPane.YES_OPTION) {
            FormHome home;
            home = new FormHome();
            home.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_miLogoutActionPerformed

    private void miBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBukuActionPerformed
        this.setVisible(true);
    }//GEN-LAST:event_miBukuActionPerformed

    private void miPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPeminjamActionPerformed
        Peminjam pinjam = new Peminjam();
        pinjam.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_miPeminjamActionPerformed

    private void miTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTransaksiActionPerformed
        Transaksi ts = new Transaksi();
        this.setVisible(false);
        ts.setVisible(true);
    }//GEN-LAST:event_miTransaksiActionPerformed

    private void tfJumlahHlmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJumlahHlmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJumlahHlmActionPerformed

    private void bUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUploadActionPerformed
    Connection conn = null;
    PreparedStatement pst = null;
    try {
        conn = getConnection();
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();

        filename = f.getAbsolutePath();
        tfGambar.setText(filename);
        
        String newpath = "src/Upload/buku/";
        File directory = new File (newpath);
        if (!directory.exists()){
            directory.mkdirs();}
        File sourceFile = null;
        File destinationFile = null;
        String extension = filename.substring(filename.lastIndexOf('.')+1);
        sourceFile = new File (filename);
        }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace(); // log the exception for debugging purposes
    } finally {
        try {
            if (pst != null) {
                pst.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    }//GEN-LAST:event_bUploadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Database p = new Database();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Database().setVisible(true);
            }
        });
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCari;
    private javax.swing.JButton bHapus;
    private javax.swing.JLabel bJmlHlm;
    private javax.swing.JButton bPrint;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bTampil;
    private javax.swing.JButton bUpdate;
    private javax.swing.JButton bUpload;
    private javax.swing.JComboBox<String> cbKategori;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lJudul;
    private javax.swing.JLabel lKategori;
    private javax.swing.JLabel lKode;
    private javax.swing.JLabel lLetak;
    private javax.swing.JLabel lNamaPengarang;
    private javax.swing.JLabel lPenerbit;
    private javax.swing.JLabel lTahun;
    private javax.swing.JMenu mDatabase;
    private javax.swing.JMenu mHome;
    private javax.swing.JMenuItem miBuku;
    private javax.swing.JMenuItem miLogout;
    private javax.swing.JMenuItem miPeminjam;
    private javax.swing.JMenuItem miTransaksi;
    private javax.swing.JTextField tfGambar;
    private javax.swing.JTextField tfJudul;
    private javax.swing.JTextField tfJumlahHlm;
    private javax.swing.JTextField tfKode;
    private javax.swing.JTextField tfLetak;
    private javax.swing.JTextField tfNamaPengarang;
    private javax.swing.JTextField tfPenerbit;
    private javax.swing.JTextField tfTahun;
    // End of variables declaration//GEN-END:variables
}
