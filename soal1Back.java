import java.util.Stack;

public class soal1Back {
    private Stack<String> historyStack = new Stack<>();
    private String currentPage;

    public void mulai() {
        currentPage = "Utama";
        System.out.println("Masuk ke halaman " + currentPage);
        historyStack.push(currentPage);
    }

    public void maju(String nextPage) {
        if (currentPage.equals(nextPage)) {
            System.out.println("Tidak bisa maju ke halaman yang sama");
        } else {
            System.out.println("Masuk ke halaman " + nextPage);
            historyStack.push(nextPage);
            currentPage = nextPage;
        }
    }

    public void mundur() {
        if (historyStack.isEmpty()) {
            System.out.println("Tidak ada halaman untuk mundur");
        } else if (currentPage.equals("Utama")) {
            System.out.println("Keluar dari aplikasi");
        } else {
            String lastPage = historyStack.pop();
            System.out.println("Mundur ke halaman " + lastPage);
            currentPage = lastPage;
        }
    }

    public void history() {
        System.out.println("Alur mundur pengguna:");
        for (String page : historyStack) {
            System.out.println(page);
        }
    }
}