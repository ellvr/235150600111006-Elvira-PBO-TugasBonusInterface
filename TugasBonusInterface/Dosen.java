class Dosen extends Civitas implements PesertaKelas, Pengajar {
    String nip;
    double gaji;

    Dosen(String nama, int umur, boolean jenisKelamin, String nip, double gaji) {
        super(nama, umur, jenisKelamin);
        this.nip = nip;
        this.gaji = gaji;
    }

    void ikutPenelitian() {
        System.out.print("ikut penelitian");
    }

    @Override
    public void masukKelas() {
        System.out.print("masuk kelas");
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
        return super.toString() + "\nNIP: " + nip + "\nStatus: Dosen \nGaji: " + gaji;
    }
}