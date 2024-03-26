import java.util.ArrayList;
import java.util.List;

// Base class Employee
class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
// Base implementation for calculating bonus
        return 0.0;
    }

    public String generatePerformanceReport() {
// Base implementation for generating performance report
        return "Performance report for " + name + ":\n";
    }

    public void manageProject() {
// Base implementation for managing projects
        System.out.println(name + " is managing the project.");
    }
}

// Subclass Manager
class Manager extends Employee {
    private List teamMembers;

    public Manager(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
        teamMembers = new ArrayList<>();
    }

    public void addTeamMember(Employee employee) {
        teamMembers.add(employee);
    }

    @Override
    public double calculateBonus() {
// Example implementation for calculating bonus for a manager
        return salary * 0.1; // 10% of salary
    }

    @Override
    public String generatePerformanceReport() {
// Example implementation for generating performance report for a manager
        StringBuilder report = new StringBuilder(super.generatePerformanceReport());
        report.append("Overall team performance is satisfactory.");
        return report.toString();
    }

    @Override
    public void manageProject() {
// Example implementation for managing projects by a manager
        System.out.println(name + " is managing the project and supervising the team.");
    }
}

// Subclass Developer
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
// Example implementation for calculating bonus for a developer
        return salary * 0.05; // 5% of salary
    }

    @Override
    public String generatePerformanceReport() {
// Example implementation for generating performance report for a developer
        return super.generatePerformanceReport() + "Code quality is excellent.";
    }

    @Override
    public void manageProject() {
// Example implementation for managing projects by a developer
        System.out.println(name + " is working on the project as a developer.");
    }
}

// Subclass Programmer
class Programmer extends Developer {
    private String specialization;

    public Programmer(String name, String address, double salary, String jobTitle, String programmingLanguage, String specialization) {
        super(name, address, salary, jobTitle, programmingLanguage);
        this.specialization = specialization;
    }

    @Override
    public double calculateBonus() {
// Example implementation for calculating bonus for a programmer
        return salary * 0.07; // 7% of salary
    }

    @Override
    public String generatePerformanceReport() {
// Example implementation for generating performance report for a programmer
        return super.generatePerformanceReport() + "Expertise in " + specialization + ".";
    }
}

public class Ass4_2 {
    public static void main(String[] args) {
// Example usage
        Manager manager = new Manager("Yash", "Pune", 80000, "Manager");
        Developer developer = new Developer("Kartikey", "Jalgaon", 60000, "Developer", "Java");
        Programmer programmer = new Programmer("Sachin", "Nanded", 70000, "Programmer", "Python", "Data Science");

        System.out.println("Manager's bonus: $" + manager.calculateBonus());
        System.out.println(manager.generatePerformanceReport());
        manager.manageProject();

        System.out.println("Developer's bonus: $" + developer.calculateBonus());
        System.out.println(developer.generatePerformanceReport());
        developer.manageProject();

        System.out.println("Programmer's bonus: $" + programmer.calculateBonus());
        System.out.println(programmer.generatePerformanceReport());
        programmer.manageProject();
    }
}

