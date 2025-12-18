package model;

public class DetailTransaksi {
    private String idTransaksi;
    private String idRokok;
    private String namaRokok; 
    private int jumlah;
    private double hargaSatuan;
    private double subtotal;

    public DetailTransaksi() {}

    public DetailTransaksi(String idRokok, String namaRokok, int jumlah, double hargaSatuan) {
        this.idRokok = idRokok;
        this.namaRokok = namaRokok;
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
        this.subtotal = jumlah * hargaSatuan;
    }

    public String getIdTransaksi() { 
        return idTransaksi; 
    }
    public void setIdTransaksi(String idTransaksi) { 
        this.idTransaksi = idTransaksi; 
    }

    public String getIdRokok() { 
        return idRokok; 
    }
    public void setIdRokok(String idRokok) { 
        this.idRokok = idRokok; 
    }

    public String getNamaRokok() { 
        return namaRokok; 
    }
    public void setNamaRokok(String namaRokok) { 
        this.namaRokok = namaRokok; 
    }

    public int getJumlah() { 
        return jumlah; 
    }
    public void setJumlah(int jumlah) { 
        this.jumlah = jumlah; 
        this.subtotal = this.jumlah * this.hargaSatuan; 
    }

    public double getHargaSatuan() { 
        return hargaSatuan; 
    }
    public void setHargaSatuan(double hargaSatuan) { 
        this.hargaSatuan = hargaSatuan; 
    }

    public double getSubtotal() { 
        return subtotal; 
    }
    public void setSubtotal(double subtotal) { 
        this.subtotal = subtotal; 
    }
}