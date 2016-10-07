package cw05;

/**
 * Created by evgeniy on 07/10/16.
 */
public class ShiftsExample {
    public static void main(String[] args) {
        System.out.println(48 << 2); // == *2^n
//        0011 0000
//        1100 0000
        System.out.println(48 >> 2); // == /2^n
//        0011 0000
//        0000 1100
        byte b1 = (byte)(48 << 2);
        System.out.println(b1);
    }
}
