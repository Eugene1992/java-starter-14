package cw04;

/**
 * Created by evgeniy on 06/10/16.
 */
public class WhileExample {
    public static void main(String[] args) {
        int counter = 10;
        boolean b = false;

        while (counter > 10) {
            System.out.println(counter);
            counter -= 1;
        }
    }
}
