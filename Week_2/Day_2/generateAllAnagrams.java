import java.util.*;
public class generateAllAnagrams {
    public List<String> generateAnagrams(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), 0, result);
        return result;
    }

    private void backtrack(char[] chars, int index, List<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }
        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            backtrack(chars, index + 1, result);
            swap(chars, index, i); // backtrack
        }
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        generateAllAnagrams solution = new generateAllAnagrams();
        String s = "abc";
        List<String> anagrams = solution.generateAnagrams(s);
        System.out.println(anagrams); // Output: [abc, acb, bac, bca, cab, cba]
    }
}