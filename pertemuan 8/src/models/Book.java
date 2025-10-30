/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author irzir
 */
public class Book {
    public String judul;
    public String penulis;
    public String tahunTerbit;
    public boolean isBooked; // Menunjukkan apakah buku sedang dipinjam
    
    public Book(String judul, String penulis, String tahunTerbit, boolean isBooked) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.isBooked = isBooked;
    };
    
    public void tampilkanDataBuku() {
        System.out.println("Judul: " + judul);
        // PERBAIKAN: Menggunakan variabel penulis
        System.out.println("Penulis: " + penulis); 
        // PERBAIKAN: Menggunakan variabel tahunTerbit
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println(isBooked ? "Buku telah dipinjam." : "Belum dipinjam.");
        System.out.println("=======================================");
    }
}
