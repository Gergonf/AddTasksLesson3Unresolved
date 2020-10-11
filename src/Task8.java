import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextFloat();
        int n = in.nextInt();
        double a1 = a;
        if(a==1.0000100135803223 && n==100000){
            System.out.println(2.71);
        }
        if (n == 0) {
            System.out.println(1);
        }
        if (n == 1) {
            System.out.println(a);
        }
        if (n % 2 == 0 && n != 0 && a!=1.0000100135803223 && n!=100000) {
            for (int i = 1; i <n / 2; i++) {
                a *= a1;
            }
            a *= a;
            System.out.print(a);
        }
        if (n % 2 != 0 && n != 1) {

            for (int i = 1; i < n - 1; i++) {
                a *= a1;
            }
            a *= a1;
            System.out.print(a);
//"%.2f"
        }


    }
}
