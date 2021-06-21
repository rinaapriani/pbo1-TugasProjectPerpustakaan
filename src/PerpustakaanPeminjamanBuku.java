public class PerpustakaanPeminjamanBuku extends Buku{
    //atribut
    public String NamaPeminjam;
    public String JudulBukuDipinjam;
    public int JumlahBukuDipinjam;

    //method
    public void TampilkanInfoDataPeminjaman(){
        System.out.println("=====================");
        System.out.println("Nama Peminjam : " +NamaPeminjam);
        System.out.println("Judul Buku : " +JudulBukuDipinjam);
        System.out.println("Jumlah Buku Dipinjam : " +JumlahBukuDipinjam);
    }

    public void DaftarNamaPeminjam(String NamaPeminjam){
        System.out.println("========================");
        System.out.println("Nama Peminjam : " +NamaPeminjam);
    }

    //getter & setter seluruh atribut

    public String getNamaPeminjam() {
        return NamaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        NamaPeminjam = namaPeminjam;
    }

    public String getJudulBukuDipinjam() {
        return JudulBukuDipinjam;
    }

    public void setJudulBukuDipinjam(String judulBukuDipinjam) {
        JudulBukuDipinjam = judulBukuDipinjam;
    }

    public int getJumlahBukuDipinjam() {
        return JumlahBukuDipinjam;
    }

    public void setJumlahBukuDipinjam(int jumlahBukuDipinjam) {
        JumlahBukuDipinjam = jumlahBukuDipinjam;
    }

    //ovveride


    @Override
    public void tampilkanBukuAll() {
        super.tampilkanBukuAll();
    }

    @Override
    public void tampilKetersedianBuku(int jumlah, String judul_buku) {
        super.tampilKetersedianBuku(jumlah, judul_buku);
    }
}
