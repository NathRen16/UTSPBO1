/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammad.rendy.safutra_2110010327;

/**
 *
 * @author User
 */
public class Kelas {
   private String kodeKelas;
   private String kelas;
   private String kapasitas;
   
   public Kelas(String kodeKelas, String kelas, String kapasitas) {
       this.kodeKelas = kodeKelas;
       this.kelas = kelas;
       this.kapasitas = kapasitas;
   }
    
   
   
   public String getkodeKelas(){
       return kodeKelas;
   }
   
   public void setkodeKelas(String kodeKelas) {
       this.kodeKelas = kodeKelas;
   }
   
   public String getkelas(){
       return kelas;
   }
   public void setkelas(String kelas) {
       this.kelas = kelas;
   }
   
   public String getkapasitas(){
       return kapasitas;
   }
   
   public void setkapasitas(String kapasitas) {
       this.kapasitas = kapasitas;
   }
   }