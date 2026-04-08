import java.util.Scanner;

public class Classification_by_age {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        double age = sc.nextDouble();

        if (age >= 60) {
            System.out.println("You are a Senior");
        } else if (age >= 18) {
            System.out.println("You are an Adult");
        } else if (age >= 2) {
            System.out.println("You are a Kid");
        } else if (age >= 0) {
            System.out.println("You are a Baby");
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}