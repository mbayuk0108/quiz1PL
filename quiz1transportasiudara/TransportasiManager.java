/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1transportasiudara;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
import java.util.ArrayList;
public class TransportasiManager {
    private final ArrayList<AlatTransportasiUdara> daftar = new ArrayList<>();
    
    public void tambah(AlatTransportasiUdara alat){
        if (alat == null){
            System.out.println (" !! Gagal menambahkan: alat tidak valid (null)");
        } else {
            daftar.add(alat);
        }
    }
    public void tampilkanLaporan() throws Exception{
        if (daftar.isEmpty()){
            System.out.println("Tidak ada alat transportasi untuk ditampilkan");
            return;
        }
        System.out.println("\n== Laporan Penerbangan ==");
        int i = 1;
        for (AlatTransportasiUdara alat : daftar) {
            try {
                if (alat == null) {
                    throw new Exception("Objek null ditemukan dalam daftar.");
                }
                System.out.print(i + ". ");
                alat.terbang();
                i++;
            } catch (Exception e) {
                        System.out.println("Eror saat menjalankan alat:" +e.getMessage());
                        }
        }
    }
}