class A3a {
    public static int nextSquareNumber(int n) {
        int sqrt = (int) Math.sqrt(n);
        sqrt++;
        return sqrt * sqrt;
    }
}