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

    public boolean create(String NamaPeminjam, String JudulBukuDipinjam, int JumlahBukuDipinjam){
        String insertSQL = "INSERT INTO perpustakaanpeminjamanbuku VALUES ('"+NamaPeminjam+"','"+JudulBukuDipinjam+"','"+JumlahBukuDipinjam+"')";
        System.out.println(insertSQL);
        return false;
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
    public boolean create() { return super.create(); }

    @Override
    public boolean create(String judul_buku, String deskripsi) {
        return super.create(judul_buku, deskripsi);
    }
}
