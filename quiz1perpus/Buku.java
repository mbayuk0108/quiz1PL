/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1perpus;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
public class Buku {
    private String judul;
    private String penulis;
    private int jumlahSalinan;

    public Buku(String judul, String penulis, int jumlahSalinan) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahSalinan = jumlahSalinan;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getJumlahSalinan() {
        return jumlahSalinan;
    }
   
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJumlahSalinan(int jumlahSalinan) {
        this.jumlahSalinan = jumlahSalinan;
    }

    // Metode untuk mengurangi salinan saat dipinjam
    public void kurangiSalinan() {
        if (jumlahSalinan > 0) { jumlahSalinan--;}
    }
    @Override
    public String toString() {
        return "Judul: " + judul + ", Penulis: " + penulis + ", Salinan: " + jumlahSalinan;
    }
}