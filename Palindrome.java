import java.util.*;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int a,digit,newdigit=0;
        
        System.out.println("Enter a no.");
        a=sc.nextInt();
        int b = a;
        digit =a%10;
        newdigit=digit*10 + newdigit;
        a=a/10;
        if(a==newdigit)
        System.out.println("Number "+b+" is palindrome");
        else
        System.out.println("Number "+b+" is not palindrome");
    }
}
