package perpustakaan;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Buku> daftarBuku = new ArrayList<>();

        daftarBuku.add(new Novel("Laskar Pelangi"));
        daftarBuku.add(new Novel("Bumi"));

        System.out.println("DAFTAR BUKU");

        for (Buku b : daftarBuku) {

            System.out.println(b.judul);
        }

        Komik k = new Komik();

        k.tampilInfo();

        k.pinjam();

        Anggota anggota = new Anggota("Andi");

        System.out.println("Nama anggota = " + anggota.getNama());

        Data<String> d = new Data<>("Data Generic");

        System.out.println(d.getData());

    }

}