import java.util.Random;

class A1c {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand1 = rand.nextInt(20, 61);
        int rand2 = rand.nextInt(20, 61);

        int kgV = Math.max(rand1, rand2);
        while (kgV % rand1 != 0 || kgV % rand2 != 0) {
            kgV++;
        }
        System.out.println("Der kgV von " + rand1 + " und " + rand2 + " ist " + kgV);
    }
}