package cw04;

/**
 * Created by evgeniy on 06/10/16.
 */
public class InnerLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
                System.out.println(i);
            }
            System.out.println();
        }
    }
}
