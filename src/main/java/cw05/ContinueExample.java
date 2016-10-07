package cw05;

/**
 * Created by evgeniy on 07/10/16.
 */
public class ContinueExample {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 7) continue;
            System.out.println(i);
        }
    }
}
