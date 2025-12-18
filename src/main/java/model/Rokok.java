/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Rokok {
    private String idRokok;
    private String namaRokok;
    private double hargaRokok;
    private int stok;
    private int idKategori;
    
    public Rokok(String id, String namaRokok, double hargaRokok, int stok, int idKategori){
        this.idRokok = id;
        this.namaRokok = namaRokok;
        this.hargaRokok = hargaRokok;
        this.stok = stok;
        this.idKategori = idKategori;
    }
      
    public String getId(){
        return this.idRokok;
    }
    
    public void setId(String newId){
        this.idRokok = newId;
    }
    
    public String getNamaRokok(){
        return this.namaRokok;
    }
    
    public void setNamaRokok(String namaRokok){
        this.namaRokok = namaRokok;
    }
    
    public double getHargaRokok(){
        return this.hargaRokok;
    }
    
    public void setHargaRokok(double harga){

        this.hargaRokok = harga;

        
    }
    public int getStok(){
        return this.stok;
    }
    
    public void setStok(int stokBaru){
        this.stok = stokBaru;
    }
    public int getIdKategori(){
        return this.idKategori;
    }
    
    public void setIdKategori(int idKategori){
        this.idKategori = idKategori;
    }
            
}
