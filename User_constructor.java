import java.util.*;
public class User_constructor {
    String name;
    int pan;
    String add;
    double minbal=5000;
    user_con(){
        System.out.println("Welcome to SBI");
        System.out.println("Initial balance: 5000" );
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name: ");
        name=sc.nextLine();
        System.out.println("Enter pan number");
        pan=sc.nextInt();
        System.out.println("Enter address");
        add=sc.nextLine();
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Pan no: "+pan);
        System.out.println("Address: "+add);
    }
    public static void main(String []args){
        User_constructor ob=new User_constructor();
        ob.input();
        ob.display();
    }
}
//Shashwat Dwivedi
//62
