package May25_Day2_Strings;
import java.util.*;

public class Q1_Group_Anagram {
    // Qusetion 1:
    // Given an array of strings, group anagrams together.
    // Example:
    // • Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
    // • Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // inputz basic code
        System.out.println("Enter number of strings:");
        int n = sc.nextInt();


        String[] str = new String[n];
        System.out.println("Enter the strings:");

        // Takeing str input
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }

        // stroing result by fnc calling
        List<List<String>> result = groupAnagrams(str);

        // Print the grouped anagrams
        System.out.println("\nGrouped Anagrams:");
        for(int i = 0 ; i< result.size();i++){
            System.out.println(result.get(i));
        }

    }

    // This method returns grouped anagrams using HashMap
    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            // Convert word to character array and sort it
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars); // e.g., "eat" becomes "aet"

            // Check if sortedWord already in map, if not create a new list
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            // Add the original word to the group
            map.get(sortedWord).add(word);
        }

        // Return all grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }
}


