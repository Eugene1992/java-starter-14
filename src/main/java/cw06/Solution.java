package cw06;

import java.util.Scanner;

/**
 * Created by evgeniy on 10/10/16.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getAverage());
    }

    static int getAverage() {
        Scanner scanner = new Scanner(System.in);
        String input;
        int sum = 0;
        int length = 0;
        while (true) {
            input = scanner.next();
            if (input.equals("stop")) break;
            sum += Integer.parseInt(input);
            length++;
        }
        return sum / length;
    }
}
