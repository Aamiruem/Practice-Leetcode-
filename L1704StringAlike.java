public class L1704StringAlike {

    public static void main(String[] args) {
        String s = "book";
        System.out.println(areHalvesAlike(s)); // Output should be true
    }

    public static boolean areHalvesAlike(String s) {
        int n = s.length();
        int half = n / 2;

        // Split the string into two halves
        String firstHalf = s.substring(0, half);
        String secondHalf = s.substring(half, n);

        // Count the vowels in both halves
        int firstHalfVowels = countVowels(firstHalf);
        int secondHalfVowels = countVowels(secondHalf);

        // Compare the vowel counts
        return firstHalfVowels == secondHalfVowels;
    }

    private static int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isVowel(char c) {
        // Check if the character is a vowel (both lowercase and uppercase)
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
