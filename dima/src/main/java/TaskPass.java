import java.util.Scanner;
/**
 * Created by evgeniy on 07/10/16.
 */
public class TaskPass {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String password ="";
        System.out.print("Введите размер пароля: ");
        int a = sc.nextInt();

        for(int pass =0;pass < a;){
            int nums =(int) (Math.random()*74+48);
            if((nums >= 48 & nums <= 57) | (nums >= 65 & nums <= 90) | (nums >= 97 & nums <= 122) ){
                password += (char) nums;
                pass++;
            }
        }
        System.out.println(password);

    }
}
