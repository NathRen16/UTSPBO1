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
public class Pelajaran {
    String kodePelajaran;
    String namaPelajaran;
    String kkm;
    
    public Pelajaran(String paramKodePelajaran){
    kodePelajaran = paramKodePelajaran;
}
    public Pelajaran(String paramKodePelajaran,String paramNamaPelajaran){
    kodePelajaran = paramKodePelajaran;
    namaPelajaran = paramNamaPelajaran;
}
    public Pelajaran(String paramKodePelajaran,String paramNamaPelajaran,String paramKkm){
    kodePelajaran = paramKodePelajaran;
    namaPelajaran = paramNamaPelajaran;
    kkm = paramKkm;
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
     
    public void setnamaPelajaran(String namaPelajaran){
        if (namaPelajaran.equals("Matematika")){
            JOptionPane.showMessageDialog(null, "Nama Pelajaran Belum diisi");
        }else{
            this.namaPelajaran=namaPelajaran;
        }
    
    }
    
    public String getnamaPelajaran(){
        return this.namaPelajaran;
    }
    
    public void setkkm(String kkm){
        if (kkm.equals("75")){
            JOptionPane.showMessageDialog(null, "KKM Belum diisi");
        }else{
            this.kkm=kkm;
        }
    
    }
    
    public String getkkm(){
        return this.kkm;
    }
}    