package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Date;

public class input_barang extends JFrame {

    public input_barang() {
        setTitle("Input Barang");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(12, 2, 5, 5));

        // Add components
        JLabel idBarangLabel = new JLabel("ID Barang:");
        JTextField idBarangField = new JTextField();

        JLabel namaBarangLabel = new JLabel("Nama Barang:");
        JTextField namaBarangField = new JTextField();

        JLabel kapasitasLabel = new JLabel("Kapasitas:");
        JTextField kapasitasField = new JTextField();

        JLabel jenisBarangLabel = new JLabel("Jenis Barang:");
        JComboBox<String> jenisBarangBox = new JComboBox<>(new String[]{"Food", "Furniture", "Electronics"});

        JLabel statusLabel = new JLabel("Status:");
        JTextField statusField = new JTextField();

        JLabel beratLabel = new JLabel("Berat:");
        JTextField beratField = new JTextField();

        JLabel jenisMakananLabel = new JLabel("Jenis Makanan:");
        JComboBox<String> jenisMakananBox = new JComboBox<>(new String[]{"Dingin", "Biasa"});

        JLabel expiredLabel = new JLabel("Expired (yyyy-mm-dd):");
        JTextField expiredField = new JTextField();

        JLabel bahanLabel = new JLabel("Bahan:");
        JTextField bahanField = new JTextField();

        JLabel dimensiLabel = new JLabel("Dimensi:");
        JTextField dimensiField = new JTextField();

        JLabel idCustomerLabel = new JLabel("ID Customer:");
        JTextField idCustomerField = new JTextField();

        JButton submitButton = new JButton("Submit");
        JButton backButton = new JButton("Kembali ke Dashboard");
        JTextArea outputArea = new JTextArea(5, 30);
        outputArea.setEditable(false);

        // Add components to panel
        panel.add(idBarangLabel);
        panel.add(idBarangField);
        panel.add(namaBarangLabel);
        panel.add(namaBarangField);
        panel.add(kapasitasLabel);
        panel.add(kapasitasField);
        panel.add(jenisBarangLabel);
        panel.add(jenisBarangBox);
        panel.add(statusLabel);
        panel.add(statusField);
        panel.add(beratLabel);
        panel.add(beratField);
        panel.add(jenisMakananLabel);
        panel.add(jenisMakananBox);
        panel.add(expiredLabel);
        panel.add(expiredField);
        panel.add(bahanLabel);
        panel.add(bahanField);
        panel.add(dimensiLabel);
        panel.add(dimensiField);
        panel.add(idCustomerLabel);
        panel.add(idCustomerField);
        panel.add(submitButton);

        // Add panel to frame
        add(panel, BorderLayout.CENTER);
        add(new JScrollPane(outputArea), BorderLayout.SOUTH);

        // Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(submitButton);
        buttonPanel.add(backButton);
        add(buttonPanel, BorderLayout.NORTH);

        // Submit button action
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/warehub", "root", "")) {
                    int idBarang = Integer.parseInt(idBarangField.getText());
                    String namaBarang = namaBarangField.getText();
                    String kapasitas = kapasitasField.getText();
                    String jenisBarang = (String) jenisBarangBox.getSelectedItem();
                    String status = statusField.getText();
                    int berat = Integer.parseInt(beratField.getText());
                    String jenisMakanan = (String) jenisMakananBox.getSelectedItem();
                    Date expired = java.sql.Date.valueOf(expiredField.getText());
                    String bahan = bahanField.getText();
                    int dimensi = Integer.parseInt(dimensiField.getText());
                    int idCustomer = Integer.parseInt(idCustomerField.getText());

                    String sql = "INSERT INTO barang (id_barang, nama_barang, kapasitas, Jenis_barang, status, berat, jenis_makanan, expired, bahan, dimensi, id_customer) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setInt(1, idBarang);
                    pstmt.setString(2, namaBarang);
                    pstmt.setString(3, kapasitas);
                    pstmt.setString(4, jenisBarang);
                    pstmt.setString(5, status);
                    pstmt.setInt(6, berat);
                    pstmt.setString(7, jenisMakanan);
                    pstmt.setDate(8, new java.sql.Date(expired.getTime()));
                    pstmt.setString(9, bahan);
                    pstmt.setInt(10, dimensi);
                    pstmt.setInt(11, idCustomer);

                    int rowsInserted = pstmt.executeUpdate();

                    if (rowsInserted > 0) {
                        outputArea.setText("Data berhasil dimasukkan ke database.");
                    } else {
                        outputArea.setText("Gagal memasukkan data ke database.");
                    }
                } catch (Exception ex) {
                    outputArea.setText("Error: " + ex.getMessage());
                }
            }
        });

        // Back button action
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DashboardView().setVisible(true);
                dispose(); // Menutup jendela input_barang
            }
        });

        setLocationRelativeTo(null);
    }
}
