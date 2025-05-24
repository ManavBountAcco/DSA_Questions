
import java.sql.Array;
import java.util.*;
public class Two_Sum {

    public static void main(String[] Args){
        //1. Two Sum II - Input array is sorted
        //Given a sorted array of integers, return the indices of the two numbers
        // such that they add up to a specific target.

        //Approach 2 pointer -> Left and right travel for k
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your target k : ");
        int k = sc.nextInt();

        //Array input
        System.out.println("Array length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Now add your array: ");
        for (int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }


        int first = 0;
        int last = n-1;
        while(first<last){
            if((arr[first] +arr[last]) == k){
                System.out.println("Element "+arr[first]+" and " + arr[last]+" makes sum "+k);
                break;
            }else if((arr[first] +arr[last]) <k){
                first++;
            }else{
                last--;
            }
        }
        if(last<=first){
            System.out.println("No match found");
        }

    }
}
