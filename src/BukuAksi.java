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

        pelajaran.tampilkanBukuAll();
        System.out.println("==================================================");

        Buku novel = new Buku();
        novel.id_buku = 02;
        novel.judul_buku = "If You Know Who";
        novel.isbn = "IYKW2018";
        novel.jumlah = 55;
        novel.tampilBuku();
        System.out.println("==================================================");


        Buku buku = new Buku();
        System.out.println("Tampil Ketersedian Buku");
        buku.tampilKetersedianBuku(10, "Pemrograman Berorientasi Objek");
        System.out.println("==================================================");

        Buku buku2 = new Buku();
        System.out.println("Tampil Judul Buku & Pengarang");
        buku2.judulBukuPengarang("Sistem Operasi", "Sutoyo");
        System.out.println("==================================================");

        //pembuatan object class2
        PerpustakaanPeminjamanBuku ppb = new PerpustakaanPeminjamanBuku();
        ppb.id_buku = 03;
        ppb.NamaPeminjam = "Elsa";
        ppb.JudulBukuDipinjam = "Diary Salsa";
        ppb.JumlahBukuDipinjam = 5;
        ppb.TampilkanInfoDataPeminjaman();


        PerpustakaanPeminjamanBuku ppb2 = new PerpustakaanPeminjamanBuku();
        ppb2.id_buku = 12;
        ppb2.NamaPeminjam = "Rina";
        ppb2.JudulBukuDipinjam = "Algoritma";
        ppb2.JumlahBukuDipinjam = 1;

        System.out.println("Tampil Daftar Nama Peminjam");
        ppb.DaftarNamaPeminjam("Elsa");
        ppb2.DaftarNamaPeminjam("Rina");

        //object constructor class1
        Buku B1 = new Buku();
        B1.tampilkanBukuAll();
        Buku B2 = new Buku();
        B2.tampilBuku();

        Buku B3 = new Buku(5, "Laravel", "2020lr", 1);
        B3.tampilBuku();
        Buku B4 = new Buku(6, "Asmaul Husna", "2013PA", 25);
        B4.tampilBuku();

        Buku B5 = new Buku(7, "Ilmu Sosial Budaya", "ISBD2017", "Permatasari", 10);
        B5.tampilkanBukuAll();
        Buku B6 = new Buku(8, "Pemrograman Visual", "Vsl2019", "PT.Intan", 20);
        B6.tampilkanBukuAll();

        //object ovveride
        PerpustakaanPeminjamanBuku BukuOver = new PerpustakaanPeminjamanBuku();
        BukuOver.tampilkanBukuAll();
        System.out.println("Override Tampil Ketersediaan Buku");
        BukuOver.tampilKetersedianBuku(20, "Pemrograman Visual");



    }
}
