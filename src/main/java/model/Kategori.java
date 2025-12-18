/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Kategori {
    private int idKategori;
    private String namaKategori;
    
    public Kategori(int id, String namaKategori){
        this.idKategori = id;
        this.namaKategori = namaKategori;
    }
    
    public int getId(){
        return this.idKategori;
    }
    
    public void setId(int newId){
        this.idKategori = newId;
    }
    
    public String getNamaKategori(){
        return this.namaKategori;
    }
    
    public void setNamaKategori(String namaKategori){
        this.namaKategori = namaKategori;
    }
}
