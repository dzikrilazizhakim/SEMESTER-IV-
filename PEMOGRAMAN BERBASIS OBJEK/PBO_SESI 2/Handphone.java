public class Handphone {

    String jenis_hp;
    int tahun_pembuatan;

    // Method Setter
    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    // Method Getter Jenis HP
    public String getJenisHP(){
        return jenis_hp;
    }

    // Method Getter Tahun Pembuatan
    public int getTahunPembuatan(){
        return tahun_pembuatan;
    }

    public static void main(String[] args){

        Handphone hp = new Handphone();

        hp.setDataHP("Smartphone Android", 2024);

        System.out.println("Jenis HP : " + hp.getJenisHP());
        System.out.println("Tahun Pembuatan : " + hp.getTahunPembuatan());
    }
}