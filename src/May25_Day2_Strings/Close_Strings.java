package May25_Day2_Strings;

import java.util.*;

public class Close_Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for base
        System.out.println("Enter word1:");
        String word1 = sc.nextLine();

        System.out.println("Enter word2:");
        String word2 = sc.nextLine();
        boolean result = areCloseStrings(word1, word2);


        System.out.println("Are the strong close..? " + result);
    }

    public static boolean areCloseStrings(String word1, String word2) {
        //  Length must be same to avoid firther code run
        if (word1.length() != word2.length()) return false;

        // has
        int[] freq1 = new int[26];  // for a-z
        int[] freq2 = new int[26];

        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
        }

        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
        }

        // SCHECL
        for (int i = 0; i < 26; i++) {
            // If one string has the letter and other mot there so return false
            if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) {
                return false;
            }
        }


        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }
}
