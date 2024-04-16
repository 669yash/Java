import java.lang.Thread;

class A extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("I am in thread 1 ");
            System.out.println(i);
        }
    }
}

class B extends Thread{
    public void run(){
        for(int j=1; j<=5; j++){
            System.out.println("I am in thread 2 ");
            System.out.println(j);
        }
    }
}

class C extends Thread{
    public void run(){
        for(int k=1; k<=5; k++){
            System.out.println("I am in thread 3 ");
            System.out.println(k);
        }
    }
}

public class multithreading {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();

//        a.run();
//        b.run();                 //Uncomment this for multithreading
//        c.run();

        a.start();
        b.start();
        c.start();

    }
}
