package Class_Question;

import java.util.*;
import static java.lang.Math.sqrt;

public class Even_Odd {

    // Marked static to allow calling from main
    public static boolean checkPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i <= (int) sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array length");
        int n = sc.nextInt();

        System.out.println("Input");
        int[] arr = new int[n];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }

        System.out.println("Even:");
        for (int num : even) {
            System.out.print(num + " ");
        }

        System.out.println("\nOdd:");
        for (int num : odd) {
            System.out.print(num + " ");
        }

        System.out.println("\nPrime:");
        for (int i = 0; i < arr.length; i++) {
            if (checkPrime(arr[i])) {
                System.out.println(arr[i] + " is prime Number");
            } else {
                System.out.println(arr[i] + " is not a prime number");
            }
        }

        sc.close(); // Good practice to close Scanner
    }
}
