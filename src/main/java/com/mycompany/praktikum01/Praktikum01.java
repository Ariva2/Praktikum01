package com.mycompany.praktikum01;
import Model.Mahasiswa;
import Model.Santri;
public class Praktikum01 {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        Mahasiswa ml = new Mahasiswa(
                2, 
                "2110010765", 
                "Muhammad Sumbul", 
                3.5);
        Santri santri = new Santri();
        Santri dl = new Santri(
                211002,
                "MUSLIM",
                15.22);
        
        mahasiswa.setId(1);
        mahasiswa.setNPM("2110010316");
        mahasiswa.setNama("Muhammad Ariva");
        mahasiswa.setIPK(3.9);
        
        santri.setNIS(211001);
        santri.setNama("UDIN");
        santri.setAlquran(12.5);
        
        mahasiswa.viewData();
        ml.viewData();
        santri.viewData();
        dl.viewData();

    }
}
