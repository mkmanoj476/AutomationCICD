package MIssion.Day7;

import java.util.HashSet;

public class MaxString {

    public static void main(String[] args) {
        String str = "pwkesdfwpkdsew";
        int n = str.length();
        int maxlength = 0;
        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        while (j < n) {
            if (!set.contains(str.charAt(j))) {
                set.add(str.charAt(j));
                j++;
                maxlength = Math.max(maxlength, j - i);

            } else {
                set.remove(str.charAt(i));
                i++;
            }
        }
        System.out.println(maxlength);

    }

}
