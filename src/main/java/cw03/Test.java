package cw03;

/**
 * Created by evgeniy on 05/10/16.
 */
public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.print("a = " + a);
        System.out.println(" b = " + b);

        a = a * b; // a = 200
        b = a / b; // b = 10
        a = a / b; // a = 20
        System.out.print("a = " + a);
        System.out.println(" b = " + b);
    }
}
