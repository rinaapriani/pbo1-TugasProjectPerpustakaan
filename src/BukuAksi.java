public class BukuAksi {
    public static void main(String[] args) {

        //Instance/Pembuatan object dari suatu class
        Buku pelajaran = new Buku();
        pelajaran.id_buku = 01;
        pelajaran.judul_buku = "Pemrograman Berorientasi Objek";
        pelajaran.isbn = "PBO2019";
        pelajaran.pengarang = "Sulistyo";
        pelajaran.halaman = 120;
        pelajaran.penerbit = "PT.ANTARIKSA";
        pelajaran.jumlah = 10;
        pelajaran.deskripsi = "Pemrograman Berorientasi Objek, Java";

        pelajaran.tampilkanBuku();
        pelajaran.create();
        pelajaran.create("HTML Dasar", "Belajar Bahasa Program HTML Dasar");

        pelajaran.tampilkanBuku();
        if (pelajaran.create()){
            System.out.println("Data berhasil disimpan");
        }else {
            System.out.println("Data gagal disimpan");
        }


        Buku novel = new Buku();
        novel.id_buku = 02;
        novel.judul_buku = "If You Know Who";
        novel.isbn = "IYKW2018";
        novel.jumlah = 55;

        novel.tampilBuku();

        PerpustakaanPeminjamanBuku ppb = new PerpustakaanPeminjamanBuku();
        ppb.id_buku = 02;
        ppb.tampilkanBuku();
        ppb.NamaPeminjam = "Elsa";
        ppb.JudulBukuDipinjam = "If You Know Who";
        ppb.JumlahBukuDipinjam = 10;
        ppb.TampilkanInfoDataPeminjaman();

        ppb.create("Lita Sari", "HTML Dasar", 5);
    }
}
