package hw_04;
import java.util.Scanner;
/**
 * Created by dimon on 06.10.2016.
 */
public class Hw4Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int count = 0;
        System.out.print("Вводите ваше натуральное число - ");
        Scanner sr = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Число " + n + " делится на - " );
        for(int i = 1; i <= n; i++){
            if ((n % i) == 0){
                System.out.print(i + " ");
            }
        }

    }
}
