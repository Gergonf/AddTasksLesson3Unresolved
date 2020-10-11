import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int scan;
        boolean crashCheck = true;
        for (int i = 1; i <= N; i++) {
            scan = in.nextInt();
            if (scan <= 437) {
                System.out.println("Crash " + i);
                crashCheck = false;
                break;
            }
        }
        if (crashCheck) {
            System.out.println("No crash");
        }
    }
}
