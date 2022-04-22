import Model.Perhitungan;

public class JalankanPerhitungan {
    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4, 6, 0);
        //Tugas /TM
        //Tampilkan hasil perhitungan dengan memanggil method yang ada pada perhitungan.java 
        //Method yang dibuat, menerima parameter dan mengembalikan nilai(method with return)

        //DIKUMPULKAN HARI SABTU,23 APRIL 2022
        //HASIL DIEMAIL BERUPA GITHUB REPO MASING-MASING MAHASISWA KE (aherijanto@mimoapps.xyz)
        //SUBJECT EMAILNYA : TM_NIM_NAMALENGKAP_KELAS
        //CONTOH : TM_21091000_BUDI_2C
        s.PrintJudul();

        int hasiltambahnya = s.hsltmbh(4, 6);
        System.out.println(hasiltambahnya);

        int hasilkalinya = s.hslkli(4, 6);
        System.out.println(hasilkalinya);       
    }
}
