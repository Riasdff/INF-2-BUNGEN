import java.util.Random;

class A16a {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(0, 256);
        char randCharacter = (char) randomNum;
        boolean isMathSymbol = false;
        System.out.println("Character Name: " + Character.getName(randomNum));
        System.out.println("Character Symbol: " + randCharacter);
        System.out.println("Character Type: " + Character.getType((char) randomNum));
        if(Character.getType((char) randomNum) == Character.MATH_SYMBOL) {
            isMathSymbol = true;
            System.out.println("| " + randCharacter + " | " + "is a Math Symbol");
        }
        else {
            System.out.println("| " + randCharacter + " | " + "is not a Math Symbol");
        }
    }
}