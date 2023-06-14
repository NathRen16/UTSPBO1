package dataset;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class datasetKelas {
   
   private ArrayList<String> kodeKelas;
   private ArrayList<String> kelas;
   private ArrayList<String> kapasitas;
   
   
public datasetKelas(){
    
    kodeKelas = new ArrayList<String>();
    kelas = new ArrayList<String>();
    kapasitas = new ArrayList<String>();

}  

public void tambahkodeKelas(String value){
        kodeKelas.add(value);
    }
     public ArrayList<String> getdatasetkodeKelas(){
        return this.kodeKelas;
    }

public void tambahkelas(String value){
        kelas.add(value);
    }
     public ArrayList<String> getdatasetkelas(){
        return this.kelas;
    }

public void tambahkapasitas(String value){
        kapasitas.add(value);
    }
     public ArrayList<String> getdatasetkapasitas(){
        return this.kapasitas;
    }     
}
