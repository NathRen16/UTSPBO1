/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammad.rendy.safutra_2110010327;


/**
 *
 * @author User
 */
public class Nilai {
private String kodeKelas;
private String nis;
private String nik;
private String kodePelajaran;
private String nilaiUts;
private String nilaiUas;
private String nilaiTugas;
private String absen;

public Nilai(String kodeKelas, String nis, String nik, String kodePelajaran, String nilaiUts, String nilaiUas, String nilaiTugas, String absen) {
       this.kodeKelas = kodeKelas;
       this.nis = nis;
       this.nik = nik;
       this.kodePelajaran = kodePelajaran;
       this.nilaiUts = nilaiUts;
       this.nilaiUas = nilaiUas;
       this.nilaiTugas = nilaiTugas;
       this.absen = absen;
   }

public String getkodeKelas(){
       return kodeKelas;
   }
   
public void setkodeKelas(String kodeKelas) {
       this.kodeKelas = kodeKelas;
   }
   
public String getnis(){
       return nis;
   }
   
public void setnis(String nis) {
       this.nis = nis;
   }

public String getnik(){
       return nik;
   }
   
public void setnik(String nik) {
       this.nik = nik;
   }

public String getkodePelajaran(){
       return kodePelajaran;
   }
   
public void setkodePelajaran(String kodePelajaran) {
       this.kodePelajaran = kodePelajaran;
}

public String getnilaiUts(){
       return nilaiUts;
   }
   
public void setnilaiUts(String nilaiUts) {
       this.nilaiUts = nilaiUts;
   }
   
public String getnilaiUas(){
       return nilaiUas ;
   }

public void setnilaiUas(String nilaiUas) {
       this.nilaiUas = nilaiUas;
   }

public String getnilaiTugas(){
       return nilaiTugas;
   }
   
public void setnilaiTugas(String nilaiTugas) {
       this.nilaiTugas = nilaiTugas;
   }
   
public String getabsen(){
       return absen;
   }
   
public void setabsen(String absen) {
       this.absen = absen;
   }  
}    