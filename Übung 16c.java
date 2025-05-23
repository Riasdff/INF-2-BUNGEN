import java.util.Random;

class A16c {
    public static void main(String[] args) {
        double a = Math.random();
        Random rand = new Random();
        int e = rand.nextInt(0, 100);
        double x = a * Math.pow(10, e);
        if(Double.isFinite(1/x)) {
            System.out.println("1/x is finite");
        }
        else {
            System.out.println("1/x is not finite");
        }
        Double d = Double.MIN_VALUE;
        System.out.println(d);
        Double f = 1/d;
        System.out.println(f);
        int ff = (int) f.intValue();
        System.out.println(ff);
    }
}