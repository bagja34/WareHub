import java.util.List;

public class HistoryModel {
    private List<HistoryItem> historyItems;

    public HistoryModel(List<HistoryItem> historyItems) {
        this.historyItems = historyItems;
    }

    public List<HistoryItem> getHistoryItems() {
        return historyItems;
    }
}

class HistoryItem {
    private String kode;
    private String nama;
    private String kategori;
    private String dateIn;
    private String dateOut;

    public HistoryItem(String kode, String nama, String kategori, String dateIn, String dateOut) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public String getDateIn() {
        return dateIn;
    }

    public String getDateOut() {
        return dateOut;
    }
}
