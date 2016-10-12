package cw08;

public class StringInitTest {
    public static void main(String[] args) {
        String s1 = "Hello world!";             // literal style
        String s2 = new String("Hello world!"); // constructor style
        String s3 = getHelloWorld();            // method style
        String s4 = "Hello " + " world!";       // method style
        String s5 = "Hello " + getWorld();      // method style
        String s6 = "Hello " + true + 12 + new int[]{1, 2};
    }

    static String getHelloWorld() {
        return "Hello world!";
    }

    static String getWorld() {
        return "world!";
    }
}
