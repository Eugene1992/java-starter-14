package cw08;

public class StringMethodsTest {
    public static void main(String[] args) {
        String str = "Hello world!";

        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }

        byte[] bytes = str.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

        System.out.println("String length - " + str.length());

        String str2 = "Hello world!!!";
        System.out.println(str.equals(str));
        System.out.println(str.equals(str2));

        String a = "Abba";
        String b = "Black Sabbath";
        String c = "ABBA";
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo(a));

        System.out.println(a.compareToIgnoreCase(c));

        System.out.println(str.replace('H', 'h'));

        System.out.println(str.indexOf('l'));
        System.out.println(str.indexOf('l', 5));
        System.out.println(str.indexOf("world"));
        System.out.println(str.indexOf("world", 7));

        System.out.println(str.concat("*"));

        System.out.println(str.contains("world!"));
        System.out.println(str.contains("key"));

        System.out.println(str.endsWith("!"));

        System.out.println(str.startsWith("Hel"));
        System.out.println(str.startsWith("Hel", 2));

        String emptyString = "";
        System.out.println(str.isEmpty());
        System.out.println(emptyString.isEmpty());

        System.out.println(str.lastIndexOf('l'));
        System.out.println(str.lastIndexOf('l', 2));
        System.out.println(str.lastIndexOf("ll"));
        System.out.println(str.lastIndexOf("ll", 2));

        String forRegExp = "My name is Eugene! I'm from Ukraine.";
        String[] subStrings = forRegExp.split(" ");
        for (String subString : subStrings) {
            System.out.println(subString);
        }

        String email = "deyneko55@gmail.com";
        System.out.println(email.matches("^[a-z0-9]@ + (\\.[a-z]{2,})$"));

        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 5));

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
