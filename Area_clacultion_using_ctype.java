public class Area_clacultion_using_ctype{
    public static void main(String[] args) {

        double height = 10;
        double width = 20;
        double depth = 30;

        // Volume of cuboid
        double volume = height * width * depth;

        // Surface Area of cuboid
        double surfaceArea = 2 * (height * width + width * depth + height * depth);

        System.out.println("=== Cuboid Calculation ===");

        System.out.printf("Height: %.2f\n", height);
        System.out.printf("Width: %.2f\n", width);
        System.out.printf("Depth: %.2f\n", depth);

        System.out.printf("Volume: %.2f\n", volume);
        System.out.printf("Surface Area: %.2f\n", surfaceArea);
    }
}