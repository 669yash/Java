import java.util.Scanner;

class Student {
    String name;
    int roll_no;
    String Branch;

    void getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter roll no: ");
        roll_no = sc.nextInt();
        sc.nextLine(); // consume newline not consumed by nextInt()
        System.out.println("Enter branch: ");
        Branch = sc.nextLine();
    }

    void showinfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll no. : " + roll_no);
        System.out.println("Branch: " + Branch);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("For Student " + i);
            s[i] = new Student(); // create new object for each student
            s[i].getinfo();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("For Student " + i);
            s[i].showinfo();
        }
    }
}
