package perpustakaan;

public class Komik extends Majalah implements Peminjaman {

    @Override
    public void tampilInfo() {

        System.out.println("Komik Naruto tersedia");
    }

    @Override
    public void pinjam() {

        System.out.println("Komik berhasil dipinjam");
    }

}