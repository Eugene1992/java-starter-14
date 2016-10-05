package cw03;

/**
 * Created by evgeniy on 05/10/16.
 */
public class Test2 {
    public static void main(String[] args) {
        short s = 258;
        byte b = (byte)s;
        System.out.println(b);
//        0000 0001 0000 0010
//                  0000 0010
//        -------------------
//                  0000 0010
    }
}
