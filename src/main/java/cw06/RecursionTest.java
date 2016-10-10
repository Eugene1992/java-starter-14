package cw06;

/**
 * Created by evgeniy on 10/10/16.
 */
public class RecursionTest {
    public static void main(String[] args) {
        long num = 10;

        long start = System.nanoTime();
        System.out.println(faci(num));
        long end = System.nanoTime();
        System.out.println("Iterable: " + (end - start));


        long start2 = System.nanoTime();
        System.out.println(facr(num));
        long end2 = System.nanoTime();
        System.out.println("Recursive: " + (end2 - start2));
    }

    static long faci(long num) {
        long sum = 1;
        for (long i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }

    static long facr(long num) {
        if (num == 1) {
            return 1;
        }
        return facr(num - 1) * num;
    }

    static void f(){
        f();
    }
}
