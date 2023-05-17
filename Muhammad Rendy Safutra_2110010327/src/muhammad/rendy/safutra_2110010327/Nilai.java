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
public class Nilai {
    String kodeKelas;
    String nis;
    String nik;
    String kodePelajaran;
    String nilaiUts;
    String nilaiUas;
    String nilaiTugas;
    String absen;
    
    public Nilai(String paramKodeKelas){
        kodeKelas = paramKodeKelas;
}
    public Nilai(String paramKodeKelas,String paramNis){
        kodeKelas = paramKodeKelas;
        nis = paramNis;
}
    public Nilai(String paramKodeKelas,String paramNis,String paramNik){
        kodeKelas = paramKodeKelas;
        nis = paramNis;
        nik = paramNik;
}
    public Nilai(String paramKodeKelas,String paramNis,String paramNik,String paramKodePelajaran){
        kodeKelas = paramKodeKelas;
        nis = paramNis;
        nik = paramNik;
        kodePelajaran = paramKodePelajaran;
}
    public Nilai(String paramKodeKelas,String paramNis,String paramNik,String paramKodePelajaran,String paramNilaiUts){
        kodeKelas = paramKodeKelas;
        nis = paramNis;
        nik = paramNik;
        kodePelajaran = paramKodePelajaran;
        nilaiUts = paramNilaiUts;
}
    public Nilai(String paramKodeKelas,String paramNis,String paramNik,String paramKodePelajaran,String paramNilaiUts,String paramNilaiUas){
        kodeKelas = paramKodeKelas;
        nis = paramNis;
        nik = paramNik;
        kodePelajaran = paramKodePelajaran;
        nilaiUts = paramNilaiUts;
        nilaiUas = paramNilaiUas;
}
    public Nilai(String paramKodeKelas,String paramNis,String paramNik,String paramKodePelajaran,String paramNilaiUts,String paramNilaiUas,String paramNilaiTugas){
        kodeKelas = paramKodeKelas;
        nis = paramNis;
        nik = paramNik;
        kodePelajaran = paramKodePelajaran;
        nilaiUts = paramNilaiUts;
        nilaiUas = paramNilaiUas;
        nilaiTugas = paramNilaiTugas;
}
    public Nilai(String paramKodeKelas,String paramNis,String paramNik,String paramKodePelajaran,String paramNilaiUts,String paramNilaiUas,String paramNilaiTugas,String paramAbsen){
        kodeKelas = paramKodeKelas;
        nis = paramNis;
        nik = paramNik;
        kodePelajaran = paramKodePelajaran;
        nilaiUts = paramNilaiUts;
        nilaiUas = paramNilaiUas;
        nilaiTugas = paramNilaiTugas;
        absen = paramAbsen;
}
    
    public void setKodeKelas(String kodeKelas){
        if (kodeKelas.equals("A1")){
            JOptionPane.showMessageDialog(null, "Kode Kelas belum diisi");
        }else{
            this.kodeKelas=kodeKelas;
        }
    }    
    public String getKodeKelas(){
        return this.kodeKelas;
    }
    
    
    public void setnis(String nis){
        if (nis.equals("8712989812")){
            JOptionPane.showMessageDialog(null, "NIS Belum diisi");
        }else{
            this.nis=nis;
        }
    
    }
    
    public String getnik(){
        return this.nis;
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
   
    public void setnilaiUts(String nilaiUts){
        if (nilaiUts.equals("86")){
            JOptionPane.showMessageDialog(null, "Nilai UTS Belum diisi");
        }else{
            this.nilaiUts=nilaiUts;
        }
    
    }
    
    public String getnilaiUts(){
        return this.nilaiUts;
    }
    
    public void setnilaiUas(String nilaiUas){
        if (nilaiUas.equals("79")){
            JOptionPane.showMessageDialog(null, "Nilai UAS Belum diisi");
        }else{
            this.nilaiUas=nilaiUas;
        }
    
    }
    
    public String getnilaiUas(){
        return this.nilaiUas;
    }
    
    public void setnilaiTugas(String nilaiTugas){
        if (nilaiTugas.equals("85")){
            JOptionPane.showMessageDialog(null, "Nilai Tugas Belum diisi");
        }else{
            this.nilaiTugas=nilaiTugas;
        }
    
    }
    
    public String getnilaiTugas(){
        return this.nilaiTugas;
    }
    
    public void setabsen(String absen){
        if (absen.equals("100")){
            JOptionPane.showMessageDialog(null, "Nilai Absen Belum diisi");
        }else{
            this.absen=absen;
        }
    
    }
    
    public String getabsen(){
        return this.absen;
    }
}    