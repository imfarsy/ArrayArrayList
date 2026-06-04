package bagian2.arraylist;

import java.util.ArrayList; // wajib di-import, ArrayList ada di paket java.util

public class Latihan3 {

    public static void main(String[] args) {

        // ArrayList itu kaya array tapi ukurannya bisa nambah/berkurang sendiri alias ototmatis
        // <String> artinya isinya khusus String
        ArrayList<String> mahasiswa = new ArrayList<>();

        // .add() → tambahin elemen ke paling belakang
        mahasiswa.add("Andi");
        mahasiswa.add("Budi");
        mahasiswa.add("Citra");

        // Print langsung bisa, otomatis tampil dalam format [Andi, Budi, Citra]
        System.out.println("Isi list  : " + mahasiswa);

        // .size() → jumlah elemen (beda sama array yang pakai .length)
        System.out.println("Jumlah    : " + mahasiswa.size());

        // .get(i) → ambil elemen di posisi i (beda sama array yang pakai [i])
        System.out.println("Index 1   : " + mahasiswa.get(3)); // "Budi"
    }
}

