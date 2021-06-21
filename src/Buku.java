import java.sql.ResultSet;
import java.sql.SQLException;

public class Buku {

    //atribut
    public int id_buku;
    public String judul_buku;
    public String isbn;
    public String pengarang;
    public int halaman;
    public String penerbit;
    public int jumlah;
    public String deskripsi;


    //method
    public void tampilkanBukuAll(){
        System.out.println("=======================");
        System.out.println("Id Buku : " + id_buku);
        System.out.println("Judul Buku : " + judul_buku);
        System.out.println("ISBN : " + isbn);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Halaman : " + halaman);
        System.out.println("Penerbit : " + penerbit);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Deskripsi : " + deskripsi);
    }

    public void tampilBuku(){
        System.out.println();
        System.out.println("Id Buku : " +id_buku);
        System.out.println("Judul Buku : " +judul_buku);
        System.out.println("ISBN : " +isbn);
        System.out.println("Jumlah : " +jumlah);
    }

    public void tampilKetersedianBuku(int jumlah, String judul_buku)
    {
        System.out.println("Jumlah Buku : " +jumlah);
        System.out.println("Judul Buku : " +judul_buku);
    }

    public void judulBukuPengarang(String judul_buku, String pengarang)
    {
        System.out.println("Judul Buku : " +judul_buku);
        System.out.println("Pengarang : " +pengarang);
    }


    //constructor
    public Buku() {
        System.out.println("Ini dari constructor");
        judul_buku = "Maaf Data Judul Buku Kosong, Mohon Diisi";
        isbn = "Maaf Data ISBN Kosong, Mohon Diisi";
        pengarang = "Maaf Data Pengarang Kosong, Mohon Diisi";
        penerbit = "Maaf Data Penerbit Kosong, Mohon Diisi";
        deskripsi = "Maaf Data Deskripsi Kosong, Mohon Diisi";
    }

    public Buku(int id_buku, String judul_buku, String isbn, int jumlah) {
        this.id_buku = id_buku;
        this.judul_buku = judul_buku;
        this.isbn = isbn;
        this.jumlah = jumlah;
    }

    public Buku(int id_buku, String judul_buku, String isbn, String penerbit, int jumlah) {
        this.id_buku = id_buku;
        this.judul_buku = judul_buku;
        this.isbn = isbn;
        this.penerbit = penerbit;
        this.jumlah = jumlah;
    }

    //getter & setter seluruh atribut

    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
