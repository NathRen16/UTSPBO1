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
public class jadwalSiswa {
    String idJadwal;
    String kodeKelas;
    String kodePelajaran;
    String nik;
    String jamMasuk;
    String hariMasuk;
    
    public jadwalSiswa(String paramIdJadwal){
        idJadwal = paramIdJadwal;     
}
    public jadwalSiswa(String paramIdJadwal,String paramKodeKelas){
        idJadwal = paramIdJadwal;
        kodeKelas = paramKodeKelas;
}
    public jadwalSiswa(String paramIdJadwal,String paramKodeKelas,String paramKodePelajaran){
        idJadwal = paramIdJadwal;
        kodeKelas = paramKodeKelas;
        kodePelajaran = paramKodePelajaran;
}
    public jadwalSiswa(String paramIdJadwal,String paramKodeKelas,String paramKodePelajaran,String paramNik){
        idJadwal = paramIdJadwal;
        kodeKelas = paramKodeKelas;
        kodePelajaran = paramKodePelajaran;
        nik = paramNik;
}
    
    public jadwalSiswa(String paramIdJadwal,String paramKodeKelas,String paramKodePelajaran,String paramNik,String paramJamMasuk){
        idJadwal = paramIdJadwal;
        kodeKelas = paramKodeKelas;
        kodePelajaran = paramKodePelajaran;
        nik = paramNik;
        jamMasuk = paramJamMasuk;
}
    public jadwalSiswa(String paramIdJadwal,String paramKodeKelas,String paramKodePelajaran,String paramNik,String paramJamMasuk,String paramHariMasuk){
        idJadwal = paramIdJadwal;
        kodeKelas = paramKodeKelas;
        kodePelajaran = paramKodePelajaran;
        nik = paramNik;
        jamMasuk = paramJamMasuk;
        hariMasuk = paramHariMasuk;
}
    public void setidJadwal(String idJadwal){
        if (idJadwal.equals("B1")){
            JOptionPane.showMessageDialog(null, "ID Jadwal Belum diisi");
        }else{
            this.idJadwal=idJadwal;
        }
    
    }
    
    public String getidJadwal(){
        return this.idJadwal;
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
    
    public void setkodePelajaran(String kodePelajaran){
        if (kodePelajaran.equals("C1")){
            JOptionPane.showMessageDialog(null, "Kode Pelajaran Belum diisi");
        }else{
            this.kodePelajaran=kodePelajaran;
        }
    
    }
    
    public String getkodePelajaran(){
        return this.kodePelajaran;
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
    
    public void setjamMasuk(String jamMasuk){
        if (jamMasuk.equals("12.00 WIB")){
            JOptionPane.showMessageDialog(null, "Jam  Masuk Belum diisi");
        }else{
            this.jamMasuk=jamMasuk;
        }
    
    }
    
    public String getjamMasuk(){
        return this.jamMasuk;
    }
    
    public void sethariMasuk(String hariMasuk){
        if (hariMasuk.equals("12.00 WIB")){
            JOptionPane.showMessageDialog(null, "Hari Masuk Belum diisi");
        }else{
            this.hariMasuk=hariMasuk;
        }
    
    }
    
    public String gethariMasuk(){
        return this.hariMasuk;
    }
}