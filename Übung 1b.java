import java.util.Random;

class A1b {
    public static void main(String[] args) {
        Random randNum = new Random();
        int num = randNum.nextInt(10, 101);
        for (int i = 2; i < (num / 2); i++) {
            if (num % i == 0) {
                System.out.println(num + " ist keine Primzahl.");
                System.exit(0);
            }
        }
        System.out.println(num + " ist eine Primzahl.");
    }
}