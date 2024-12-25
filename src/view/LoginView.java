package view;
import javax.swing.*;
import java.awt.*;

public class LoginView {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("GBU Corp Login");
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create background panel
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setBounds(0, 0, 1000, 600);
        backgroundPanel.setBackground(new Color(240, 240, 255));
        backgroundPanel.setLayout(null);

        // Login panel
        JPanel loginPanel = new JPanel();
        loginPanel.setBounds(50, 100, 400, 450);
        backgroundPanel.setBackground(new Color(240, 240, 255));

        loginPanel.setLayout(null);

        JLabel loginLabel = new JLabel("LOGIN");
        loginLabel.setFont(new Font("Arial", Font.BOLD, 20));
        loginLabel.setBounds(120, 20, 100, 30);
        loginPanel.add(loginLabel);

        // Username
        JLabel usernameLabel = new JLabel("User Name");
        usernameLabel.setBounds(20, 70, 100, 20);
        loginPanel.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(20, 100, 310, 30);
        loginPanel.add(usernameField);

        // Password
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(20, 140, 100, 20);
        loginPanel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(20, 170, 310, 30);
        loginPanel.add(passwordField);

        // Submit button
        JButton submitButton = new JButton("SUBMIT");
        submitButton.setBounds(120, 220, 100, 30);
        submitButton.setBackground(new Color(0, 0, 255));
        submitButton.setForeground(Color.WHITE);
        loginPanel.add(submitButton);

        // Social login
        JLabel socialLabel = new JLabel("Login With");
        socialLabel.setBounds(130, 260, 100, 20);
        loginPanel.add(socialLabel);

        JButton googleButton = new JButton(new ImageIcon("google_icon.png"));
        googleButton.setBounds(90, 290, 40, 40);
        loginPanel.add(googleButton);

        JButton facebookButton = new JButton(new ImageIcon("facebook_icon.png"));
        facebookButton.setBounds(170, 290, 40, 40);
        loginPanel.add(facebookButton);

        // Information panel
        JPanel infoPanel = new JPanel();
        infoPanel.setBounds(400, 100, 350, 400);
        backgroundPanel.setBackground(new Color(240, 240, 255));
        infoPanel.setLayout(null);

        JLabel logoLabel = new JLabel("GBU CORP", JLabel.CENTER);
        logoLabel.setFont(new Font("Arial", Font.BOLD, 24));
        logoLabel.setBounds(50, 20, 250, 40);
        infoPanel.add(logoLabel);

        JTextArea infoText = new JTextArea("Gudang ini digunakan untuk menyimpan barang yang terdiri dari Furniture dan beberapa jenis makanan. Gudang ini memiliki fasilitas penyimpanan yang luas dan khusus untuk makanan memiliki gudang yang dapat mengontrol suhu.\n\n1. Menyimpan berbagai jenis barang inventory seperti perabotan, elektronik, dan barang-barang non-perishable lainnya.\n2. Memiliki sistem manajemen stok untuk memastikan barang masuk dan keluar memiliki ketersediaan barang selalu tercatat.\n3. Menyediakan sistem keamanan untuk melindungi barang dari penurunan dan kerusakan.");
        infoText.setBounds(20, 70, 310, 300);
        infoText.setEditable(false);
        infoText.setLineWrap(true);
        infoText.setWrapStyleWord(true);
        infoText.setBackground(new Color(255, 255, 255));
        infoPanel.add(infoText);

        // Adjust panels for centered alignment
        Dimension screenSize = frame.getSize();
        int panelWidth = 350;
        int panelHeight = 400;
        int xMargin = (screenSize.width - (2 * panelWidth + 50)) / 2;

        loginPanel.setBounds(xMargin, (screenSize.height - panelHeight) / 2, panelWidth, panelHeight);
        infoPanel.setBounds(xMargin + panelWidth + 50, (screenSize.height - panelHeight) / 2, panelWidth, panelHeight);

        // Add panels to frame
        backgroundPanel.add(loginPanel);
        backgroundPanel.add(infoPanel);
        frame.add(backgroundPanel);

        frame.setVisible(true);
    }
}
