import java.util.Scanner;

public class harmonicsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        float a=0;
        float b;
        for(int i=1; i<=n; i++){
            b= (float) 1 /i;
            a=a+b;
        }
        System.out.println("Harmonic Sum: " +a);
    }
}
