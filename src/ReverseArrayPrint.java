import java.lang.reflect.Array;
import java.util.Scanner;

public class ReverseArrayPrint {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();
        int[] array = new int[32767];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(" ");

        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Array elements printed in reverse order are:");
        for (int i = n-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

