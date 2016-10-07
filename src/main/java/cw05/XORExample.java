package cw05;

/**
 * Created by evgeniy on 07/10/16.
 */
public class XORExample {
    public static void main(String[] args) {
        System.out.println(true ^ true);
        System.out.println(false ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);
        System.out.println(10 ^ 4);
//        0000 1010
//       ^
//        0000 0100
//        ---------
//        0000 1110

        int x = 5, y = 7;
        System.out.printf("x = %d, y = %d\n", x, y);

        x = x ^ y; // x == 2
        y = x ^ y; // y == 5
        x = x ^ y; // x == 7
        System.out.printf("x = %d, y = %d", x, y);

    }
}
