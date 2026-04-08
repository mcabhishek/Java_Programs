import java.util.Scanner;

public class data_types {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your SGPA: ");
        double SGPA = sc.nextDouble();

        System.out.print("Enter pass status (true/false): ");
        boolean status = sc.nextBoolean();

        System.out.print("Enter a long value: ");
        long longValue = sc.nextLong();

        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();

        System.out.print("Enter a short value: ");
        short shortValue = sc.nextShort();

        System.out.print("Enter a byte value: ");
        byte byteValue = sc.nextByte();

        System.out.print("Enter a character: ");
        char firstLetter = sc.next().charAt(0);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("SGPA: " + SGPA);
        System.out.println("Pass Status: " + status);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Byte Value: " + byteValue);
        System.out.println("First Letter: " + firstLetter);

        sc.close();
    }
}