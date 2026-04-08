import java.util.Scanner;

public class TernaryOperator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        String pass_or_fail = (marks >= 50) ? "Pass" : "Fail";

        System.out.println("Result: " + pass_or_fail);

        sc.close();
    }
}