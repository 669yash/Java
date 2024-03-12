public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your First Name");
        String firstname = obj.nextLine();
        System.out.println("Enter your Last Name");
        String lastname = obj.nextLine();
        System.out.println("My name is " + firstname + " " + lastname);
        System.out.println();
        System.out.println("Enter your marks");
        int marks = obj.nextInt();
        if (marks > 75) {
            System.out.println("Distinction");
        } else {
            if (marks > 60) {
                System.out.println("First class");
            } else {
                if (marks > 33) {
                    System.out.println("Passed");
                } else {
                    System.out.println("Failed");
                }
            }
        }
    }
}
