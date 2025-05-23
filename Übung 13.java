import java.util.Arrays;

class A13 {
    static double normalized(double min, double max, double value) {
        if(value <= min){
            return 0;
        }
        else if(value >= max){
            return 1;
        }
        else{
            return (value - min) / (max - min);
        }
    }
    static double[] normalized(double min, double max, double... values) {
        double[] result = new double[values.length];
        for(int i = 0; i < values.length; i++){
            result[i] = normalized(min, max, values[i]);
        }
        return result;
    }
    static void testNormalized(double min, double max, double... values) {
        System.out.println("Result = " + Arrays.toString(normalized(min, max, values)));
    }
    static double denormalized(double min, double max, double normalizedValue) {
        if (normalizedValue < 0.0) {
            normalizedValue = 0;
        }
        else if (normalizedValue > 1.0) {
            normalizedValue = 1.0;
        }
        return min + (max - min) * normalizedValue;
    }
    static boolean isNormalized(double... values) {
        for(int i = 0; i < values.length; i++){
            if(values[i] < 0.0 || values[i] > 1.0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        testNormalized(0.0, 100.0, -1.0, 0.0, 1.0, 10.0, 50.0, 100.0, 101.0);
        testNormalized(-5.0, 50.0, -1.0, 0.0, 1.0, 10.0, 49.0, 50.0, 100.0);
        testNormalized(10.0, 20.0, 9.0, 21.0);
    }
}