/**
 * Created by dimon on 12.10.2016.
 */
public class cw08 {
    public static void main(String[] args) {
        System.out.println(equals("TExt", "Text"));
        System.out.println(equals("Text", "Text"));
        System.out.println(equals("Text", "Textt"));

    }

    static boolean equals(String first, String second) {
        if (first.length() != second.length()) return false;
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();
        for (int i = 0; i < firstChars.length; i++) {
            if (firstChars[i] != secondChars[i]) return false;
        }
        return true;
    }

    static boolean compare(String s, String s1) {
        char[] array1 = s.toCharArray();
        char[] array2 = s1.toCharArray();
        int lngthS = s.length() - 1;
        int lngthS1 = s1.length() - 1;
        if (lngthS == lngthS1) {
            for (int a = 0; a < lngthS; a++) {
                if (array1[a] == array2[a]) continue;
                {
                    return false;
                }
            }
        }

        return true;
    }
}
