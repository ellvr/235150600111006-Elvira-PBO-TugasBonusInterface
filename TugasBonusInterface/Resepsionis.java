class Resepsionis extends Civitas {
    int idResepsionis;
    String jabatan;
    double gaji;

    Resepsionis(String nama, int umur, boolean jenisKelamin, int idResepsionis, String jabatan, double gaji) {
        super(nama, umur, jenisKelamin);
        this.idResepsionis = idResepsionis;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    void melayani() {
        System.out.print("melayani");
    }

    void melapor() {
        System.out.print("melapor");
    }

    @Override
    public String toString() {
        return super.toString() + "\nID Resepsionis: " + idResepsionis + "\nStatus: Resepsionis \nJabatan: " + jabatan
                + "\nGaji: " + gaji;
    }
}