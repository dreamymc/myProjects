
import java.util.HashMap;

public class romanToInt {

    public static void main(String[] ukiyo) {
        String s = "III";
        System.out.println(romanToInt(s));

    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romans = new HashMap<>();
        romans.put('M', 1000);
        romans.put('D', 500);
        romans.put('C', 100);
        romans.put('L', 50);
        romans.put('X', 10);
        romans.put('V', 5);
        romans.put('I', 1);
        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += romans.get(s.charAt(i));
        }
        return result;

    }
}
