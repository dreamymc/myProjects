
import java.util.ArrayList;
import java.util.HashMap;

public class longestPalindrome {

    public static void main(String[] ukiyo) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

//    public static String longestPalindrome(String s) { //short method
//    if (s == null || s.length() == 0) return "";  
//    String longest = "";
//    for (int i = 0; i < s.length(); i++) {
//        String oddPalindrome = helper(s, i, i);
//        String evenPalindrome = helper(s, i, i + 1);
//        String currentLongest = oddPalindrome.length() > evenPalindrome.length() ? oddPalindrome : evenPalindrome;   
//        if (currentLongest.length() > longest.length()) {
//            longest = currentLongest;}}  
//    return longest;
//}
//    private static String helper(String s,int left, int right){
//        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
//            left--;
//            right++;}
//        return s.substring(left + 1, right);
//    }

    public static String longestPalindrome(String s) { //my method
        int first = 0;
        int last = 0;
        boolean flag = false;
        ArrayList<String> stringList = new ArrayList<>();
        for (int x = 0; x < s.length(); x++) {
            first = x;
            for (int y = x + 1; y < s.length(); y++) {
                if (s.charAt(y) == s.charAt(x)) {
                    String pal = "";
                    last = y;
                    pal = s.substring(first, last + 1);
                    StringBuilder sb = new StringBuilder(pal);
                    sb.reverse();
                    if (pal.equals(sb.toString())) {
                        flag = true;
                        stringList.add(pal);
                    }}}}
        int a = 0;
        int number = 0;
        for (int z = 0; z < stringList.size(); z++) {
            if (a < stringList.get(z).length()) {
                a = stringList.get(z).length();
                number = z;}}
        if (flag == true) 
            return stringList.get(number);
         else 
            return (Character.toString(s.charAt(0)));}

}
