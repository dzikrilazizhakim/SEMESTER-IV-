import java.util.ArrayList;

public class MainArrayList {

    public static void main(String[] args) {

        ArrayList<String> mahasiswa = new ArrayList<>();

        mahasiswa.add("Andi");
        mahasiswa.add("Budi");
        mahasiswa.add("Citra");

        System.out.println("Daftar Mahasiswa");

        for (String nama : mahasiswa) {
            System.out.println(nama);
        }

    }
}