class A4d {
    public static int[] flipSign(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = - array[i];
            newArray[i] = array[i];
        }
        return newArray;
    }
}