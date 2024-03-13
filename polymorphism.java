class AddSum{
    public int sum(int a, int b){
        return(a+b);
    }
    public double sum(double a, double b, double c){
        return(a+b+c);
    }
    public double sum(double a, double b){
        return(a+b);
    }
}

public class polymorphism {
    public static void main(String[] args){
        AddSum p=new AddSum();
        int k=p.sum(2,3);
        System.out.println(k);
        double l=p.sum(2.5,7.5);
        System.out.println(l);
        double m=p.sum(2.5,3.5,4.5);
        System.out.println(m);
    }

}
