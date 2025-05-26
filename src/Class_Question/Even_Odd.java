package Class_Question;
import java.util.*;
//github class

public class Even_Odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter array length");
        int n = sc.nextInt();

        System.out.println("Input");
        int[] arr = new int[n];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
            if (arr[i]%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        System.out.println("even");
        for(int i = 0 ; i<even.size();i++){
            System.out.print(even.get(i)+" ");
        }
        System.out.println("Odd");
        for(int i = 0 ; i<odd.size();i++){
            System.out.print(odd.get(i)+" ");
        }

    }

}
