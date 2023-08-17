import java.util.*;
class Student_detail {
    String name;
    int roll_no;
    long mobile_no;
    int clas;
    double marks;
    String email;
    void get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name=sc.nextLine();
        System.out.println("Enter roll number");
        roll_no=sc.nextInt();
        System.out.println("Enter contact number");
        mobile_no=sc.nextLong();
        System.out.println("Enter class");
        clas=sc.nextInt();
        System.out.println("Enter marks");
        marks=sc.nextDouble();
        System.out.println("Enter email");
        email=sc.next();
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll number: "+roll_no);
        System.out.println("Contact number: "+mobile_no);
        System.out.println("Class: "+clas);
        System.out.println("Marks: "+marks);
        System.out.println("Email: "+email);

    }
    void calc() {
        double a = marks / 5;
        System.out.println(a);
    }
    public static void main(String[] args){
        Student obj=new Student();
        obj.get();
        obj.display();
        obj.calc();
    }
}

// Shashwat Dwivedi
// 62
