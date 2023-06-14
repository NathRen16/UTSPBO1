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
public class datasetNilai {
   
   private ArrayList<String> kodeKelas;
   private ArrayList<String> nis;
   private ArrayList<String> nik;
   private ArrayList<String> kodePelajaran;
   private ArrayList<String> nilaiUts;
   private ArrayList<String> nilaiUas;
   private ArrayList<String> nilaiTugas;
   private ArrayList<String> absen;
   
   
   
   
public datasetNilai(){
    
    kodeKelas = new ArrayList<String>();
    nis = new ArrayList<String>();
    nik = new ArrayList<String>();
    kodePelajaran = new ArrayList<String>();
    nilaiUts = new ArrayList<String>();
    nilaiUas = new ArrayList<String>();
    nilaiTugas = new ArrayList<String>();
    absen = new ArrayList<String>();
}

public void tambahkodeKelas(String value){
        kodeKelas.add(value);
    }
     public ArrayList<String> getdatasetkodeKelas(){
        return this.kodeKelas;
    }

public void tambahnis(String value){
        nis.add(value);
    }
     public ArrayList<String> getdatasetnis(){
        return this.nis;
    }

public void tambahnik(String value){
        nik.add(value);
    }
     public ArrayList<String> getdatasetnik(){
        return this.nik;
    }

public void tambahkodePelajaran(String value){
        kodePelajaran.add(value);
    }
     public ArrayList<String> getdatasetkodePelajaran(){
        return this.kodePelajaran;
    }

public void tambahnilaiUts(String value){
        nilaiUts.add(value);
    }
     public ArrayList<String> getdatasetnilaiUts(){
        return this.nilaiUts;
    }

public void tambahnilaiUas(String value){
        nilaiUas.add(value);
    }
     public ArrayList<String> getdatasetnilaiUas(){
        return this.nilaiUas;
    }

public void tambahnilaiTugas(String value){
        nilaiTugas.add(value);
    }
     public ArrayList<String> getdatasetnilaiTugas(){
        return this.nilaiTugas;
    }

public void tambahabsen(String value){
        absen.add(value);
    }
     public ArrayList<String> getdatasetabsen(){
        return this.absen;
    }     

}
