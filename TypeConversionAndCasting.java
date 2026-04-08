import java.util.Scanner;

public class TypeConversionAndCasting
{
    public static void main(String args[])
    {
        byte a = 127;
        short b = 867;
        int c = 8989;
        long d = 7878;
        float e = 1.45f;
        double g = 0.345;

        System.out.println(a+" | "+b+" | "+c+" | "+d+" | "+e+" | "+g);

        a = (byte) b;   // narrowing
        System.out.println(a+" | "+b+" | "+c+" | "+d+" | "+e+" | "+g);

        b = a;          // widening
        System.out.println(a+" | "+b+" | "+c+" | "+d+" | "+e+" | "+g);

        e = (float) g;  // narrowing
        System.out.println(a+" | "+b+" | "+c+" | "+d+" | "+e+" | "+g);

        g = e;          // widening
        System.out.println(a+" | "+b+" | "+c+" | "+d+" | "+e+" | "+g);
    }
}