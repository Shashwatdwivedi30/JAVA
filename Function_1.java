import java.util.Scanner;
class Function_1 {
    void sum(int a,int b){
        int s=a+b;
        System.out.println("Sum is:"+s);
    }
    static void area(int r){
        double ar=3.14 * r * r;
        System.out.println("Area is:"+ar);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Function_1 ob=new Function_1();
        System.out.println("Enter 2 nos to be added");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Enter radius");
        int r=sc.nextInt();
        ob.sum(x,y);
        area(r);
    }
}
// Shashwat Dwivedi
// 62
