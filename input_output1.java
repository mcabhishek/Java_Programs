import java.util.Scanner;

public class input_output1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Scanner Program");

        System.out.print("Enter a value: ");
        int y = sc.nextInt();

        System.out.println("The value you entered is: " + y);

        sc.close();
    }
}