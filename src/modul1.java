

public class modul1 {
    private String Nama;
    private String Alamat;
    private String Desa;
    private String Kecamatan;

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public void setAlamat(String alamat) {
        this.Alamat = alamat;
    }

    public void setDesa(String desa) {
        this.Desa = desa;
    }

    public void setKecamatan(String kecamatan) {
        this.Kecamatan = kecamatan;
    }

    //    Get
    public String getNama() {
        return this.Nama ;
    }

    public String getAlamat() {
        return this.Alamat ;
    }

    public String getDesa() {
        return this.Desa ;
    }

    public String getKecamatan() {
        return this.Kecamatan ;
    }
}

class Main{
    public static void main(String[] args) {
        modul1 Data = new modul1();

        Data.setNama("Fahmi");
        Data.setAlamat("Indonesia, Jawa Timur");
        Data.setKecamatan("Rogojampi");
        Data.setDesa("Watukebo");

        System.out.println("Nama : " +Data.getNama());
        System.out.println("Alamat : " +Data.getAlamat());
        System.out.println("Kecamatan : " +Data.getKecamatan());
        System.out.println("Desa : " +Data.getDesa());
    }
}

