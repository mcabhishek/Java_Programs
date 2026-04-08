import java.util.Random;
class random_types
{
    public static void main(String args[])
    {
        Random r=new Random();
        char lower = (char)(r.nextInt(26)+'a');
        System.out.println(lower);

        char upper = (char)(r.nextInt(26)+'A');
        System.out.println(upper);

        int digit=r.nextInt(100);
        System.out.println(digit);
    }
}