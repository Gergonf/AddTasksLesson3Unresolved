import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int A1;
        int B =in.nextInt();
        if(B==0){
            System.out.println(0);
        }
        if(B>0){
            A1=A;
            for (int i = 1; i<B; i++){
              A+=A1;
            }
            System.out.println(A);
        }
        if(B<0 && A>0){
            A1=-A;
            for (int i = 1; i<-B; i++){
                A1-=A;
            }
            System.out.println(A1);
        }
        if(B<0 && A<0){
            A=-A;
            A1=A;
            for (int i=1; i<-B; i++){
                A+=A1;
            }
            System.out.println(A);
        }

    }
}
