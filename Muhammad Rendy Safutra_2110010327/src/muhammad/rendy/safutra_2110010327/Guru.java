/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammad.rendy.safutra_2110010327;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Guru {

 String nik;
 String nama;
 String tempatLahir;
 String tgglLahir;
 String password;
 String agama;
 String jenisKelamin;
 String telp;
 String email;
 String alamat;
 String pendidikan;
 String status;
 String jabatan;
 
 public Guru(String paramNik){
     nik = paramNik;   
 }
 public Guru(String paramNik,String paramNama){
     nik = paramNik;
     nama = paramNama;
 }
 public Guru(String paramNik,String paramNama,String paramTempatLahir){
     nik = paramNik;
     nama = paramNama;
     tempatLahir = paramTempatLahir;
 }
 public Guru(String paramNik,String paramNama,String paramTempatLahir,String paramTgglLahir){
     nik = paramNik;
     nama = paramNama;
     tempatLahir = paramTempatLahir;
     tgglLahir = paramTgglLahir;
 }
 public Guru(String paramNik,String paramNama,String paramTempatLahir,String paramTgglLahir,String paramPassword){
     nik = paramNik;
     nama = paramNama;
     tempatLahir = paramTempatLahir;
     tgglLahir = paramTgglLahir;
     password = paramPassword;
 }
 public Guru(String paramNik,String paramNama,String paramTempatLahir,String paramTgglLahir,String paramPassword,String paramAgama){
     nik = paramNik;
     nama = paramNama;
     tempatLahir = paramTempatLahir;
     tgglLahir = paramTgglLahir;
     password = paramPassword;
     agama = paramAgama;
 }
 public Guru(String paramNik,String paramNama,String paramTempatLahir,String paramTgglLahir,String paramPassword,String paramAgama,String paramJenisKelamin){
     nik = paramNik;
     nama = paramNama;
     tempatLahir = paramTempatLahir;
     tgglLahir = paramTgglLahir;
     password = paramPassword;
     agama = paramAgama;
     jenisKelamin = paramJenisKelamin;
 }
 public Guru(String paramNik,String paramNama,String paramTempatLahir,String paramTgglLahir,String paramPassword,String paramAgama,String paramJenisKelamin,String paramTelp){
     nik = paramNik;
     nama = paramNama;
     tempatLahir = paramTempatLahir;
     tgglLahir = paramTgglLahir;
     password = paramPassword;
     agama = paramAgama;
     jenisKelamin = paramJenisKelamin;
     telp = paramTelp;
 }
 public Guru(String paramNik,String paramNama,String paramTempatLahir,String paramTgglLahir,String paramPassword,String paramAgama,String paramJenisKelamin,String paramTelp,String paramEmail){
     nik = paramNik;
     nama = paramNama;
     tempatLahir = paramTempatLahir;
     tgglLahir = paramTgglLahir;
     password = paramPassword;
     agama = paramAgama;
     jenisKelamin = paramJenisKelamin;
     telp = paramTelp;
     email = paramEmail;
 }
 public Guru(String paramNik,String paramNama,String paramTempatLahir,String paramTgglLahir,String paramPassword,String paramAgama,String paramJenisKelamin,String paramTelp,String paramEmail,String paramAlamat){
     nik = paramNik;
     nama = paramNama;
     tempatLahir = paramTempatLahir;
     tgglLahir = paramTgglLahir;
     password = paramPassword;
     agama = paramAgama;
     jenisKelamin = paramJenisKelamin;
     telp = paramTelp;
     email = paramEmail;
     alamat = paramAlamat;
 }
 public Guru(String paramNik,String paramNama,String paramTempatLahir,String paramTgglLahir,String paramPassword,String paramAgama,String paramJenisKelamin,String paramTelp,String paramEmail,String paramAlamat,String paramPendidikan){
     nik = paramNik;
     nama = paramNama;
     tempatLahir = paramTempatLahir;
     tgglLahir = paramTgglLahir;
     password = paramPassword;
     agama = paramAgama;
     jenisKelamin = paramJenisKelamin;
     telp = paramTelp;
     email = paramEmail;
     alamat = paramAlamat;
     pendidikan = paramPendidikan;
 }
 public Guru(String paramNik,String paramNama,String paramTempatLahir,String paramTgglLahir,String paramPassword,String paramAgama,String paramJenisKelamin,String paramTelp,String paramEmail,String paramAlamat,String paramPendidikan,String paramStatus){
     nik = paramNik;
     nama = paramNama;
     tempatLahir = paramTempatLahir;
     tgglLahir = paramTgglLahir;
     password = paramPassword;
     agama = paramAgama;
     jenisKelamin = paramJenisKelamin;
     telp = paramTelp;
     email = paramEmail;
     alamat = paramAlamat;
     pendidikan = paramPendidikan;
     status = paramStatus;
 }
 public Guru(String paramNik,String paramNama,String paramTempatLahir,String paramTgglLahir,String paramPassword,String paramAgama,String paramJenisKelamin,String paramTelp,String paramEmail,String paramAlamat,String paramPendidikan,String paramStatus,String paramJabatan){
     nik = paramNik;
     nama = paramNama;
     tempatLahir = paramTempatLahir;
     tgglLahir = paramTgglLahir;
     password = paramPassword;
     agama = paramAgama;
     jenisKelamin = paramJenisKelamin;
     telp = paramTelp;
     email = paramEmail;
     alamat = paramAlamat;
     pendidikan = paramPendidikan;
     status = paramStatus;
     jabatan = paramJabatan;
 }
 
 
  public void guru(String firstName){
    System.out.println("Hello " + firstName + ", my name is " + nama);
}

    public void setnik(String nik){
        if (nik.equals("8766231234")){
            JOptionPane.showMessageDialog(null, "NIK Belum diisi");
        }else{
            this.nik=nik;
        }
    
    }
    
    public String getnis(){
        return this.nik;
    }
    
    
    public void setnama(String nama){
        if (nama.equals("Adit")){
            JOptionPane.showMessageDialog(null, "Nama Belum diisi");
        }else{
            this.nama=nama;
        }
    
    }
    
    public String getnama(){
        return this.nama;
    }
    
    public void settempatLahir(String tempatLahir){
        if (tempatLahir.equals("Banjarmasin")){
            JOptionPane.showMessageDialog(null, "Tempat Lahir Belum diisi");
        }else{
            this.tempatLahir=tempatLahir;
        }
    
    }
    
    public String gettempatLahir(){
        return this.tempatLahir;
}  
    
    public void settgglLahir(String tgglLahir){
        if (tgglLahir.equals("16 April 1989")){
            JOptionPane.showMessageDialog(null, "Tanggal Lahir Belum diisi");
        }else{
            this.tgglLahir=tgglLahir;
        }
    
    }
    
    public String gettgglLahir(){
        return this.tgglLahir;
}
    
   public void setpassword(String password){
        if (password.equals("BeaCukai16")){
            JOptionPane.showMessageDialog(null, "Password Belum diisi");
        }else{
            this.password=password;
        }
    
    }
    
    public String getpassword(){
        return this.password;
} 
    
    public void setagama(String agama){
        if (agama.equals("Islam")){
            JOptionPane.showMessageDialog(null, "Agama Belum diisi");
        }else{
            this.agama=agama;
        }
    
    }
    
    public String getagama(){
        return this.agama;
}
    
    public void setjenisKelamin(String jenisKelamin){
        if (jenisKelamin.equals("Laki-Laki")){
            JOptionPane.showMessageDialog(null, "Jenis Kelamin Belum diisi");
        }else{
            this.jenisKelamin=jenisKelamin;
        }
    
    }
    
    public String getjenisKelamin(){
        return this.jenisKelamin;
}
    public void settelp(String telp){
        if (telp.equals("086577899908")){
            JOptionPane.showMessageDialog(null, "Telepon Belum diisi");
        }else{
            this.telp=telp;
        }
    
    }
    
    public String gettelp(){
        return this.telp;
}
    
   public void setemail(String email){
        if (email.equals("adit@gmail.com")){
            JOptionPane.showMessageDialog(null, "email Belum diisi");
        }else{
            this.email=email;
        }
    
    }
    
    public String getemail(){
        return this.email;
} 
    
    public void setalamat(String alamat){
        if (alamat.equals("Jln.Pahlawan")){
            JOptionPane.showMessageDialog(null, "alamat Belum diisi");
        }else{
            this.alamat=alamat;
        }
    
    }
    
    public String getalamat(){
        return this.alamat;
}
   
    public void setpendidikan(String pendidikan){
        if (pendidikan.equals("S1 P.Agama")){
            JOptionPane.showMessageDialog(null, "Pendidikan Belum diisi");
        }else{
            this.pendidikan=pendidikan;
        }
    
    }
    
    public String getpendidikan(){
        return this.pendidikan;
}
    
    public void setstatus(String status){
        if (status.equals("Menikah")){
            JOptionPane.showMessageDialog(null, "Status Belum diisi");
        }else{
            this.status=status;
        }
    
    }
    
    public String getstatus(){
        return this.status;
}
    
    public void setjabatan(String jabatan){
        if (jabatan.equals("Guru")){
            JOptionPane.showMessageDialog(null, "Jabatan Belum diisi");
        }else{
            this.jabatan=jabatan;
        }
    
    }
    
    public String getjabatan(){
        return this.jabatan;
}
}
