public class sumevenodd {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        for(int i=0; i<=100; i=i+2){
            a=a+i;
        }
        System.out.println("The sum of even numbers less than 100 is " + a);
        for(int j=1; j<=100; j=j+2){
            b=b+j;
        }
        System.out.println("The sum of odd numbers less than 100 is " + b);
    }
}
