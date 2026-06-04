package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan5 {
    public static void main(String[] args) {

        // ArrayList<Integer> not <int> — ArrayList hanya mau tipe objek,
        // jdi int diganti Integer (versi "objek" dari int)
        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(80);
        nilai.add(75);
        nilai.add(90);

        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        double rata = (double) total / nilai.size();

        System.out.println("Data      : " + nilai);
        System.out.println("Total     : " + total);
        System.out.println("Rata-rata : " + rata);
    }
}
