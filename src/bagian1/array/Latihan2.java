package bagian1.array;

public class Latihan2 {
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 60, 85};

        // FOR BIASA, pakai ini kalo butuh tau posisi (indeks) elemenny
        // i mulai dari 0, trs naik 1 sampai hbs (i < nilai.length)
        System.out.println("== Menggunakan for ==");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Indeks " + i + " = " + nilai[i]);
        }

        // FOR-EACH, lebih simpel, cocok kalo cuma mau baca isiny satu'
        System.out.println("== Menggunakan for-each ==");
        int total = 0;
        for (int n : nilai) {
            total += n; // tambahin n ke total, sama kaya total = total + n
        }

        // Cast ke double dlu biar hasilny ada koma, bkn dibulatkan
        double rata = (double) total / nilai.length;
        System.out.println("Total     : " + total);
        System.out.println("Rata-rata : " + rata);
    }
}
