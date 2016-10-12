package hw_07;

/**
 * Created by dimon on 12.10.2016.
 */
public class hw07Ex7 {
    public static void main(String[] args) {
        int[] array = {12, 1, 5, 7, 13, -1, -5};
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
            if (min > array[i]) min = array[i];
        }
        System.out.println("Max: " + max);
        System.out.println("Min:" + min);
    }
}
