import java.util.Random;

class A4c {
    public static int[] randomArray(int arrayLen, int min, int max) {
        int[] newArray = new int[arrayLen];
        Random rand = new Random();
        for (int i = 0; i < arrayLen; i++) {
            newArray[i] = rand.nextInt(max - min) + min;
        }
        return newArray;
    }
}