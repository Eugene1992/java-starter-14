package cw06;

/**
 * Created by evgeniy on 10/10/16.
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!");
        }


        for (int i = 0; i < 100; i++) {
            System.out.println("Another message.");
        }

        printNumber(getSum(getSum(2, 6), 7));
        getSum(2, 6);
//        System.out.println(printNumber(2));

    }

    static int getSum(int first, int second) {
        int sum = first + second;
//        return sum;
        return first + second;
    }

    static void printNumber(int num) {
        System.out.println(num);
    }
}
