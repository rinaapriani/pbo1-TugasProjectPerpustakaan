
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
    public void tampilkanBuku(){
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
        System.out.println("Id Buku : " +id_buku);
        System.out.println("Judul Buku : " +judul_buku);
        System.out.println("ISBN : " +isbn);
        System.out.println("Jumlah : " +jumlah);
    }

    public boolean create()
    {
        String insertSQL = "INSERT INTO buku VALUES ('"+id_buku+"','"+judul_buku+"','"+isbn+"','"+pengarang+"','"+halaman+"','"+penerbit+"','"+jumlah+"','"+deskripsi+"')";
        System.out.println(insertSQL);
        boolean berhasil = true;
        if(berhasil){
            return true;
        }else {
            return false;
        }
    }

    public boolean create(String judul_buku, String deskripsi) {
        String insertSQL = "INSERT INTO buku VALUES ('"+judul_buku+"','"+deskripsi+"' )";
        System.out.println(insertSQL);
        return false;
    }
}
