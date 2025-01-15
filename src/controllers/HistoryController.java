import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class HistoryController {
    private HistoryModel model;
    private HistoryView view;

    public HistoryController(HistoryModel model, HistoryView view) {
        this.model = model;
        this.view = view;
        initController();
    }

    private void initController() {
        populateTable();
        view.getLogoutButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Logout logic
            }
        });
    }

    private void populateTable() {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTable().getModel();
        List<HistoryItem> items = model.getHistoryItems();

        for (HistoryItem item : items) {
            tableModel.addRow(new Object[]{
                    item.getKode(),
                    item.getNama(),
                    item.getKategori(),
                    item.getDateIn(),
                    item.getDateOut()
            });
        }
    }
}
