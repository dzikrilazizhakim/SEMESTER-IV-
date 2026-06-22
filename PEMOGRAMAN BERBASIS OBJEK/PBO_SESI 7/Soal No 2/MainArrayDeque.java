import java.util.ArrayDeque;

public class MainArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<String> antrian = new ArrayDeque<>();

        antrian.add("Pelanggan 1");
        antrian.add("Pelanggan 2");
        antrian.add("Pelanggan 3");

        System.out.println(antrian);

        antrian.poll();

        System.out.println("Setelah satu pelanggan keluar");

        System.out.println(antrian);

    }
}