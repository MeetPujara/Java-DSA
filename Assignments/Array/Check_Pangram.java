package Assignments.Array;

public class Check_Pangram {
    // Added 'public' and 'String[] args' so the program can actually run
    public static void main(String[] args) {
        System.out.println(Pangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    static boolean Pangram(String sentence) {
        // This array tracks 26 slots, one for each letter of the alphabet
        boolean[] seen = new boolean[26];

        // 1. Fill the array
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            } else if (c >= 'A' && c <= 'Z') {
                seen[c - 'A'] = true;
            }
        }

        // 2. Check the array (The extended loop you requested)
        for (int i = 0; i < seen.length; i++) {
            boolean letter = seen[i];

            if (letter == false) {
                // If even one index is false, it's not a pangram
                return false;
            }
        }

        return true;
    }
}