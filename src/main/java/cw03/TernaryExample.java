package cw03;

/**
 * Created by evgeniy on 05/10/16.
 */
public class TernaryExample {
    public static void main(String[] args) {
        // condition ? true : false;
        int a = 10;
        int b = a > 5 ? 100 : 1000;

        /*if (a > 5) {
            b = 100;
        } else {
            b = 1000;
        }*/

        System.out.println(b);
    }
}
