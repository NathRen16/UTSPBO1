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
public class Kelas {
    String kodeKelas;
    String kelas;
    String kapasitas;
    
    public Kelas(String paramKodeKelas){
        kodeKelas = paramKodeKelas;
}
    public Kelas(String paramKodeKelas,String paramKelas){
        kodeKelas = paramKodeKelas;
        kelas = paramKelas;
}
    public Kelas(String paramKodeKelas,String paramKelas,String paramKapasitas){
        kodeKelas = paramKodeKelas;
        kelas = paramKelas;
        kapasitas = paramKapasitas;
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
    
    public void setkelas(String kelas){
        if (kelas.equals("7C")){
            JOptionPane.showMessageDialog(null, "Kelas Belum diisi");
        }else{
            this.kelas=kelas;
        }
    
    }
    
    public String getkelas(){
        return this.kelas;
    }
    public void setkapasitas(String kapasitas){
        if (kapasitas.equals("35 Siswa")){
            JOptionPane.showMessageDialog(null, "Kapasitas Belum diisi");
        }else{
            this.kapasitas=kapasitas;
        }
    
    }
    
    public String getkapasitas(){
        return this.kapasitas;
    }
}