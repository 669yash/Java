import java.util.Scanner;

abstract class employee{
    String name;
    int salary;
    String department;
    String designation;

    void getinfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of employee: ");
        name = sc.nextLine();
        System.out.println("Enter salary of employee: ");
        salary = sc.nextInt();
        System.out.println("Enter department of employee: ");
        department = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter designation of employee: ");
        designation = sc.nextLine();
    }
    void disp(){
        System.out.println("Name of employee: " +name);
        System.out.println("Salary of employee: " +salary);
        System.out.println("Department of employee: " +department);
        System.out.println("Designation of employee: " +designation);
    }
}

class manager extends employee{
    String Manager;

    void getmaninfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter type of manager ");
        Manager = sc.nextLine();
    }
}

class salesperson extends manager{
    String Salesperson;

    void getsalesinfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter company name");
        Salesperson = sc.nextLine();
    }
}
public class abstractemp {

    public static void main(String[] args){
        manager m1 = new manager();
        m1.getinfo();
        m1.getmaninfo();
        m1.disp();


        salesperson s1 = new salesperson();
        s1.getinfo();
        s1.getsalesinfo();
        s1.disp();

    }


}
