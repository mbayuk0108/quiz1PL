/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1algoritma;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            StudentDataManager manager = new StudentDataManager();
            ArrayList<Integer> dataNilai = new ArrayList<>();
            dataNilai.add(65);
            dataNilai.add(70);
            dataNilai.add(88);
            dataNilai.add(90);
            dataNilai.add(82);
            dataNilai.add(98);
            dataNilai.add(86);
            
            manager.setNilai(dataNilai);
            System.out.println("Data nilai sebelum diurutkan:");
            System.out.println(manager.getNilai());
            
            manager.mergeSort(manager.getNilai());
            System.out.println("\nData nilai setelah diurutkan (MergeSort):");
            System.out.println(manager.getNilai());
            
            System.out.print("\nMasukkan nilai yang ingin dicari: ");
            int cari = input.nextInt();
            int hasil = manager.linearSearch(cari);
            if (hasil != -1) {
                System.out.println("✅ Nilai " + cari + " ditemukan di indeks: " + hasil);
            } else {
                System.out.println("❌ Nilai " + cari + " tidak ditemukan.");
            }
        }
    }
}