/**
 * Created by evgeniy on 07/10/16.
 */

import java.util.Scanner;

public class TaskRand {
    public static void main(String[] args) {
        int rand = (int) (Math.random() * 5); // целое число из [0;4]
        Scanner sc = new Scanner(System.in);
        int w;
        int count = 0;
        int a = (int) (Math.random() * 10);
        System.out.println("Угадайте число: ");
        do {
            count++;
            w = sc.nextInt();
            if (w == a) {
                System.out.println("Поздравляем вы выиграли,всего сделано попыток: " + count);
                break;
            }
        } while (w < 10);

    }
}
