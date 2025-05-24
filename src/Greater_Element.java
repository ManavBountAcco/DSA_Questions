import java.util.*;
public class Greater_Element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //3. Next Greater Element
        //Given a circular array, find the next greater number for every element.
        //231 -> 312

        //Approach
        //find max element and play swap from there

        //input  // skipping method of string to array
       // System.out.println("Enter string");
       // String str = sc.next();
        //String to Array

        System.out.println("Enter length of a array ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Input");
        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }

        //Logic
        int max = 0;
        for (int i = 0 ; i<n;i++){
            if(arr[i] >= arr[max]){
                max = i;
            }
        }

       //swap element before k , swap full array
        for(int i = 0 ; i<max/2;i++){
            int temp = arr[i];
            arr[i] = arr[max-1 -i];
            arr[max-1-i] = temp;
        }
//        for(int  i = 0 ; i<n; i++){  //debug
//            System.out.print(arr[i]);
//        }

        //full swap
        for(int i = 0 ; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        for(int  i = 0 ; i<n; i++){
            System.out.print(arr[i]);
        }


    }
}
