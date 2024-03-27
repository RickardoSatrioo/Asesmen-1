public class soal2Antik {
    private String nama;
    private String jenis;
    private int tahunPembuatan;
    private String asalNegara;

    public soal2Antik(String nama, String jenis, int tahunPembuatan, String asalNegara) {
        this.nama = nama;
        this.jenis = jenis;
        this.tahunPembuatan = tahunPembuatan;
        this.asalNegara = asalNegara;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public String getAsalNegara() {
        return asalNegara;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Jenis: " + jenis + ", Tahun Pembuatan: " + tahunPembuatan + ", Asal Negara: " + asalNegara;
    }
}
