import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int chet = 2;
        for (int i = 0; i < N; i++) {
            System.out.print(chet+" ");
            chet+=2;
        }
    }
}
