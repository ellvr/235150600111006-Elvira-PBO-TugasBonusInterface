abstract class Civitas {
    String nama;
    int umur;
    boolean jenisKelamin;

    Civitas(String nama, int umur, boolean jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    void makanDiKantin(String kantin) {
        System.out.print("makan di kantin " + kantin);
    }

    void mainGameCorner() {
        System.out.print("bermain di Game Corner");
    }

    void naikLift() {
        System.out.print("naik lift");
    }

    @Override
    public String toString() {
        return "\nNama: " + nama + "\nUmur: " + umur + "\nJenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan");
    }
}