import java.util.*;

public class Main {
    public static void main(String[] args) {
        // int[] myArray = { 1, 2, 3 };
        // System.out.println("Hello" + myArray);
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();
        System.out.println("Array elements are:");
        for (int j = 0; j < a.length; j++)
            System.out.println(a[j]);

    }
}