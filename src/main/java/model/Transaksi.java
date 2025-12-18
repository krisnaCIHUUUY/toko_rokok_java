package model;

import java.util.ArrayList;
import java.util.List;

public class Transaksi {
    private String idTransaksi;
    private String tglTransaksi;
    private double totalBayar;
    private List<DetailTransaksi> items; 

    public Transaksi() {
        this.items = new ArrayList<>();
    }

    public String getIdTransaksi() { 
        return idTransaksi; 
    }
    public void setIdTransaksi(String idTransaksi) { 
        this.idTransaksi = idTransaksi; 
    }

    public String getTglTransaksi() { 
        return tglTransaksi; 
    }
    public void setTglTransaksi(String tglTransaksi) { 
        this.tglTransaksi = tglTransaksi; 
    }

    public double getTotalBayar() { 
        return totalBayar; 
    }
    public void setTotalBayar(double totalBayar) { 
        this.totalBayar = totalBayar; 
    }

    public List<DetailTransaksi> getItems() { 
        return items; 
    }
    public void setItems(List<DetailTransaksi> items) { 
        this.items = items; 
    }

    public void tambahItem(DetailTransaksi detail) {
        this.items.add(detail);
    }
}