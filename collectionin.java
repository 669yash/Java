import java.util.*;
class student{
    String name;
    int roll_no;
    String Branch;

    student(String name, int roll_no, String Branch){
        this.name=name;
        this.roll_no=roll_no;
        this.Branch=Branch;
    }

//    void getinfo() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter name: ");
//        name = sc.nextLine();
//        System.out.println("Enter roll no: ");
//        roll_no = sc.nextInt();
//        sc.nextLine(); // consume newline not consumed by nextInt()
//        System.out.println("Enter branch: ");
//        Branch = sc.nextLine();
//    }
//
    void showinfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll no. : " + roll_no);
        System.out.println("Branch: " + Branch);
    }


}
public class Main {
    public static void main(String[] args) {
//        Vector<student> v=new Vector<student>();
//        v.add(new student("Kartikey", 78, "CS"));
//        v.add(new student("Yash", 93, "CS"));
//        v.add(new student("Ritesh", 126, "EnTC"));
//        v.add(new student("Sachin", 79, "CS"));
//        Iterator<student> itr=v.iterator();
//        while(itr.hasNext()){
//            student s=itr.next();
//            s.showinfo();
//        }

//        ArrayList<student> a=new ArrayList<student>();
//        a.add(new student("Kartikey", 78, "CS"));
//        a.add(new student("Yash", 93, "CS"));
//        a.add(new student("Ritesh", 126, "EnTC"));
//        a.add(new student("Sachin", 79, "CS"));
//        Iterator<student> itr=a.iterator();
//        while(itr.hasNext()){
//            student s=itr.next();
//            s.showinfo();
//        }

//        LinkedList<student> l=new LinkedList<student>();
//        l.add(new student("Kartikey", 78, "CS"));
//        l.add(new student("Yash", 93, "CS"));
//        l.add(new student("Ritesh", 126, "EnTC"));
//        l.add(new student("Sachin", 79, "CS"));
//        Iterator<student> itr=l.iterator();
//        while(itr.hasNext()){
//            student s=itr.next();
//            s.showinfo();
//        }

//        Stack<student> stack = new Stack<student>();
//        stack.push(new student("Kartikey", 78, "CS"));
//        stack.push(new student("Yash", 93, "CS"));
//        stack.push(new student("Ritesh", 126, "EnTC"));
//        stack.push(new student("Sachin", 79, "CS" ));
//        stack.pop();
//        Iterator<student> itr=stack.iterator();
//        while(itr.hasNext()){
//            student s=itr.next();
//            s.showinfo();
//        }

//        PriorityQueue<student> queue=new PriorityQueue<student>(Comparator.comparingInt(s->s.roll_no));
//        queue.add(new student("Kartikey", 78, "CS"));
//        queue.add(new student("Yash", 93, "CS"));
//        queue.add(new student("Ritesh", 126, "EnTC"));
//        queue.add(new student("Sachin", 79, "CS"));
//        Iterator<student> itr=queue.iterator();
//        while(!queue.isEmpty()){
//            student s = queue.poll();
//            s.showinfo();
//        }

        HashSet<student> set=new HashSet<student>();
        set.add(new student("Kartikey", 78, "CS"));
        set.add(new student("Yash", 93, "CS"));
        set.add(new student("Ritesh", 126, "EnTC"));
        set.add(new student("Sachin", 79, "CS"));
        Iterator<student> itr=set.iterator();
        while(itr.hasNext()){
            student s=itr.next();
            s.showinfo();
        }

    }
}
