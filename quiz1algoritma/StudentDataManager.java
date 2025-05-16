/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1algoritma;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
import java.util.ArrayList;
public class StudentDataManager {
    private ArrayList<Integer> nilai = new ArrayList<>();
    public void setNilai(ArrayList<Integer> nilai) {
        this.nilai = nilai;
    }
    public ArrayList<Integer> getNilai() {
        return nilai;
    }

    public void mergeSort(ArrayList<Integer> data) {
        if (data.size() > 1) {
            int mid = data.size() / 2;
            ArrayList<Integer> left = new ArrayList<>(data.subList(0, mid));
            ArrayList<Integer> right = new ArrayList<>(data.subList(mid, data.size()));

            mergeSort(left);
            mergeSort(right);
            merge(data, left, right);
        }
    }
    private void merge(ArrayList<Integer> result, ArrayList<Integer> left, ArrayList<Integer> right) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.set(k++, left.get(i++));
            } else {
                result.set(k++, right.get(j++));
            }
        }
        while (i < left.size()) {
            result.set(k++, left.get(i++));
        }
        while (j < right.size()) {
            result.set(k++, right.get(j++));
        }
    }

    public int linearSearch(int target) {
        for (int i = 0; i < nilai.size(); i++) {
            if (nilai.get(i) == target) {
                return i;
            }
        }
        return -1;
    }
}