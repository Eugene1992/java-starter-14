package hw_03;
import java.util.Scanner;
/**
 * Created by dimon on 05.10.2016.
 */
public class hw_03_ex3 {
    public static void main(String[] args) {
        int c = 10;
    Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        double u = Math.abs(c-a);
        double x = Math.abs(c-b);


    if(u == x) {
        System.out.println("Числа " + a + " и " + b + " равноудалены от " + c);
    }
        if (u>x){
            System.out.println("Число " + b + " ближе к "+ c);
        }if (u<x){System.out.println("Число " + a + " ближе к "+ c);

        }



    }
}
