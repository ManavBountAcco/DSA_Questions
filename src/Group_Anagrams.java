import java.util.*;
public class Group_Anagrams {
    public static void main(String[] args){

        //8. Group Anagrams
        //Given an array of strings, group the anagrams together.

        Scanner sc = new Scanner(System.in);
        System.out.println("How many strings you want");
        int n = sc.nextInt();

        System.out.println("Enter your strings");
        String[] strs  = new String[n];


        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }
        //now for output -> arraylist <> Map
        //time over
    }
}
