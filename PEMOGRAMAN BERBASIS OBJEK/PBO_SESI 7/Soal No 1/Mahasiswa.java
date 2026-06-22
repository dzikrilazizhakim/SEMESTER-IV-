public class Mahasiswa<T, U> {

    private T nim;
    private T name;
    private U clas;

    public void setNim(T nim) {
        this.nim = nim;
    }

    public T getNim() {
        return nim;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setClas(U clas) {
        this.clas = clas;
    }

    public U getClas() {
        return clas;
    }

}