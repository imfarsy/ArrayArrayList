package bagian1.array;

public class LatihanMandiri1 {
    public static void main(String[] args) {

        System.out.println("== Soal 1: Suhu Harian ==");
        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};

        // elemen pertama sebagai max dan min, terus dibandingkan satu' dengan yg lain
        double max = suhu[0], min = suhu[0];

        for (double s : suhu) {
            if (s > max) max = s;
            if (s < min) min = s; 
        }
        System.out.println("Tertinggi : " + max); // 33.2
        System.out.println("Terendah  : " + min); // 27.8

        
        System.out.println("\n== Soal 2: Nama Hari > 5 Huruf ==");
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        for (String h : hari) {
            // .length() pada String → hitung jumlah karakternya
            if (h.length() > 5) {
                System.out.println(h + " (" + h.length() + " huruf)");
            }
        }

        System.out.println("\n== Soal 3: Hitung Bilangan Genap ==");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int genap = 0;

        for (int a : angka) {
            // % adalah operator modulus (sisa bagi), kalo sisa bagi 2 = 0, berarti genap 
            if (a % 2 == 0) genap++;
        }
        System.out.println("Jumlah bilangan genap: " + genap); // 4
    } 
}
