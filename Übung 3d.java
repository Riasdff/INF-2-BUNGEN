class A3d {
    public static void main(String[] args) {
        int rand = A3b.myRandom();
        if (A3c.isPrime(rand)) {
            System.out.println("Prime number: " + rand);
            System.exit(0);
        }
        else {
            System.out.println("next square number: " + A3a.nextSquareNumber(rand));
            System.exit(0);
        }
    }
}