package hw_07;

/**
 * Created by dimon on 11.10.2016.
 */
public class hw07Ex1 {
    public static void main(String[] args) {
        int array[] = {1, 51, 12, -12, 32, 9, 12, 44, 4, 7, 13};
        reverse(array);
        Ex(array);
    }

    static void evennums(int array[]) {
        for (int num1 : array) {
            if (num1 % 2 == 0)
                System.out.println(num1);
        }
    }

    static void reverse(int array[]) {
        int b = array.length - 1;
/*        for (int num : array) {*/
        for (; b >= 0; b--) {
            for (int num : array) {


                System.out.print(num + " ");
            }
        }
    }
    static void Ex(int array[]){
        for(;array[0]>(array.length/2);array[0]++){
            for (int d : array)
            System.out.println(array);
        }


    }

}
