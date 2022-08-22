import java.util.Scanner;

public class DataTypeVariable {

    public static void main(String[] args) {

        /**
         * Variable Declaration
         * */

        int number= 10;

        String name="Brohan Uddin";

        /**
         * Pint on terminal
         * */

        System.out.println(number);
        System.out.print(number);

        /**
         * Input from user
         * */

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        String firstName=sc.next();

        String lastName= sc.next();

        String fullName= sc.nextLine();

    }

}
