package hw_07;

/**
 * Created by dimon on 12.10.2016.
 */
public class hw07Ex {
    public static void main(String[] args) {
        int myArray[] = {3, 5, 7, 12};
        for (int i = 0; i < myArray.length; i++) {
            int i2 = i + 1;
            if (i2 >= myArray.length - 1) {
                i2 = 0;
            }
            int sum = myArray[i] + myArray[i2];
            System.out.println(sum);
        }
    }
}

