import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int NumOfDeviders = 0;
        for(int i =1; i<=a; i++){
            if(a%i==0){
                NumOfDeviders++;
            }
        }
        if (NumOfDeviders==2){
            System.out.println("prime");
        }
        else{
            System.out.println("composite");
        }
    }
}
