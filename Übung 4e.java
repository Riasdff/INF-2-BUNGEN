class A4e {
    public static void main(String[] args) {
        int[] a = A4c.randomArray(10, -100, 100);
        A4b.printArray(a);
        System.out.println("Kleinster Wert in Array 'a': " + A4a.arrayMin(a));
        int[] b = a.clone();
        A4d.flipSign(b);
        A4b.printArray(b);
        System.out.println("Kleinster Wert in Array 'b': " + A4a.arrayMin(b));
    }
}