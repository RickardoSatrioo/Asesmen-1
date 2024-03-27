public class soal1Main {
    public static void main(String[] args) {
        soal1Back simulasi = new soal1Back();
        simulasi.mulai();
        simulasi.maju("Detail");
        simulasi.maju("Favorit");
        simulasi.mundur();
        simulasi.maju("Detail");
        simulasi.maju("Favorit");
        simulasi.mundur();
        simulasi.mundur();
        simulasi.mundur();
        simulasi.history();
    }
}
