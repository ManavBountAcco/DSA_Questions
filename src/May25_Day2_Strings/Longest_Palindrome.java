package May25_Day2_Strings;
import java.util.*;

public class Longest_Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Brute I Am thinking get all strings possible add them in a set if its a palinfrome and size greater than lat one
        //Better if we move i j like diary slpit /2

        // Input from user lelo
        System.out.println("Enter a string to find longest palindrome:");
        String s = sc.nextLine();

        // Call the function
        String result = longestPalindrome(s);

        // Output
        System.out.println("Longest Palindromic Substring: " + result);
    }

    // Function to find the longest palindromic substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0;
        int end = 0;

        //travel for all character in a array
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome (center at one letter)
            int len1 = expandFromCenter(s, i, i);

            // Even length palindrome (center between two letters)
            int len2 = expandFromCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            // Update the longest range found
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        // Return the longest palindrome substring
        return s.substring(start, end + 1);
    }

    // Helper function to expand around center and return length
    public static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}

