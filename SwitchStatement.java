import java.util.Scanner;

public class SwitchStatement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        String day = sc.nextLine();

        String day1 = day.toLowerCase();

        switch (day1)
        {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("It's a weekday");
                break;

            case "saturday":
            case "sunday":
                System.out.println("It's weekend");
                break;

            default:
                System.out.println("Invalid day");
        }

        sc.close();
    }
}