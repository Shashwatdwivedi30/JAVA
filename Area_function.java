import java.util.*;
class Area_function {
    double area_circle(int r){
        double ar=0.0;
        ar=3.14*r*r;
        return ar;
    }
     static int area_rect(int a,int b){
         Area_function ob=new Area_function();
        System.out.println(ob.area_circle(5));
         int ar=0;
         ar=a*b;
         return ar;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(area_rect(a,b));
    }
}
//Shashwat Dwivedi
//62
