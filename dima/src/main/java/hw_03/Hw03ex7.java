package hw_03;

import java.util.Scanner;

/**
 * Created by dimon on 05.10.2016.
 */
public class Hw03ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float d;
        System.out.println("Введите два числа и выберите действие:");
        System.out.println("Первое число: ");
        float a = sc.nextFloat();
        System.out.println("Второе число: ");
        float b = sc.nextFloat();
        System.out.println("Выберите действие:\n 1.+\n 2.-\n 3.*\n 4./\n :");
        String c = sc.next();
        switch (c) {
            case "+":
                d = a + b;
                System.out.println("Ответ: " + d);
                break;
            case "-":
                d = a - b;
                System.out.println("Ответ: " + d);
                break;
            case "*":
                d = a * b;
                System.out.println("Ответ: " + d);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Делить на ноль нельзя");
                } else {
                    d = a / b;
                    System.out.println("Ответ: " + d);
                }
                break;
            default:
                System.out.println("Неверный пункт");
        }
    }
}
