package week1.task10;

public class CheckAnagram {
    public boolean checkAnagram(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }
        int[] char_count = new int[256];
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) < 97) {

                char_count[word1.charAt(i) + 32]++;
            } else {
                char_count[word1.charAt(i)]++;
            }
            if (word2.charAt(i) < 97) {
                char_count[word2.charAt(i) + 32]--;
            } else {
                char_count[word2.charAt(i)]--;
            }

        }
        for (int count : char_count) {
            if (count != 0) {
                System.out.println("Not anagram");
                return false;
            }
        }
        System.out.println("Is anagram");
        return true;
    }


}
