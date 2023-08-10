import java.util.*;
class Max {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        String r=(a>b) && (a>c)?"a is greatest":(b>a) && (b>c)?"b is greatest":"c is greatest";
        System.out.println(r);
    }
}
//Shashwat Dwivedi
//62
