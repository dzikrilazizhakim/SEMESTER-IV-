class Bank {

    void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan);
    }

    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        double biaya = hitungBiayaTransfer(bankTujuan);

        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan);
        System.out.println("Biaya transfer : " + biaya);
        System.out.println("Total debit    : " + (jumlah + biaya));
    }

    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan + " dengan berita: " + berita);
    }

    void sukuBunga() {
        System.out.println("Suku bunga standar adalah 3%");
    }

    double hitungBiayaTransfer(String bankTujuan) {
        if (bankTujuan.equalsIgnoreCase("BNI")) {
            return 4000;
        } else if (bankTujuan.equalsIgnoreCase("BCA")) {
            return 6500;
        } else if (bankTujuan.equalsIgnoreCase("Mandiri")) {
            return 5000;
        } else {
            return 10000;
        }
    }
}

class BankBNI extends Bank {
    @Override
    void sukuBunga() {
        System.out.println("Suku bunga BNI adalah 4%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        double biaya = hitungBiayaTransfer(bankTujuan);

        System.out.println("=== TRANSFER BNI ===");
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan + " (BNI)");
        System.out.println("Biaya transfer : " + biaya);
        System.out.println("Total debit    : " + (jumlah + biaya));
    }
}

class BankBCA extends Bank {
    @Override
    void sukuBunga() {
        System.out.println("Suku bunga BCA adalah 4.5%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        double biaya = hitungBiayaTransfer(bankTujuan);

        System.out.println("=== TRANSFER BCA ===");
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan + " (BCA)");
        System.out.println("Biaya transfer : " + biaya);
        System.out.println("Total debit    : " + (jumlah + biaya));
    }
}

public class MainBank {
    public static void main(String[] args) {

        System.out.println("=== METHOD OVERLOADING ===");
        Bank bank = new Bank();

        bank.transferUang(100000, "123456");
        bank.transferUang(200000, "654321", "BCA");
        bank.transferUang(300000, "789123", "BNI", "Bayar Kuliah");
        bank.sukuBunga();

        System.out.println("\n=== METHOD OVERRIDING ===");

        Bank bni = new BankBNI();
        Bank bca = new BankBCA();

        bni.sukuBunga();
        bni.transferUang(500000, "111222", "Mandiri");

        bca.sukuBunga();
        bca.transferUang(750000, "333444", "BRI");
    }
}