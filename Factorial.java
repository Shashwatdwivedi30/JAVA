import java.util.*;
class Factorial {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i,f=1;
        System.out.println("Enter a number");
        a=sc.nextInt();
        for(i=1;i<=a;i++){
            f*=i;
        }
        System.out.println(f);
    }
}
// Shashwat Dwivedi
// 62
