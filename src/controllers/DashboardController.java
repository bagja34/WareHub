package controllers;

import java.sql.Connection;
import java.sql.DriverManager;

public class DashboardController {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/warehub";
        String user = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("Koneksi ke database berhasil!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
