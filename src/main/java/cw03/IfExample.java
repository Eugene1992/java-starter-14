package cw03;

/**
 * Created by evgeniy on 05/10/16.
 */
public class IfExample {
    public static void main(String[] args) {
        int a = 21;
        int b = 10;
        boolean c = true;

        if (a > b) { // > < == != >= <=
            if (a == 20) {
                System.out.println("a == 20");
            }
            System.out.println("a > b");
        }

        if (a < b) { // > < == != >= <=
            System.out.println("a < b");
        }
    }
}
