package bagian1.array;

public class Latihan1 {
    public static void main(String[] args) {

        // Bikin "kotak" bernama nilai yang isinya 5 angka
        // Bayangin kayak loker nomor 0-4, kita isi satu-satu
        int[] nilai = new int[5];
        nilai[0] = 80;  // loker ke-0 isi 80
        nilai[1] = 75;  // loker ke-1 isi 75
        nilai[2] = 90;  // loker ke-2 isi 90
        nilai[3] = 60;  // loker ke-3 isi 60
        nilai[4] = 85;  // loker ke-4 isi 85

        // Cara lain: langsung isi semua sekaligus waktu bikin arraynya
        // Lebih ringkas, cocok kalau datanya sudah diketahui dari awal
        String[] nama = {"Andi", "Budi", "Citra"};

        // Ambil isi loker ke-0 (ingat: mulai dari 0, bukan 1)
        System.out.println("Nilai pertama : " + nilai[0]);  // 80

        // Ambil isi loker ke-2
        System.out.println("Nilai ketiga  : " + nilai[2]);  // 90

        // Ambil nama di posisi ke-1 (= "Budi")
        System.out.println("Mahasiswa ke-2: " + nama[1]);   // Budi

        // .length → properti bawaan array untuk tau jumlah elemennya
        System.out.println("Jumlah nilai  : " + nilai.length); // 5
    }
}
