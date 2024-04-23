import java.lang.Thread;

class A extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            if(i==1) this.yield( );
            System.out.println("From thread 1: " +i);
        }

    }
}

class B extends Thread{
    public void run(){
        for(int j=1; j<=5; j++){
            System.out.println("From thread 2: " +j);
            //if(j==3) stop( );
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread{
    public void run(){
        for(int k=1; k<=5; k++){
            System.out.println("From thread 3: " +k);
            if(k==1)
                try{
                    sleep(1000);
                }
            catch(Exception e){
        }
        System.out.println("Exit from C");
    }
}

public class multithreadingoperations {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();

//        a.run();
//        b.run();                 //Uncomment this for multithreading
//        c.run();

        System.out.println("Start thread A");
        a.start();
        System.out.println("Start thread B");
        b.start();
        System.out.println("Start thread C");
        c.start();
        System.out.println("End of main thread");
    }
}
}
