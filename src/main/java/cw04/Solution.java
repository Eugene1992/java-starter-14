package cw04;

import java.util.Scanner;

/**
 * Created by evgeniy on 06/10/16.
 */
public class Solution {
    public static void main(String[] args) {
        int a, a0, a1, a2, a3, a4, a5, a6, a7;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        a = scan.nextInt();
        a7 = a > 0 ? 0 : 1;
        a6 = a % 2;
        a /= 2;
        a5 = a % 2;
        a /= 2;
        a4 = a % 2;
        a /= 2;
        a3 = a % 2;
        a /= 2;
        a2 = a % 2;
        a /= 2;
        a1 = a % 2;
        a /= 2;
        a0 = a % 2;
        System.out.printf("%d%d%d%d %d%d%d%d", a7, a6, a5, a4 ,a3, a2, a1, a0);
    }
}
