/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad.rendy.safutra_2110010327;
/**
 *
 * @author User
 */
public class MuhammadRendySafutra_2110010327 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Guru guru1 = new Guru("8766231234","Adit","Banjarmasin","16 April 1989","BeaCukai16","Islam","Laki-Laki","086577899908","adit@gmail.com","Jln.Pahlawan","S1 P.Agama","Menikah","Guru");
        
        Siswa siswa1 = new Siswa("8712989812","kodir","Bandung","14 januari 2003","Islam","Laki-Laki","Jln.Sudarso","086534123348","SMPN 3 Bandung","A1","Aktif","Sumanto");
    
        jadwalSiswa jadwalsiswa1 = new jadwalSiswa("B1","A1","C1","8766231234","12.00 WIB","Senin,Rabu,Jum'at");
        
        Kelas kelas1 = new Kelas("A1","7C","35 Siswa");
        
        Pelajaran pelajaran1 = new Pelajaran("C1","Matematika","75");
        
        Nilai nilai1 = new Nilai("A1","8712989812","8766231234","C1","86","79","85","100");
        
        guru1.guru("Asep");
    }
}
