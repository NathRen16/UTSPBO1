/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class datasetGuru {
   
   private ArrayList<String> nik;
   private ArrayList<String> nama;
   private ArrayList<String> tempatLahir;
   private ArrayList<String> tgglLahir;
   private ArrayList<String> password;
   private ArrayList<String> agama;
   private ArrayList<String> jenisKelamin;
   private ArrayList<String> telp;
   private ArrayList<String> email;
   private ArrayList<String> alamat;
   private ArrayList<String> pendidikan;
   private ArrayList<String> status;
   private ArrayList<String> jabatan;
   
   public datasetGuru(){
   
    nik = new ArrayList<String>();
    nama = new ArrayList<String>();
    tempatLahir = new ArrayList<String>();
    tgglLahir = new ArrayList<String>();
    password = new ArrayList<String>();
    agama = new ArrayList<String>();
    jenisKelamin = new ArrayList<String>();
    telp = new ArrayList<String>();
    email = new ArrayList<String>();
    alamat = new ArrayList<String>();
    pendidikan = new ArrayList<String>();
    status = new ArrayList<String>();
    jabatan = new ArrayList<String>();
}
public void tambahnik(String value){
        nik.add(value);
    }
     public ArrayList<String> getdatasetnik(){
        return this.nik;
    }
     
     public void tambahnama(String value){
        nama.add(value);
    }
     public ArrayList<String> getdatasetnama(){
        return this.nama;
    }
     
     public void tambahtempatLahir(String value){
        tempatLahir.add(value);
    }
     public ArrayList<String> getdatasettempatLahir(){
        return this.tempatLahir;
    }
     
     public void tambahtgglLahir(String value){
        tgglLahir.add(value);
    }
     public ArrayList<String> getdatasettgglLahir(){
        return this.tgglLahir;
    }
    
    public void tambahpassword(String value){
        password.add(value);
    }
     public ArrayList<String> getdatasetpassword(){
        return this.password;
    }
     public void tambahagama(String value){
        agama.add(value);
    }
     public ArrayList<String> getdatasetagama(){
        return this.agama;
    }
     public void tambahjenisKelamin(String value){
        jenisKelamin.add(value);
    }
     public ArrayList<String> getdatasetjenisKelamin(){
        return this.jenisKelamin;
    }
    
     public void tambahtelp(String value){
        telp.add(value);
    }
     public ArrayList<String> getdatasettelp(){
        return this.telp;
    }
     public void tambahemail(String value){
        email.add(value);
    }
     public ArrayList<String> getdatasetemail(){
        return this.email;
    }
     
     public void tambahalamat(String value){
        alamat.add(value);
    }
     public ArrayList<String> getdatasetalamat(){
        return this.alamat;
    }
    
    public void tambahpendidikan(String value){
        pendidikan.add(value);
    }
     public ArrayList<String> getdatasetpendidikan(){
        return this.pendidikan;
    }
    
    public void tambahstatus(String value){
        status.add(value);
    }
     public ArrayList<String> getdatasetstatus(){
        return this.status;
    }
    
    public void tambahjabatan(String value){
        jabatan.add(value);
    }
     public ArrayList<String> getdatasetjabatan(){
        return this.jabatan;
    } 
}
