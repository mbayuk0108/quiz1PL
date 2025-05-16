/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1transportasiudara;
/**
 *
 * @author ASUS
 */
public class MainTransportasi {
    public static void main(String[] args) throws Exception {
        TransportasiManager manager = new TransportasiManager();

        manager.tambah(new Pesawat());
        manager.tambah(new Helikopter());
        manager.tambah(new Drone());
        manager.tambah(null); // Contoh pengecualian
        manager.tampilkanLaporan();
    }
}
