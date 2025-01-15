package view;

import javax.swing.*;
import java.awt.*;

public class LoginView {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton submitButton;

    public LoginView() {
        frame = new JFrame("WareHub");
        frame.setSize(1000, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                Color color1 = new Color(0, 159, 255);
                Color color2 = new Color(236, 47, 75);
                GradientPaint gradient = new GradientPaint(0, 0, color1, getWidth(), getHeight(), color2);
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        backgroundPanel.setBounds(0, 0, 1000, 650);
        backgroundPanel.setLayout(null);

        // Panel Login
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(null);
        loginPanel.setBounds(100, 100, 400, 450);
        loginPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        loginPanel.setBackground(Color.WHITE);

        JLabel loginLabel = new JLabel("LOGIN", JLabel.CENTER);
        loginLabel.setFont(new Font("Arial", Font.BOLD, 24));
        loginLabel.setBounds(0, 20, 400, 30);
        loginPanel.add(loginLabel);

        JLabel usernameLabel = new JLabel("Nama Pengguna");
        usernameLabel.setBounds(20, 70, 100, 20);
        loginPanel.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(20, 100, 330, 35);
        loginPanel.add(usernameField);

        JLabel passwordLabel = new JLabel("Kata Sandi");
        passwordLabel.setBounds(20, 140, 100, 20);
        loginPanel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(20, 170, 330, 35);
        loginPanel.add(passwordField);

        submitButton = new JButton("SUBMIT");
        submitButton.setBounds(125, 220, 100, 30);
        submitButton.setBackground(new Color(0, 0, 255));
        submitButton.setForeground(Color.WHITE);
        loginPanel.add(submitButton);

        backgroundPanel.add(loginPanel);
        frame.add(backgroundPanel);

        // Panel Informasi
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(null);
        infoPanel.setBounds(500, 100, 400, 450);
        infoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        infoPanel.setBackground(new Color(255, 255, 255));

        JLabel logoLabel = new JLabel("WareHub", JLabel.CENTER);
        logoLabel.setFont(new Font("Arial", Font.BOLD, 28));
        logoLabel.setBounds(50, 20, 250, 40);
        infoPanel.add(logoLabel);

        JTextArea infoText = new JTextArea("Gudang ini digunakan untuk menyimpan barang yang terdiri dari " +
                "Furniture dan beberapa jenis makanan. Gudang ini memiliki fasilitas penyimpanan yang luas dan khusus untuk makanan memiliki gudang yang dapat mengontrol suhu." +
                "\n\n1. Menyimpan berbagai jenis barang inventory seperti perabotan, elektronik, dan barang-barang non-perishable lainnya.\n2. Memiliki sistem manajemen stok untuk memastikan barang masuk dan " +
                "keluar memiliki ketersediaan barang selalu tercatat.\n3. Menyediakan sistem keamanan untuk melindungi barang dari penurunan dan kerusakan.");
        infoText.setBounds(20, 70, 310, 300);
        infoText.setEditable(false);
        infoText.setLineWrap(true);
        infoText.setWrapStyleWord(true);
        infoText.setBackground(new Color(255, 255, 255));
        infoPanel.add(infoText);

        backgroundPanel.add(loginPanel);
        backgroundPanel.add(infoPanel);
        frame.add(backgroundPanel);

        frame.setVisible(true);
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }
}
