package cw07;

public class ArrayExample {
    public static void main(String args[]) {
        byte[] array1 = new byte[3]; // Java style
        byte array2[] = new byte[3]; // C    style

        byte[] array3 = new byte[3];
        array3[0] = 10;
        array3[1] = 20;
        array3[2] = 30;
        System.out.println(array3[2]);

        byte[] array4 = new byte[]{1, 2, 3, 4, 5};
        System.out.println(array4.length);



        byte[][][][][] arr = new byte[2][2][2][2][2];

        byte[] array5 = {1, 2, 3, 4, 5};

        for (int i = 0; i < array5.length; i++) {
            System.out.println(array5[i]);
        }

        for (byte b : array5) {
            System.out.println(b);
        }

        byte[][] array6 = {
            {0, 0, 0, 0, 0},
            {0, 0, 0},
            {0, 0, 0, 0}
        };

        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                System.out.print(array6[i][j] + " ");
            }
            System.out.println();
        }
    }
}
