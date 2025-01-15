package view;

import java.util.Date;


public class input_barang {
    // Attributes matching the table columns
    private int idBarang;
    private String namaBarang;
    private String kapasitas;
    private String jenisBarang; // Should match enum ('Food', 'Furniture', etc.)
    private String status;
    private int berat;
    private String jenisMakanan; // Should match enum ('Dingin', 'Biasa', etc.)
    private Date expired;
    private String bahan;
    private int dimensi;
    private int idCustomer;

    // Constructor
    public input_barang(int idBarang, String namaBarang, String kapasitas, String jenisBarang, String status,
                        int berat, String jenisMakanan, Date expired, String bahan, int dimensi, int idCustomer) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.kapasitas = kapasitas;
        this.jenisBarang = jenisBarang;
        this.status = status;
        this.berat = berat;
        this.jenisMakanan = jenisMakanan;
        this.expired = expired;
        this.bahan = bahan;
        this.dimensi = dimensi;
        this.idCustomer = idCustomer;
    }

    // Getters and Setters
    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    public Date getExpired() {
        return expired;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public int getDimensi() {
        return dimensi;
    }

    public void setDimensi(int dimensi) {
        this.dimensi = dimensi;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    // Method to display object details
    @Override
    public String toString() {
        return "input_barang{" +
                "idBarang=" + idBarang +
                ", namaBarang='" + namaBarang + '\'' +
                ", kapasitas='" + kapasitas + '\'' +
                ", jenisBarang='" + jenisBarang + '\'' +
                ", status='" + status + '\'' +
                ", berat=" + berat +
                ", jenisMakanan='" + jenisMakanan + '\'' +
                ", expired=" + expired +
                ", bahan='" + bahan + '\'' +
                ", dimensi=" + dimensi +
                ", idCustomer=" + idCustomer +
                '}';
    }
}