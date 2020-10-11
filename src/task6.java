import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n2= n%10;
        int n1 =n/10%10;
        boolean check = true;
        while (n>0){
            if(n1==n2){
                check=false;
                System.out.println("YES");
                break;
            }

            n1=n2;
            n/=10;
            n2=n%10;
        }
        if(check){
            System.out.println("NO");
        }
    }
}
