import java.util.*;
public class evenodd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int a=sc.nextInt();
        if(a%2==0)
        System.out.println("Number "+a+" is even");
        else
        System.out.println("Number "+a+" is odd");
    }
}
