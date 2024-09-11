package loops;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                continue;
            }
            System.out.println(j);
        }
        int k = 0;
        while (k < 10) {
            System.out.println(k);
            k++;
            if (k == 4) {
                break;
            }
        }
        int l = 0;
        while (l < 10) {
            if (l == 4) {
                l++;
                continue;
            }
            System.out.println(l);
            l++;
        }
    }
}
