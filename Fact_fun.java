import java.util.*;
public class Fact_fun {
    int fact(int a){
        int i,f=1;
        for(i=1;i<=a;i++) {
            f *= i;
        }
        return f;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        Fact_fun ob=new Fact_fun();
        int a=ob.fact(x);
        System.out.println(a);
    }
}
//Shashwat Dwivedi
//62
