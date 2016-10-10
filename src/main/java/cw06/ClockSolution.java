package cw06;

/**
 * Created by evgeniy on 10/10/16.
 */
public class ClockSolution {
    public static void main(String[] args) {
//      h1h2:m1m2
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                int h1 = h > 9 ? h / 10 : 0;
                int h2 = h > 9 ? h % 10 : h;
                int m1 = m > 9 ? m / 10 : 0;
                int m2 = m > 9 ? m % 10 : m;
                if (h1 == m2 & h2 == m1) {
                    System.out.printf("%d%d:%d%d\n", h1, h2, m1, m2);
                }
            }
        }
    }
}
