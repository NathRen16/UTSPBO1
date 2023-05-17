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
public class Siswa {
    String nis;
    String namaSiswa;
    String tempatLahir;
    String tgglLahir;
    String agama;
    String jenisKelamin;
    String alamat;
    String telp;
    String asalSekolah;
    String kodeKelas;
    String kondisi;
    String namaWali;
    
    public Siswa(String paramNis){
       nis =  paramNis;    
}
    public Siswa(String paramNis,String paramNamaSiswa){
       nis = paramNis;
       namaSiswa = paramNamaSiswa;   
}
    public Siswa(String paramNis,String paramNamaSiswa,String paramTempatlahir){
       nis = paramNis;
       namaSiswa = paramNamaSiswa; 
       tempatLahir = paramTempatlahir;
}
    public Siswa(String paramNis,String paramNamaSiswa,String paramTempatlahir,String paramTgglLahir){
       nis = paramNis;
       namaSiswa = paramNamaSiswa; 
       tempatLahir = paramTempatlahir;
       tgglLahir = paramTgglLahir;
}
    public Siswa(String paramNis,String paramNamaSiswa,String paramTempatlahir,String paramTgglLahir,String paramAgama){
       nis = paramNis;
       namaSiswa = paramNamaSiswa; 
       tempatLahir = paramTempatlahir;
       tgglLahir = paramTgglLahir;
       agama = paramAgama;
}
    public Siswa(String paramNis,String paramNamaSiswa,String paramTempatlahir,String paramTgglLahir,String paramAgama,String paramJenisKelamin){
       nis = paramNis;
       namaSiswa = paramNamaSiswa; 
       tempatLahir = paramTempatlahir;
       tgglLahir = paramTgglLahir;
       agama = paramAgama;
       jenisKelamin = paramJenisKelamin;
}
    public Siswa(String paramNis,String paramNamaSiswa,String paramTempatlahir,String paramTgglLahir,String paramAgama,String paramJenisKelamin,String paramAlamat){
       nis = paramNis;
       namaSiswa = paramNamaSiswa; 
       tempatLahir = paramTempatlahir;
       tgglLahir = paramTgglLahir;
       agama = paramAgama;
       jenisKelamin = paramJenisKelamin;
       alamat = paramAlamat;
}
    public Siswa(String paramNis,String paramNamaSiswa,String paramTempatlahir,String paramTgglLahir,String paramAgama,String paramJenisKelamin,String paramAlamat,String paramTelp){
       nis = paramNis;
       namaSiswa = paramNamaSiswa; 
       tempatLahir = paramTempatlahir;
       tgglLahir = paramTgglLahir;
       agama = paramAgama;
       jenisKelamin = paramJenisKelamin;
       alamat = paramAlamat;
       telp = paramTelp;
}
    public Siswa(String paramNis,String paramNamaSiswa,String paramTempatlahir,String paramTgglLahir,String paramAgama,String paramJenisKelamin,String paramAlamat,String paramTelp,String paramAsalSekolah){
       nis = paramNis;
       namaSiswa = paramNamaSiswa; 
       tempatLahir = paramTempatlahir;
       tgglLahir = paramTgglLahir;
       agama = paramAgama;
       jenisKelamin = paramJenisKelamin;
       alamat = paramAlamat;
       telp = paramTelp;
       asalSekolah = paramAsalSekolah;
}
    public Siswa(String paramNis,String paramNamaSiswa,String paramTempatlahir,String paramTgglLahir,String paramAgama,String paramJenisKelamin,String paramAlamat,String paramTelp,String paramAsalSekolah,String paramKodeKelas){
       nis = paramNis;
       namaSiswa = paramNamaSiswa; 
       tempatLahir = paramTempatlahir;
       tgglLahir = paramTgglLahir;
       agama = paramAgama;
       jenisKelamin = paramJenisKelamin;
       alamat = paramAlamat;
       telp = paramTelp;
       asalSekolah = paramAsalSekolah;
       kodeKelas = paramKodeKelas;
}
    
