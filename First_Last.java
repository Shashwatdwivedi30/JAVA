import java.util.*;
class First_Last
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int first_digit = 0, last_digit = 0, n;
        System.out.println("Enter the number:");
        n = sc.nextInt();
        last_digit = n % 10;
        System.out.println("Last digit: " + last_digit);
        while (n != 0)
          {
              first_digit = n % 10;
              n /= 10;
          }
        System.out.println("First digit:" + first_digit);
    }
}
// Shashwat Dwivedi
// 62
