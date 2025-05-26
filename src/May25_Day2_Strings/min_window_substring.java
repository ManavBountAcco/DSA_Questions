package May25_Day2_Strings;
import java.util.*;
public class min_window_substring {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the main string (s):");
            String s = sc.nextLine();

            System.out.println("Enter the target string (t):");
            String t = sc.nextLine();

            String result = minWindow(s, t);
            System.out.println("Minimum Window Substring: " + result);
        }

        public static String minWindow(String s, String t) {
            if (s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
                return "";
            }
            Map<Character, Integer> required = new HashMap<>();
            for (char c : t.toCharArray()) {
                required.put(c, required.getOrDefault(c, 0) + 1);
            }
            int left = 0, right = 0;
            int formed = 0;
            Map<Character, Integer> windowCounts = new HashMap<>();
            int minLen = Integer.MAX_VALUE;
            int minStart = 0;

            int requiredSize = required.size();  // number of unique characters to match

            //
            while (right < s.length()) {
                char c = s.charAt(right);
                windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

                // If character frequency matches the target frequency
                if (required.containsKey(c) && windowCounts.get(c).intValue() == required.get(c).intValue()) {
                    formed++;
                }

                // Sliding window formula
                while (left <= right && formed == requiredSize) {
                    char startChar = s.charAt(left);

                    // Update the minimum window
                    if (right - left + 1 < minLen) {
                        minLen = right - left + 1;
                        minStart = left;
                    }

                    // Remove left character from window
                    windowCounts.put(startChar, windowCounts.get(startChar) - 1);
                    if (required.containsKey(startChar) && windowCounts.get(startChar).intValue() < required.get(startChar).intValue()) {
                        formed--;
                    }

                    left++;
                }

                right++;
            }


            return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
        }
    }


