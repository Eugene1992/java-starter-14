package cw03;

/**
 * Created by evgeniy on 05/10/16.
 */
public class SwitchString {
    public static void main(String[] args) {
        String someString = "A";

        if (someString.equals("A")) {
            System.out.println(10);
        }

        if (someString.equals("B")) {
            System.out.println(11);
        }

        if (someString.equals("C")) {
            System.out.println(12);
        }

        switch (someString){
            case "A":
                System.out.println(10);
                break;

            case "B":
                System.out.println(10);
                break;

            case "C":
                System.out.println(10);
                break;
        }
    }
}
