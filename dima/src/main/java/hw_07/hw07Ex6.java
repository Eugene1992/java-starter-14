package hw_07;

/**
 * Created by dimon on 12.10.2016.
 */
public class hw07Ex6 {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 12, -18, -54, 84, -35, 17, 37};

        double average = 0;
        if (numbers.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
            }
            average = sum / numbers.length;
            System.out.println(average);
        }
    }
}
