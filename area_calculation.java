public class area_calculation
{
    public static void main(String args[])
    {
        double height = 10;
        double width = 20;
        double depth = 30;

        double volume = height * width * depth;

        System.out.printf("Volume = %.2f\n", volume);
        System.out.printf("Height = %.2f, Width = %.2f, Depth = %.2f\n", height, width, depth);
    }
}