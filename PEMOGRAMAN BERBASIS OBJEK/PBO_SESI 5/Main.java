import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // INPUT STUDENT
        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.print("Nama: ");
        String sName = input.nextLine();
        System.out.print("Alamat: ");
        String sAddress = input.nextLine();

        Student student = new Student(sName, sAddress);

        System.out.print("Jumlah mata kuliah: ");
        int jumlahMK = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Nama MK: ");
            String mk = input.nextLine();
            System.out.print("Nilai: ");
            int nilai = input.nextInt();
            input.nextLine();

            student.addCourseGrade(mk, nilai);
        }

        // OUTPUT STUDENT
        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println(student);
        student.printGrades();
        System.out.println("Rata-rata: " + student.getAverageGrade());

        // INPUT TEACHER
        System.out.println("\n=== INPUT DATA DOSEN ===");
        System.out.print("Nama: ");
        String tName = input.nextLine();
        System.out.print("Alamat: ");
        String tAddress = input.nextLine();

        Teacher teacher = new Teacher(tName, tAddress);

        System.out.print("Jumlah mata kuliah yang diajar: ");
        int jumlahDosenMK = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahDosenMK; i++) {
            System.out.print("Nama MK: ");
            String mk = input.nextLine();

            if (teacher.addCourse(mk)) {
                System.out.println("Berhasil ditambahkan");
            } else {
                System.out.println("Gagal (sudah ada)");
            }
        }

        // OUTPUT TEACHER
        System.out.println("\n=== DATA DOSEN ===");
        System.out.println(teacher);

        input.close();
    }
}