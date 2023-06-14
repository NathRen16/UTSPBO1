/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammad.rendy.safutra_2110010327;

/**
 *
 * @author User
 */
public class Guru {

private String nik;
private String nama;
private String tempatLahir;
private String tgglLahir;
private String password;
private String agama;
private String jenisKelamin;
private String telp;
private String email;
private String alamat;
private String pendidikan;
private String status;
private String jabatan;
 
 
public Guru(String nik, String nama, String tempatLahir, String tgglLahir, String password, String agama, String jenisKelamain, String telp, String email, String alamat, String pendidikan, String status, String jabatan) {
       this.nik = nik;
       this.nama = nama;
       this.tempatLahir = tempatLahir;
       this.tgglLahir = tgglLahir;
       this.password = password;
       this.agama = agama;
       this.jenisKelamin = jenisKelamin;
       this.telp = telp;
       this.email = email;
       this.alamat = alamat;
       this.pendidikan = pendidikan;
       this.status = status;
       this.jabatan = jabatan;
   } 

public String getnik(){
       return nik;
   }
   
public void setnik(String nik) {
       this.nik = nik;
   }
public String getnama(){
       return nama;
   }
   
public void setnama(String nama) {
       this.nama = nama;
   }

public String gettempatLahir(){
       return tempatLahir;
   }
   
public void settempatLahir(String tempatLahir) {
       this.tempatLahir = tempatLahir;
   }

public String gettgglLahir(){
       return tgglLahir;
   }
   
public void settggLahir(String tgglLahir) {
       this.tgglLahir = tgglLahir;
   }   

public String getpassword(){
       return password;
   }
   
public void setpassword(String password) {
       this.password = password;
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

public String gettelp(){
       return telp;
   }
   
public void settelp(String telp) {
       this.telp = telp;
   }

public String getemail(){
       return email;
   }
   
public void setemail(String email) {
       this.email = email;
   }

public String getalamat(){
       return alamat;
   }
   
public void setalamat(String alamat) {
       this.alamat = alamat;
   }

public String getpendidikan(){
       return pendidikan;
   }
   
public void setpendidikan(String pendidikan) {
       this.pendidikan = pendidikan;
   }

public String getstatus(){
       return status;
   }
   
public void setstatus(String status) {
       this.status = status;
   }

public String getjabatan(){
       return jabatan;
   }
   
public void setjabatan(String jabatan) {
       this.jabatan = jabatan;
   }

}
