import java.util.Scanner;

public class investmentvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float amount;
        System.out.println("Enter initial amount ");
        float principal = sc.nextInt();
        System.out.println("Enter interest rate ");
        float interest = sc.nextInt();
        System.out.println("Enter time in years ");
        int time = sc.nextInt();

        amount=principal*(1+(interest*time));
        System.out.println("The final amount is " +amount);

    }
}
