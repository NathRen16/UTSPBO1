/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammad.rendy.safutra_2110010327;


/**
 *
 * @author User
 */
public class Siswa {
   private String nis;
   private String namaSiswa;
   private String tempatLahir;
   private String tgglLahir;
   private String agama;
   private String jenisKelamin;
   private String alamat;
   private String telp;
   private String asalSekolah;
   private String kodeKelas;
   private String kondisi;
   private String namaWali;
    
public Siswa(String nis, String namaSiswa, String tempatLahir, String tgglLahir, String agama, String jenisKelamin, String alamat, String telp, String asalSekolah, String kodeKelas, String kondisi, String status, String namaWali) {
       this.nis = nis;
       this.namaSiswa = namaSiswa;
       this.tempatLahir = tempatLahir;
       this.tgglLahir = tgglLahir;
       this.agama = agama;
       this.jenisKelamin = jenisKelamin;
       this.alamat = alamat;
       this.telp = telp;
       this.asalSekolah = asalSekolah;
       this.kodeKelas = kodeKelas;
       this.kondisi = kondisi;
       this.namaWali = namaWali;
   } 
    
public String getnis(){
       return namaSiswa;
   }
   
public void setnis(String nis) {
       this.nis = nis;
   }
public String getnamaSiswa(){
       return namaSiswa;
   }
   
public void setnamaSiswa(String namaSiswa) {
       this.namaSiswa = namaSiswa;
   }
public String gettempatlahir(){
       return tempatLahir;
   }
   
public void settempatLahir(String tempatLahir) {
       this.tempatLahir = tempatLahir;
   }

public String gettgglLahir(){
       return tgglLahir;
   }
   
public void settgglahir(String tgglLahir) {
       this.tgglLahir = tgglLahir;
   }

public String getagama(){
       return agama;
   }
   
public void setagama(String agama) {
       this.agama = agama;
   }

public String getjenisKelamin(){
       return jenisKelamin;
   }
   
public void setjenisKelamin(String jenisKelamin) {
       this.jenisKelamin = jenisKelamin;
   }
public String getalamat(){
       return alamat;
   }
   
public void setalamat(String alamat) {
       this.alamat = alamat;
   }

public String gettelp(){
       return telp;
   }
   
public void settelp(String telp) {
       this.telp = telp;
   }

public String getasalSekolah(){
       return asalSekolah;
   }
   
public void setasalSekolah(String asalSekolah) {
       this.asalSekolah = asalSekolah;
   }
public String getkodeKelas(){
       return kodeKelas;
   }
   
public void setkodeKelas(String kodeKelas) {
       this.kodeKelas = kodeKelas;
   }

public String getkondisi(){
       return kondisi;
   }
   
public void setkondisi(String kondisi) {
       this.kondisi = kondisi;
   }
public String getnamaWali(){
       return namaWali;
   }
   
public void setnamaWali(String namaWali) {
       this.namaWali = namaWali;
   }

}    