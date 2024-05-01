
package com.mycompany.aplikasiperpus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class AplikasiPerpus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM LATIHAN JDBC");
        System.out.println("====================");

        System.out.println("Mencoba membuat koneksi ke database");

        AplikasiPerpus p = new AplikasiPerpus();

        Connection conn = p.getConnection();
        
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection() {
        String host = "localhost";
        String port = "3306";
        String db = "appperpus";
        String usr = "root";
        String pwd = "";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mariadb://" + host + ":" + port + "/" + db, usr, pwd);
        } catch (SQLException ex) {
            System.out.println("Maaf, koneksi tidak berhasil");
            System.out.println(ex.getMessage());
        }
        if (conn != null) {
            System.out.println("Koneksi ke database berhasil terbentuk");
        } else {
            System.out.println("Maaf, konseksi ke database gagal terbentuk");
        }
        return conn;
    }

}