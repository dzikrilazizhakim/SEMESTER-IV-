import java.util.*;

// Superclass
class Mahasiswa {
    String nim, nama;
    int nilai;

    public Mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }
}

// Subclass (Inheritance)
class Penilaian extends Mahasiswa {
    String grade;

    public Penilaian(String nim, String nama, int nilai) {
        super(nim, nama, nilai);
        setGrade();
    }

    void setGrade() {
        if (nilai >= 80 && nilai <= 100) grade = "A";
        else if (nilai >= 70) grade = "B";
        else if (nilai >= 60) grade = "C";
        else if (nilai >= 50) grade = "D";
        else if (nilai >= 0) grade = "E";
        else grade = "Input salah";
    }

    void tampil() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Nilai : " + nilai);
        System.out.println("Grade : " + grade);
        System.out.println("--------------------------------------");
    }
}

// Main Class
public class SistemPenilaianMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Penilaian> data = new ArrayList<>();

        // INPUT (bebas jumlah, bisa disesuaikan dosen)
        int jumlah = 4; // sesuai contoh PDF

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Nilai : ");
            int nilai = input.nextInt();
            input.nextLine();

            data.add(new Penilaian(nim, nama, nilai));
        }

        System.out.println("\n================ OUTPUT ================\n");

        int total = 0;
        int lulus = 0, tidakLulus = 0;

        ArrayList<String> namaLulus = new ArrayList<>();
        ArrayList<String> namaTidakLulus = new ArrayList<>();

        ArrayList<String> gradeA = new ArrayList<>();
        ArrayList<String> gradeB = new ArrayList<>();
        ArrayList<String> gradeC = new ArrayList<>();
        ArrayList<String> gradeD = new ArrayList<>();
        ArrayList<String> gradeE = new ArrayList<>();

        for (Penilaian m : data) {
            m.tampil();
            total += m.nilai;

            // Lulus jika A, B, C
            if (m.grade.equals("A") || m.grade.equals("B") || m.grade.equals("C")) {
                lulus++;
                namaLulus.add(m.nama);
            } else {
                tidakLulus++;
                namaTidakLulus.add(m.nama);
            }

            // Kelompok grade
            switch (m.grade) {
                case "A": gradeA.add(m.nama); break;
                case "B": gradeB.add(m.nama); break;
                case "C": gradeC.add(m.nama); break;
                case "D": gradeD.add(m.nama); break;
                case "E": gradeE.add(m.nama); break;
            }
        }

        double rata = (double) total / jumlah;

        // RINGKASAN SESUAI PDF
        System.out.println("Jumlah Mahasiswa : " + jumlah);

        System.out.println("Jumlah Mahasiswa yg Lulus : " + lulus + " yaitu " + String.join(", ", namaLulus));
        System.out.println("Jumlah Mahasiswa yg Tidak Lulus : " + tidakLulus + " yaitu " + String.join(", ", namaTidakLulus));

        System.out.println("Jumlah Mahasiswa dengan Nilai A : " + gradeA.size() + " yaitu " + String.join(", ", gradeA));
        System.out.println("Jumlah Mahasiswa dengan Nilai B : " + gradeB.size() + " yaitu " + String.join(", ", gradeB));
        System.out.println("Jumlah Mahasiswa dengan Nilai C : " + gradeC.size() + " yaitu " + String.join(", ", gradeC));
        System.out.println("Jumlah Mahasiswa dengan Nilai D : " + gradeD.size() + " yaitu " + String.join(", ", gradeD));
        System.out.println("Jumlah Mahasiswa dengan Nilai E : " + gradeE.size() + " yaitu " + String.join(", ", gradeE));

        System.out.println("Rata-rata nilai mahasiswa adalah : " + total + " / " + jumlah + " = " + rata);
    }
}