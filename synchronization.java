import java.lang.Thread;
class a extends Thread{
    int n;
    a(int n){
        this.n=n;
    }
    synchronized public void disp() {
        int temp=1;
        for(int i=1; i<11; i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
    }
}

class b extends Thread{
    int n;
    b(int n){
        this.n=n;
    }
    synchronized public void disp(){
        for(int j=1; j<11; j++){
            System.out.println(n+"x"+j+"="+n*j);
        }
    }

}
public class SYNCRO {
    public static void main(String[] args){
        a A = new a(2);
        b B = new b(5);

        A.disp();
        B.disp();
    }
}
