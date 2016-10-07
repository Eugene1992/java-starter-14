package cw05;

/**
 * Created by evgeniy on 07/10/16.
 */
public class NOTExample {
    public static void main(String[] args) {
        boolean flag = false;
        int k = 0;

        while (!flag) {
            if (k == 5) flag = true;
            k++;
            System.out.println(k);
        }
    }
}
