/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1perpus;

import java.util.Scanner;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        try (Scanner input = new Scanner(System.in)) {
            perpustakaan.tambahBuku(new Buku("The Principles of Power", "Dion Yulianto", 3));
            perpustakaan.tambahBuku(new Buku("The 48 Laws of Power", "Robert Greene", 2));
            perpustakaan.tambahBuku(new Buku("Harry Potter", "J.K Rowling", 5));
            perpustakaan.tambahBuku(new Buku("Dasar Dasar Logika", "Bambang Kusbandrijo", 1));
            System.out.println("== Daftar Buku Awal ==");
            perpustakaan.tampilkanBuku();
            
            System.out.print("\nMasukkan judul buku yang ingin dicari: ");
            String judulCari = input.nextLine();
            Buku bukuditemukan = perpustakaan.cariBuku(judulCari);
            
            if (bukuditemukan != null) {
                System.out.println("Buku ditemukan: " + bukuditemukan);
            } else {
                System.out.println("Buku tidak ditemukan.");
            }
            
            System.out.print("\nMasukkan judul buku yang ingin dipinjam: ");
            String judulPinjam = input.nextLine();
            boolean sukses = perpustakaan.pinjamBuku(judulPinjam);
            if (sukses) {
                System.out.println("Buku berhasil dipinjam.");
            } else {
                System.out.println("Buku tidak tersedia untuk dipinjam.");
            }
            
            System.out.println("\n== Daftar Buku Setelah Peminjaman ==");
            perpustakaan.tampilkanBuku();
        }
    }
}