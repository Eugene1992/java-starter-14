package hw_03;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by dimon on 05.10.2016.
 */
public class Hw03ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int a = sc.nextInt();
        System.out.println("Введите 2 число");
        int b = sc.nextInt();
        System.out.println("Введите 3 число");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " - Найбольшее число ");
            }
        } else if (b > c) {
            System.out.println(b + " - Найбольшее число ");
        } else {
            System.out.println(c + " - Найбольшее число ");
        }
    }
}
