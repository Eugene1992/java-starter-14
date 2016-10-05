package hw_03;
import java.util.Scanner;
/**
 * Created by dimon on 05.10.2016.
 */
public class hw_03_ex6 {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                float a, b , c;

                float discr,sqrdiscr;

                float x1,x2;

                System.out.println("введите ax^2");

                a = (float) scan.nextInt();

                System.out.println("Введите bx");

                b = (float) scan.nextInt();

                System.out.println("Введите c");

                c = (float) scan.nextInt();

                discr = (float) b * b - (4 * a * c);

                if(discr < 0) System.out.println("x Є R");

                sqrdiscr = (float) Math.sqrt(discr);

                System.out.println("Дискрименант: "+ discr);

                x1 = (-b + sqrdiscr) / 2 * a;

                x2 = (-b - sqrdiscr) / 2 * a;

                System.out.println("x1: " + x1 + "\nx2: "+ x2);
            }
        }

