import java.util.Scanner;

public class Circle_Dimension_Calculation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the diameter of circle: ");
        double diameter = sc.nextDouble();

        double radius = diameter / 2;
        System.out.println("Radius of circle: " + radius);

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle: " + area);

        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of circle: " + circumference);

        sc.close();
    }
}