package bagian1.array;

public class Latihan2 {
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 60, 85};

        // FOR BIASA — pakai ini kalau butuh tau posisi (indeks) elemennya
        // i mulai dari 0, terus naik 1 sampai habis (i < nilai.length)
        System.out.println("== Menggunakan for ==");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Indeks " + i + " = " + nilai[i]);
        }

        // FOR-EACH — lebih simpel, cocok kalau cuma mau baca isinya satu-satu
        // "untuk setiap n di dalam nilai, lakukan ini..."
        System.out.println("== Menggunakan for-each ==");
        int total = 0;
        for (int n : nilai) {
            total += n; // tambahin n ke total, sama kayak total = total + n
        }

        // Cast ke double dulu biar hasilnya ada koma, bukan dibulatkan
        double rata = (double) total / nilai.length;
        System.out.println("Total     : " + total);
        System.out.println("Rata-rata : " + rata);
    }
}
