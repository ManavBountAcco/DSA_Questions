import java.util.*;
public class Subarray_sum {
    public static void main(String[] args){

        //2. Subarray Sum Equals K
        //Given an array of integers and a target sum k,
        // return the total number of continuous subarrays whose sum equals to k.
        Scanner sc = new Scanner(System.in);

        //Approaches
        //Brute force -> make all combo check sum and if match count++
        //optimized prefix sum -> take contiues sum , make combo and inc count if match
        //more optimized for O(n) : logic not coming


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

        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i< n;i++){
            prefix[i] = prefix [i-1] + arr[i];
        }

        //Now counting by travelling


        int count = 0;
        for(int i = 0 ; i< n; i++){
            int sum = 0;
            for (int j = i ; j<n ; j++){
                sum = sum + prefix[j];
                if(sum==0)
                {
                    count++;
                }
            }

        }
        System.out.println(count);

    }
}
