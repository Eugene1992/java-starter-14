package cw05;

/**
 * Created by evgeniy on 07/10/16.
 */
public class Test {
    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 10; i++) {
            inner:
            for (int j = 0; j < 10; j++) {
                if (j == 5) break inner;
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
