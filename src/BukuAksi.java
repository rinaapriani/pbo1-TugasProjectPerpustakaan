public class BukuAksi {
    public static void main(String[] args) {

        //Instance/Pembuatan object dari suatu class1
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

        //pembuatan object class2
        PerpustakaanPeminjamanBuku ppb = new PerpustakaanPeminjamanBuku();
        ppb.id_buku = 03;
        ppb.NamaPeminjam = "Elsa";
        ppb.JudulBukuDipinjam = "Diary Salsa";
        ppb.JumlahBukuDipinjam = 5;

        ppb.TampilkanInfoDataPeminjaman();
        ppb.create("Yayu", "Dakwah Islam", 1);

        //object constructor class1
        Buku B1 = new Buku();
        B1.tampilkanBuku();
        Buku B2 = new Buku();
        B2.tampilBuku();

        Buku B3 = new Buku(5, "Laravel", "2020lr", 1);
        B3.tampilBuku();
        Buku B4 = new Buku(6, "Asmaul Husna", "2013PA", 25);
        B4.tampilBuku();

        Buku B5 = new Buku(7, "Ilmu Sosial Budaya", "ISBD2017", "Permatasari", 10);
        B5.tampilkanBuku();
        Buku B6 = new Buku(8, "Pemrograman Visual", "Vsl2019", "PT.Intan", 20);
        B6.tampilkanBuku();

        //object ovveride
        PerpustakaanPeminjamanBuku BukuOver = new PerpustakaanPeminjamanBuku();
        BukuOver.create();
        BukuOver.create("Pemrograman Pascal", "Mempelajari Bahasa Pemrograman Pascal");

    }
}
