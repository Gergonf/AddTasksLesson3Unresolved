import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        boolean check = true;
        for (int i= 10000; i< 100000;i++){
            if(i%a==b && i%c==d){
                check=false;
                System.out.print(i+" ");
            }
        }
        if(check){
            System.out.println(-1);
        }
    }
}
