public class PerpustakaanPeminjamanBuku {
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

    public boolean create(){
        String insertSQL = "INSERT INTO perpustakaanpeminjamanbuku VALUES ('"+NamaPeminjam+"','"+JudulBukuDipinjam+"','"+JumlahBukuDipinjam+"')";
        System.out.println(insertSQL);
        return false;
    }
}
