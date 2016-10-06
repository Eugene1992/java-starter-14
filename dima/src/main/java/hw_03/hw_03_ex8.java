package hw_03;

import java.util.Scanner;

/**
 * Created by dimon on 05.10.2016.
 */
public class hw_03_ex8 {
    public static void main(String[] args) {
        System.out.println("Введите предпочитаемое число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 0 & a <= 100) {
            if (a >= 0 & a <= 14) {
                System.out.println(a + " пренадлежит промежутку 0;14");
            } else if (a >= 15 & a <= 35) {
                System.out.println(a + " пренадлежит промежутку 15;35");
            } else if (a >= 36 & a <= 50) {
                System.out.println(a + " пренадлежит промежутку 36;50");
            } else if (a >= 50 & a <= 100) {
                System.out.println(a + " пренадлежит промежутку 50;100");
            }
        } else {
            System.out.println("Число не пренадлежит заданной области");
        }
    }
}