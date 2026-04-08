import java.util.Random;

public class Random_no1 {
    public static void main(String[] args) {

        int min = 10;
        int max = 50;

        Random r = new Random();
        int number = r.nextInt(max - min + 1) + min;

        System.out.println("Random number between " + min + " and " + max + " is: " + number);
    }
}