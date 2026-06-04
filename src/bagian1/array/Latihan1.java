package bagian1.array;

public class Latihan1 {
    public static void main(String[] args) {

        // bkn "kotak" bernama nilai yg isinya 5 angka
        // bayangin kaya loker no 0-4, kita isi satu'
        int[] nilai = new int[5];
        nilai[0] = 80;  // loker k0 isi 80 dan strusny
        nilai[1] = 75;  
        nilai[2] = 90;  
        nilai[3] = 60;  
        nilai[4] = 85;  

        // cara lain lngsng isi semua sekaligus waktu bkn arrayny
        // lebih ringkas, cocok kalo datany sdh diket dari awal
        String[] nama = {"Andi", "Budi", "Citra"};

        // Ambil isi loker k0 (ingat: mulai dari 0, bkn 1)
        System.out.println("Nilai pertama : " + nilai[0]);  // 80

        // Ambil isi loker k2
        System.out.println("Nilai ketiga  : " + nilai[2]);  // 90

        // Ambil nama di posisi k1 (= "Budi")
        System.out.println("Mahasiswa ke-2: " + nama[1]);   // Budi

        // .length:  properti bawaan array untuk tau jumlah elemennya
        System.out.println("Jumlah nilai  : " + nilai.length); // 5
    }
}
