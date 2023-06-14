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
public class datasetjadwalSiswa {
    
   private ArrayList<String> idJadwal;
   private ArrayList<String> kodeKelas;
   private ArrayList<String> kodePelajaran;
   private ArrayList<String> nik;
   private ArrayList<String> jamMasuk;
   private ArrayList<String> hariMasuk;


public datasetjadwalSiswa(){
   
    idJadwal = new ArrayList<String>();
    kodeKelas = new ArrayList<String>();
    kodePelajaran = new ArrayList<String>();
    nik = new ArrayList<String>();
    jamMasuk = new ArrayList<String>();
    hariMasuk = new ArrayList<String>();
}

public void tambahidJadwal(String value){
        idJadwal.add(value);
    }
     public ArrayList<String> getdatasetidJadwal(){
        return this.idJadwal;
}
public void tambahkodeKelas(String value){
        kodeKelas.add(value);
    }
     public ArrayList<String> getdatasetkodeKelas(){
        return this.kodeKelas;
    }

public void tambahkodePelajaran(String value){
        kodePelajaran.add(value);
    }
     public ArrayList<String> getdatasetkodePelajaran(){
        return this.kodePelajaran;
    }

public void tambahnik(String value){
        nik.add(value);
    }
     public ArrayList<String> getdatasetnik(){
        return this.nik;
    }

public void tambahjamMasuk(String value){
        jamMasuk.add(value);
    }
     public ArrayList<String> getdatasetjamMasuk(){
        return this.jamMasuk;
    } 

public void tambahhariMasuk(String value){
        hariMasuk.add(value);
    }
     public ArrayList<String> getdatasethariMasuk(){
        return this.hariMasuk;
    }          
}


