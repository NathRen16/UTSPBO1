/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammad.rendy.safutra_2110010327;


/**
 *
 * @author User
 */
public class jadwalSiswa {
    String idJadwal;
    String kodeKelas;
    String kodePelajaran;
    String nik;
    String jamMasuk;
    String hariMasuk;
    
public jadwalSiswa(String idJadwal, String kodeKelas, String kodePelajaran, String nik, String jamMasuk, String hariMasuk) {
       this.idJadwal = idJadwal;
       this.kodeKelas = kodeKelas;
       this.kodePelajaran = kodePelajaran;
       this.nik = nik;
       this.jamMasuk = jamMasuk;
       this.hariMasuk = hariMasuk;
   }   

public String getidJadwal(){
       return idJadwal;
   }
   
   public void setidJadwal(String idJadwal) {
       this.idJadwal = idJadwal;
   }
 
public String getkodeKelas(){
       return kodeKelas;
   }
   
   public void setkodeKelas(String kodeKelas) {
       this.kodeKelas = kodeKelas;
   }   

public String getkodePelajaran(){
       return kodePelajaran;
   }
   
   public void setkodePelajaran(String kodePelajaran) {
       this.kodePelajaran = kodePelajaran;
   }   
public String getnik(){
       return nik;
   }
   
   public void setnik(String nik) {
       this.nik = nik;
   }

public String getjamMasuk(){
       return jamMasuk;
   }
   
   public void setjamMasuk(String jamMasuk) {
       this.jamMasuk = jamMasuk;
   }   
   
public String gethariMasuk(){
       return hariMasuk;
   }
   
   public void sethariMasuk(String hariMasuk) {
       this.hariMasuk = hariMasuk;
   }   
}