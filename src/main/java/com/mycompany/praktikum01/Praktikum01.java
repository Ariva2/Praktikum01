package com.mycompany.praktikum01;
import Model.Mahasiswa;
public class Praktikum01 {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        
        mahasiswa.setId(1);
        mahasiswa.setNPM("2110010316");
        mahasiswa.setNama("Muhammad Ariva");
        mahasiswa.setIPK(3.9);
        
        mahasiswa.viewData();
    }
}
