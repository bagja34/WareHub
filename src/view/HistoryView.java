package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class HistoryView extends JFrame {
    private JTable table;
    private JButton logoutButton;
    private JButton dashboardButton;
    private JTextField searchField;

    public HistoryView() {
        setTitle("Manajemen Gudang - History");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLayout(new BorderLayout());

        // Sidebar
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBackground(Color.DARK_GRAY);

        JLabel logoLabel = new JLabel("WareHub");
        logoLabel.setFont(new Font("Arial", Font.BOLD, 18));
        logoLabel.setForeground(Color.WHITE);
        logoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        dashboardButton = new JButton("DASHBOARD");
        dashboardButton.setFont(new Font("Arial", Font.BOLD, 16));
        dashboardButton.setForeground(Color.WHITE);
        dashboardButton.setBackground(Color.GRAY);

        logoutButton = new JButton("Log Out");
        logoutButton.setFont(new Font("Arial", Font.BOLD, 16));
        logoutButton.setForeground(Color.WHITE);
        logoutButton.setBackground(Color.RED);

        sidebar.add(Box.createVerticalStrut(20));
        sidebar.add(logoLabel);
        sidebar.add(Box.createVerticalStrut(30));
        sidebar.add(dashboardButton);
        sidebar.add(Box.createVerticalStrut(10));
        sidebar.add(logoutButton);

        add(sidebar, BorderLayout.WEST);

        // Main Content
        JPanel mainContent = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel("HISTORY", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

        searchField = new JTextField("Search...");
        searchField.setFont(new Font("Arial", Font.PLAIN, 14));
        searchField.setHorizontalAlignment(JTextField.LEFT);

        table = new JTable(new DefaultTableModel(
                new Object[][]{},
                new String[]{"Kode", "Nama", "Kategori", "Date In", "Date Out"}
        ));
        table.setRowHeight(25);
        table.setFont(new Font("Arial", Font.PLAIN, 14));
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16));
        table.setShowGrid(false);

        JScrollPane tableScrollPane = new JScrollPane(table);

        mainContent.add(titleLabel, BorderLayout.NORTH);
        mainContent.add(tableScrollPane, BorderLayout.CENTER);
        mainContent.add(searchField, BorderLayout.SOUTH);

        add(mainContent, BorderLayout.CENTER);

        setLocationRelativeTo(null);

        // Button Actions
        dashboardButton.addActionListener(e -> {
            new DashboardView().setVisible(true);
            dispose();
        });

        logoutButton.addActionListener(e -> {
            new LoginView().setVisible(true);
            dispose();
        });
    }

    public JTable getTable() {
        return table;
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }

    public JButton getDashboardButton() {
        return dashboardButton;
    }

    public JTextField getSearchField() {
        return searchField;
    }

    public void showView() {
        setVisible(true);
    }
}
