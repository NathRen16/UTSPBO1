/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammad.rendy.safutra_2110010327;


/**
 *
 * @author User
 */
public class Pelajaran {
private String kodePelajaran;
private String namaPelajaran;
private String kkm;

public Pelajaran(String kodePelajaran, String namaPelajaran, String kkm) {
       this.kodePelajaran = kodePelajaran;
       this.namaPelajaran = namaPelajaran;
       this.kkm = kkm;
   }
  
   public String getkodePelajaran(){
       return kodePelajaran;
   }
   
   public void setkodePelajaran(String kodePelajaran) {
       this.kodePelajaran = kodePelajaran;
   }
   
   public String getnamaPelajaran(){
       return namaPelajaran;
   }
   
   public void setnamaPelajaran(String namaPelajaran) {
       this.namaPelajaran = namaPelajaran;
   }
   
   public String getkkm(){
       return kkm;
   }
   
   public void setkkm(String kkm) {
       this.kkm = kkm;
   }
}    