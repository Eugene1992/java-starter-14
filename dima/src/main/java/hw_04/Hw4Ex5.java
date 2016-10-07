package hw_04;

/**
 * Created by dimon on 06.10.2016.
 */
public class Hw4Ex5 {
    public static void main(String[] args) {
        int a = 1, b = 1, sum;

        for (int c = 0; c < 20; c++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
        }
    }
}
