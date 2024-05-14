class Mahasiswa extends Civitas implements PesertaKelas {
    String nim;
    double ipk;
    int golUkt;

    Mahasiswa(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jenisKelamin);
        this.nim = nim;
        this.ipk = ipk;
        this.golUkt = golUkt;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public int getGolUkt() {
        return golUkt;
    }

    public void setGolUkt(int golUkt) {
        this.golUkt = golUkt;
    }

    void ngerjainTugas() {
        System.out.print("mengerjakan tugas");
    }

    void pasrah() {
        System.out.print("pasrah");
    }

    void mengikutiOrganisasi(String namaOrganisasi) {
        System.out.print("mengikuti organisasi " + namaOrganisasi);
    }

    void presentasi() {
        System.out.print("presentasi");
    }

    @Override
    public void masukKelas() {
        System.out.print("masuk kelas");
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIM: " + nim + "\nStatus: Mahasiswa";
    }
}