package cw02;

public class Test {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
//        boolean b3 = 12;

        char c1 = 10; // 0 ... 65536
        char c2 = 'g';
        char c3 = '1';
        char c4 = '\u2345';

        byte bb1 = 127; // 1 byte

        short s1 = 32767; // 2 bytes

        int i1 = 2_000_000_000; // 4 bytes

        long l1 = 9_000_000_000_000_000_000L; // 8 bytes

        float f1 = 1000.00F; // 4 bytes

        double d1 = 1000.00; // 8 bytes

        int i2 = 20;
        int i3 = 10;

        System.out.println(i2 + i3);
        System.out.println(i2 - i3);
        System.out.println(i2 / i3);
        System.out.println(i2 * i3);

        System.out.println(15 % 4);

        i3 = 1000;

        i3 = i3 + 30;
    }
}
