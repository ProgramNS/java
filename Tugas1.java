/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author The Mask
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello Java");
        biodata run;
        run = new biodata();
        run.name = "Nama : Nurman Syah";
        run.nim = 2020230045;
        run.asal = "SMKN 39 Jakarta Pusat";
        run.hobi = "Bulutangkis , Main Game Online , Belajar Coding";
        run.minat = "Back End Developer";
        run.pengalaman = "Bekerja sebagai operator produksi di PT Yamaha Music";
        System.out.println(run.name);
        System.out.println(run.nim);
        System.out.println(run.asal);
        System.out.println(run.hobi);
        System.out.println(run.minat);
        System.out.println(run.pengalaman);
    }
    
}

class biodata {
    String name;
    int nim;
    String jurusan;
    String asal;
    String hobi;
    String minat;
    String pengalaman;
}
