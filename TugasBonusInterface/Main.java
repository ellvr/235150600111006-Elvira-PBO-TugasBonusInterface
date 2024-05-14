public class Main {
    public static void main(String[] args) {
        // instansiasi daro masing masing konkret class
        Dosen dosen = new Dosen("Pak Aswin", 45, true, "12345", 9000000);
        Mahasiswa mahasiswa = new Mahasiswa("Rosa", 18, false, "23515", 3.5, 3);
        Resepsionis resepsionis = new Resepsionis("Nini", 30, false, 1, "Senior", 3000000);
        Asprak asprak = new Asprak("Elvira", 22, true, "21515", 3.8, 1);

        // dengan upcasting
        Civitas dosenUpcast = new Dosen("Pak. Bayu", 50, true, "54321", 8000000);
        Civitas mahasiswaUpcast = new Mahasiswa("Khoir", 19, true, "22515", 3.6, 3);
        Civitas resepsionisUpcast = new Resepsionis("Dewi", 35, false, 2, "Junior", 2000000);
        Mahasiswa asprakUpcast = new Asprak("Edo", 23, true, "20515", 3.9, 2);

        // Print
        System.out.println(dosen + "\nKeterangan:");
        dosen.ikutPenelitian();
        System.out.println();
        System.out.println(mahasiswa + "\nKeterangan:");
        mahasiswa.ngerjainTugas();
        System.out.println();
        System.out.println(resepsionis + "\nKeterangan:");
        resepsionis.melayani();
        System.out.println();
        System.out.println(asprak + "\nKeterangan:");
        asprak.ngasihKomenDiGCR();
        System.out.println();

        System.out.println("\n=== UPCASTING ===");
        System.out.println(dosenUpcast + "\nKeterangan:");
        dosenUpcast.makanDiKantin("GKM");
        System.out.println();
        System.out.println(mahasiswaUpcast + "\nKeterangan:");
        mahasiswaUpcast.mainGameCorner();
        System.out.println();
        System.out.println(resepsionisUpcast + "\nKeterangan:");
        resepsionisUpcast.naikLift();
        System.out.println();
        System.out.println(asprakUpcast + "\nKeterangan:");
        asprakUpcast.masukKelas();
    }
}
