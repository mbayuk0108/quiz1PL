/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1perpus;

import java.util.ArrayList;
/**
 *
 * @author Muhamad Bayu Khayatullah
 */
public class Perpustakaan {
    private final ArrayList<Buku> daftarBuku;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }
    // Cari buku berdasarkan judul
    public Buku cariBuku(String judul) {
        for (Buku b : daftarBuku) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                return b;}
        }
        return null; // Jika tidak ditemukan
    }
    public boolean pinjamBuku(String judul) {
        Buku buku = cariBuku(judul);
        if (buku != null && buku.getJumlahSalinan() > 0) {
            buku.kurangiSalinan();
            return true;
        }
        return false; // Tidak tersedia
    }
    public void tampilkanBuku() {
        for (Buku b : daftarBuku) {
            System.out.println(b);
        }
    }
}