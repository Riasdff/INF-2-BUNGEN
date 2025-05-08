class A4a {
    public static int arrayMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}