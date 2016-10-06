package cw04;

/**
 * Created by evgeniy on 06/10/16.
 */
public class SolutionLoop {
    public static void main(String[] args) {
        int k = 2346;

        String result = "";
        for (;k > 0; k /= 2) {
            result = k % 2 + result;
        }
        System.out.println(result);
    }
}
