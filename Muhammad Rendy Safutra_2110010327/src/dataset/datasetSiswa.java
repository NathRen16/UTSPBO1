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
public class datasetSiswa {
   
   private ArrayList<String> nis;
   private ArrayList<String> namaSiswa;
   private ArrayList<String> tempatLahir;
   private ArrayList<String> tgglLahir;
   private ArrayList<String> agama;
   private ArrayList<String> jenisKelamin;
   private ArrayList<String> alamat;
   private ArrayList<String> telp;
   private ArrayList<String> asalSekolah;
   private ArrayList<String> kodeKelas;
   private ArrayList<String> kondisi;
   private ArrayList<String> namaWali;
   
   public datasetSiswa(){
   
    nis = new ArrayList<String>();
    namaSiswa = new ArrayList<String>();
    tempatLahir = new ArrayList<String>();
    tgglLahir = new ArrayList<String>();
    agama = new ArrayList<String>();
    jenisKelamin = new ArrayList<String>();
    alamat = new ArrayList<String>();
    telp = new ArrayList<String>();
    asalSekolah = new ArrayList<String>();
    kodeKelas = new ArrayList<String>();
    kondisi = new ArrayList<String>();
    namaWali = new ArrayList<String>();
}
   
public void tambahnis(String value){
        nis.add(value);
    }
     public ArrayList<String> getdatasetnis(){
        return this.nis;
    }

public void tambahnamaSiswa(String value){
        namaSiswa.add(value);
    }
     public ArrayList<String> getdatasetnamaSiswa(){
        return this.namaSiswa;
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

public void tambahalamat(String value){
        alamat.add(value);
    }
     public ArrayList<String> getdatasetalamat(){
        return this.alamat;
    }

public void tambahtelp(String value){
        telp.add(value);
    }
     public ArrayList<String> getdatasettelp(){
        return this.telp;
    }

public void tambahasalSekolah(String value){
        asalSekolah.add(value);
    }
     public ArrayList<String> getdatasetasalSekolah(){
        return this.asalSekolah;
    }

public void tambahkodeKelas(String value){
        kodeKelas.add(value);
    }
     public ArrayList<String> getdatasetkodeKelas(){
        return this.kodeKelas;
    }

public void tambahkondisi(String value){
        kondisi.add(value);
    }
     public ArrayList<String> getdatasetkondisi(){
        return this.kondisi;
    }

public void tambahnamaWali(String value){
        namaWali.add(value);
    }
     public ArrayList<String> getdatasetnamaWali(){
        return this.namaWali;
    }     
}
