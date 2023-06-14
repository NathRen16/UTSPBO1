/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class datasetPelajaran {
    
   private ArrayList<String> kodePelajaran;
   private ArrayList<String> namaPelajaran;
   private ArrayList<String> kkm;
   
   public datasetPelajaran(){
   
    kodePelajaran = new ArrayList<String>();
    namaPelajaran = new ArrayList<String>();
    kkm = new ArrayList<String>();
   
   }
   
public void tambahkodePelajaran(String value){
        kodePelajaran.add(value);
    }
     public ArrayList<String> getdatasetkodePelajaran(){
        return this.kodePelajaran;
    }

public void tambahnamaPelajaran(String value){
        namaPelajaran.add(value);
    }
     public ArrayList<String> getdatasetnamaPelajaran(){
        return this.namaPelajaran;
    }
     
public void tambahkkm(String value){
        kkm.add(value);
    }
     public ArrayList<String> getdatasetkkm(){
        return this.kkm;
    }          
}
