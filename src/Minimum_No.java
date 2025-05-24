import java.util.*;
public class Minimum_No {
    public static void main(String[] args){
        //Rearrange a no to find min possible no in o(n) and constant space.

        //Approach n(logn) ->Sort
        //for O(n) can create map but space issue

        //Basic nlogn
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of a array ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Input");
        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

    }
}
