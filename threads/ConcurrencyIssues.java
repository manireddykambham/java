package threads;

public class ConcurrencyIssues extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        ConcurrencyIssues thread = new ConcurrencyIssues();
        thread.start();
        while (thread.isAlive()) {
            System.out.println(" is alive waiting for it to finish");
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }

}
