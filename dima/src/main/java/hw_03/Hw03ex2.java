package hw_03;

import java.util.Scanner;

/**
 * Created by dimon on 05.10.2016.
 */
public class Hw03ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }
}
