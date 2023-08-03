import java.util.*;
public class divisible
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int a=sc.nextInt();
        if(a%3==0 && a%5==0)
        System.out.println("Number "+a+" is divisible by 3 and 5");
        else
        System.out.println("Number "+a+" is not divisible by 3 and 5");
    }
}
