package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram{

    static boolean isAnagram(String a, String b) {
            boolean ss = a.equalsIgnoreCase(b);
            if (ss == false){
                char[] c = a.toCharArray();
                char[] c2 = b.toCharArray();

                Arrays.sort(c);
                Arrays.sort(c2);
                boolean result = Arrays.equals(c, c2);
                return result;
            }
            else {
                return true;
            }

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();

        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
