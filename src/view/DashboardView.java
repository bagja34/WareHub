package view;

import javax.swing.*;
import java.awt.*;

public class DashboardView {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Manajemen Gudang");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1200, 800);
            frame.setLayout(new BorderLayout());

            JPanel sidebar = new JPanel();
            sidebar.setLayout(new GridLayout(5, 1));
            sidebar.setBackground(Color.DARK_GRAY);

            JButton dashboardButton = new JButton("DASHBOARD");
            JButton gudangButton = new JButton("GUDANG");
            JButton pembayaranButton = new JButton("PEMBAYARAN");
            JButton laporanButton = new JButton("LAPORAN");
            JButton logoutButton = new JButton("LOG OUT");

            sidebar.add(dashboardButton);
            sidebar.add(gudangButton);
            sidebar.add(pembayaranButton);
            sidebar.add(laporanButton);
            sidebar.add(logoutButton);

            // Dashboard Panel
            JPanel dashboardPanel = new JPanel();
            dashboardPanel.setLayout(new GridLayout(2, 2, 10, 10));
            dashboardPanel.setBackground(Color.WHITE);

            JPanel incomePanel = createChartPanel("Income Chart");
            JPanel itemPanel = createChartPanel("Item Movement");
            JPanel statsPanel = createStatsPanel();
            JPanel tablePanel = createTablePanel();

            dashboardPanel.add(incomePanel);
            dashboardPanel.add(itemPanel);
            dashboardPanel.add(statsPanel);
            dashboardPanel.add(tablePanel);

            frame.add(sidebar, BorderLayout.WEST);
            frame.add(dashboardPanel, BorderLayout.CENTER);

            frame.setVisible(true);
        });
    }

    private static JPanel createChartPanel(String title) {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(title));
        panel.setBackground(Color.LIGHT_GRAY);
        return panel;
    }

    private static JPanel createStatsPanel() {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Statistics"));
        panel.setLayout(new GridLayout(3, 2));

        JLabel foodFreezeLabel = new JLabel("Food Freeze:");
        JProgressBar foodFreezeProgress = new JProgressBar(0, 100);
        foodFreezeProgress.setValue(40);

        JLabel foodNormalLabel = new JLabel("Food Normal:");
        JProgressBar foodNormalProgress = new JProgressBar(0, 100);
        foodNormalProgress.setValue(65);

        JLabel furnitureLabel = new JLabel("Furniture:");
        JProgressBar furnitureProgress = new JProgressBar(0, 100);
        furnitureProgress.setValue(95);

        panel.add(foodFreezeLabel);
        panel.add(foodFreezeProgress);
        panel.add(foodNormalLabel);
        panel.add(foodNormalProgress);
        panel.add(furnitureLabel);
        panel.add(furnitureProgress);

        return panel;
    }

    private static JPanel createTablePanel() {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Customer Orders"));

        String[] columnNames = {"No", "ID Cos", "Jenis", "Jumlah"};
        Object[][] data = {
                {"01", "FN845", "Food Normal", "25348/pallet"},
                {"02", "FU100", "Furniture", "112307/pallet"},
                {"03", "FF405", "Food Freeze", "25000/pallet"},
                {"04", "FU233", "Furniture", "1290/pallet"},
                {"05", "FF845", "Food Freeze", "1200/pallet"},
        };

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        panel.setLayout(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        return panel;
    }
}