class Asprak extends Mahasiswa implements Pengajar {
    Asprak(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jenisKelamin, nim, ipk, golUkt);
    }

    void ngasihKomenDiGCR() {
        System.out.print("ngasih komen di GCR");
    }

    @Override
    public void mengajar(String matkul) {
        System.out.print("mengajar " + matkul);
    }

    @Override
    public void mengasihTugas() {
        System.out.print("mengasih tugas");
    }

    @Override
    public void menilaiTugas() {
        System.out.print("menilai tugas");
    }

    @Override
    public String toString() {
        return super.toString() + ",\nStatus: Asprak";
    }
}