package hw_06;

/**
 * Created by dimon on 10.10.2016.
 */
public class Hw6 {
    public static void main(String[] args) {

        System.out.println(fib(5));

    }

    static void fortoplus3(int a, int b) {
        for (; a < b; a += 3) {
            System.out.println(a + "  ");
        }
    }

    static void fortoplus2(int a, int b) {
        for (; a < b; a += 2) {
            System.out.println(a + "  ");
        }

    }

    static void forto55(int i) {
        for (; i >= 0; i -= 5) {
            System.out.println(i + " ");
        }
    }

    static void geometprogres() {
        for (int a = 0, b = 2; a < 20; a++, b *= 2) {
            System.out.println(b);
        }
    }

    static int chettodelayet(int a, int b, int c, int d) {
        int sum = 0;
        for (; c < d; c++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
        }
        return sum;
    }

    static void transformation(int a, int choice) {
        int result = 0;
        if (choice == 1) {
            for (; a > 0; a /= 2) {
                result = a % 2 + result;
                System.out.print(result);
            }
        } else if (choice == 2) {
            for (; a > 0; a /= 8) {
                if (a % 8 <= 7 & a % 8 >= 0)
                    result = a % 8 + result;
                System.out.print(result);
            }
        }
    }

    static void deliteli(int a) {
        for (int i = 1; i <= a; i++) {
            if ((a % i) == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //Зона Зла(Рекурсия) . Х3 работает или нет
    static int fib(int n) {
        System.out.print(n + " ");
        if (n < 2) return n;
        return fib(n - 1) + fib(n - 2);
    }
}

