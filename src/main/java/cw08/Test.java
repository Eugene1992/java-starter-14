package cw08;

public class Test {
    public static void main(String[] args) {
        int n = 123402;
        int sum = 0;
        while (n != 0) {
            sum = sum + (n % 10);
            n /= 10;
        }
        System.out.println(sum);
    }
}
