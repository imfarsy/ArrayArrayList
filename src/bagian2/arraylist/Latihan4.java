package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan4 {
    public static void main(String[] args) {
        ArrayList<String> buah = new ArrayList<>();
        buah.add("Apel");
        buah.add("Mangga");
        buah.add("Jeruk");
        System.out.println("Awal   : " + buah);

        // .add(indeks, nilai) nyisipkan di posisi tertentu
        // yg lain otomatis geser ke kanan
        buah.add(1, "Pisang");
        System.out.println("Sisip  : " + buah); // jadi [Apel, Pisang, Mangga, Jeruk]

        // .set(indeks, nilai) ganti isi di posisi tertentu
        buah.set(0, "Anggur");
        System.out.println("Ganti  : " + buah); // jadi [Anggur, Pisang, Mangga, Jeruk]

        // .remove("nilai"), hapus elemen berdsrkn isiny (bukan posisi)
        buah.remove("Jeruk");
        System.out.println("Hapus  : " + buah); // jadi [Anggur, Pisang, Mangga]

        // .contains(), cek apakah suatu nilai ada di list, hasilny true/false
        System.out.println("Ada Apel? : " + buah.contains("Apel"));

        System.out.println("Jumlah    : " + buah.size());
    }
} 

