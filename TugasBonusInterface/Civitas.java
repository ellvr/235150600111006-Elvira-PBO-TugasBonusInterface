abstract class Civitas {
    String nama;
    int umur;
    boolean jenisKelamin;

    Civitas(String nama, int umur, boolean jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
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