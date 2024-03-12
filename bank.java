import java.util.Scanner;

class bankaccount {
    int account_no;
    int account_balance;
    String name;

    public bankaccount(int account_no, int account_balance, String name) {

    }

    public bankaccount() {

    }

    public void getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter account no: ");
        account_no = sc.nextInt();
        System.out.println("Enter account balance: ");
        account_balance = sc.nextInt();
    }

    public void dispinfo() {
        System.out.println("Name:" + name);
        System.out.println("Acoount no.:" + account_no);
        System.out.println("Account balance:" + account_balance);
    }
    public void Deposite(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to Deposite: ");
        int Depo = sc.nextInt();
        account_balance +=Depo;
        System.out.println("Updated Balance: " + account_balance);

    }

    public void Withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to Withdraw: ");
        int with = sc.nextInt();
        if(with>account_balance)
            System.out.println("Cannot WithDraw..!");
        else
            account_balance -=with;
        System.out.println("Updated Balance: " + account_balance);
    }
}
class savingaccount extends bankaccount{
    int limit;
    public savingaccount(int account_no, int account_balance, String name){
        super(account_no, account_balance, name);
        limit=1000;
    }

    public savingaccount() {

    }

    public void Withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to Withdraw: ");
        int with = sc.nextInt();
        if(with>0 && (account_balance+limit)>with){
            account_balance -= with;
            System.out.println("Updated Balance: " + account_balance);
        }
        else {
            System.out.println("Cannot withdraw");
        }
    }

}

public class bank {
    public static void main(String[] args) {
        bankaccount b1 = new bankaccount();
        savingaccount s1 = new savingaccount(5050,2000, "Yash");
        b1.getinfo();
        b1.dispinfo();
        b1.Deposite();
        b1.Withdraw();
        s1.Withdraw();

    }
}