    public Siswa(String paramNis,String paramNamaSiswa,String paramTempatlahir,String paramTgglLahir,String paramAgama,String paramJenisKelamin,String paramAlamat,String paramTelp,String paramAsalSekolah,String paramKodeKelas,String paramKondisi){
       nis = paramNis;
       namaSiswa = paramNamaSiswa; 
       tempatLahir = paramTempatlahir;
       tgglLahir = paramTgglLahir;
       agama = paramAgama;
       jenisKelamin = paramJenisKelamin;
       alamat = paramAlamat;
       telp = paramTelp;
       asalSekolah = paramAsalSekolah;
       kodeKelas = paramKodeKelas;
       kondisi = paramKondisi;
}
    public Siswa(String paramNis,String paramNamaSiswa,String paramTempatlahir,String paramTgglLahir,String paramAgama,String paramJenisKelamin,String paramAlamat,String paramTelp,String paramAsalSekolah,String paramKodeKelas,String paramKondisi,String paramNamaWali){
       nis = paramNis;
       namaSiswa = paramNamaSiswa; 
       tempatLahir = paramTempatlahir;
       tgglLahir = paramTgglLahir;
       agama = paramAgama;
       jenisKelamin = paramJenisKelamin;
       alamat = paramAlamat;
       telp = paramTelp;
       asalSekolah = paramAsalSekolah;
       kodeKelas = paramKodeKelas;
       kondisi = paramKondisi;
       namaWali = paramNamaWali;
}
    
    public void setnis(String nis){
        if (nis.equals("8712989812")){
            JOptionPane.showMessageDialog(null, "NIS Belum diisi");
        }else{
            this.nis=nis;
        }
    
    }
    
    public String getnis(){
        return this.nis;
}
    public void setnamaSiswa(String namaSiswa){
        if (namaSiswa.equals("kodir")){
            JOptionPane.showMessageDialog(null, "Nama Belum diisi");
        }else{
            this.namaSiswa=namaSiswa;
        }
    
    }
    
    public String getnamaSiswa(){
        return this.namaSiswa;
}
  public void settempatLahir(String tempatLahir){
        if (tempatLahir.equals("Bandung")){
            JOptionPane.showMessageDialog(null, "Tempat Lahir Belum diisi");
        }else{
            this.tempatLahir=tempatLahir;
        }
    
    }
    
    public String gettempatLahir(){
        return this.tempatLahir;
}  
    public void settgglLahir(String tgglLahir){
        if (tgglLahir.equals("14 Januari 2003")){
            JOptionPane.showMessageDialog(null, "Tanggal Lahir Belum diisi");
        }else{
            this.tgglLahir=tgglLahir;
        }
    
    }
    
    public String gettgglLahir(){
        return this.tgglLahir;
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
    
    public void setalamat(String alamat){
        if (alamat.equals("Jln.Sudarso")){
            JOptionPane.showMessageDialog(null, "alamat Belum diisi");
        }else{
            this.alamat=alamat;
        }
    
    }
    
    public String getalamat(){
        return this.alamat;
}
    
    public void settelp(String telp){
        if (telp.equals("086534123348")){
            JOptionPane.showMessageDialog(null, "Telepon Belum diisi");
        }else{
            this.telp=telp;
        }
    
    }
    
    public String gettelp(){
        return this.telp;
}
    
    public void setasalSekolah(String asalSekolah){
        if (asalSekolah.equals("SMPN 3 Bandung")){
            JOptionPane.showMessageDialog(null, "Asal Sekolah Belum diisi");
        }else{
            this.asalSekolah=asalSekolah;
        }
    
    }
    
    public String getasalSekolah(){
        return this.asalSekolah;
}
    
    public void setkodeKelas(String kodeKelas){
        if (kodeKelas.equals("A1")){
            JOptionPane.showMessageDialog(null, "Kode Kelas Belum diisi");
        }else{
            this.kodeKelas=kodeKelas;
        }
    
    }
    
    public String getkodeKelas(){
        return this.kodeKelas;
}
    
    public void setkondisi(String kondisi){
        if (kondisi.equals("Aktif")){
            JOptionPane.showMessageDialog(null, "Kondisi Belum diisi");
        }else{
            this.kondisi=kondisi;
        }
    
    }
    
    public String getkondisi(){
        return this.kondisi;
    }
    
    public void setnamaWali(String namaWali){
        if (namaWali.equals("Sumanto")){
            JOptionPane.showMessageDialog(null, "Nama Wali Kelas Belum diisi");
        }else{
            this.namaWali=namaWali;
        }
    
    }
    
    public String getnamaWali(){
        return this.namaWali;
    }
}    