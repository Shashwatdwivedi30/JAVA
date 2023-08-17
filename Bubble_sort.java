import java.util.*;
class Bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, t = 0;
        System.out.println("Enter size");
        int n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter nos.");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (j = 0; j <n; j++) {
        for (i = 0; i < n-j-1; i++) {

                if (a[i] > a[i + 1]) {
                    t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
//Shashwat Dwivedi
//62
