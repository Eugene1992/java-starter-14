package hw_07;

/**
 * Created by dimon on 11.10.2016.
 */
public class hw07Ex1 {
    public static void main(String[] args) {
        int array[] = {1, 51, 12, -12, 32, 9, 12, 44, 4, 7, 13};
        reverse(array);
        printFirstHalfOfArray(array);
    }

    static void evennums(int array[]) {
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }


    static void reverse(int array[]) {
        for (int b = array.length - 1; b >= 0; b--) {
            System.out.print(array[b] + " ");
        }
    }

    static void printFirstHalfOfArray(int array[]) {
        for (int i = 0; i < array.length / 2; i++) {
            System.out.println(array[i]);
        }
    }
}
