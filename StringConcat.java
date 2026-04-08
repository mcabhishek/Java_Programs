public class StringConcat {
    public static void main(String[] args) {
        String first = "Hello";
        String second = "World";

        // Concatenation using +
        String result = first + " " + second;
        System.out.println("Using + operator: " + result);

        // Concatenation using concat() method
        String result2 = first.concat(" ").concat(second);
        System.out.println("Using concat() method: " + result2);
    }
}