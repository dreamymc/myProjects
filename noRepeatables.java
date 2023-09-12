
import java.util.HashMap;
import java.util.Map;

public class noRepeatables {

    public static void main(String[] ukiyo) {
        String word = "I like the music you listen to.";
        System.out.println(lengthOfLongestSubstring(word));

    }

    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        int start = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int current = 0; current < s.length(); current++) {
            char letter = s.charAt(current);
            if (charIndexMap.containsKey(letter)) {
                start = Math.max(start, charIndexMap.get(letter) + 1);
            }
            charIndexMap.put(letter, current);
            count = Math.max(count, current - start + 1);
        }

        return count;
    }
}
