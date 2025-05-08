import java.util.Random;

class A3b {
    public static int myRandom () {
        Random rand = new Random();
        return rand.nextInt(1, 10001);
    }
}