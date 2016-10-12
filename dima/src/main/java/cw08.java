/**
 * Created by dimon on 12.10.2016.
 */
public class cw08 {
    public static void main(String[] args) {
        System.out.println(compare("Halo", "Text"));

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
