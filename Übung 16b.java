import java.util.Random;

class A16b {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(0, 256);
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));
        System.out.println("Octal: " + Integer.toOctalString(x));
        System.out.println("Hexadec: " + Integer.toHexString(x));
        System.out.println("signum method: " + Integer.signum(x));
        System.out.println("Amount of bits: " + Integer.toBinaryString(x).length());
        System.out.println("Amount of 1 bits: " + Integer.bitCount(x));
        System.out.print("2K-Darstellung: ");
        System.out.println(String.format("%8s", Integer.toBinaryString(x)).replace(' ', '0'));
    }
}