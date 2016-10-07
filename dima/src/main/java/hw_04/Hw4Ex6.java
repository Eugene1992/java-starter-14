package hw_04;

import java.util.Scanner;

/**
 * Created by dimon on 06.10.2016.
 */
public class Hw4Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int a = sc.nextInt();
        String result = "";
        System.out.println(result);
        System.out.println("перевести число в: ");
        System.out.println("1) 2-ую\n" +
                "2) 8-ую\n" +
                "3) 16-ую");

        int b = sc.nextInt();

        switch (b) {
            case 1:
                for (; a > 0; a /= 2) {
                    result = a % 2 + result;
                }
                System.out.println(result);break;
            case 2:for(; a > 0; a /= 8){
                if(a %8 <= 7 & a %8 >=0)
                    result = result +  (a % 8);
            }
                System.out.println(result);break;

            }
        }
    }

