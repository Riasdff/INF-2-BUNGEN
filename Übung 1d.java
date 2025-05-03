import java.util.Locale;

class A1d {
    public static void main(String[] args) {
        String text = "Java Programmierung";
        String res = text.replaceAll("\\s", "");
        String finalRes = res.toLowerCase();
        System.out.println(finalRes + finalRes + finalRes + finalRes + finalRes);
    }
}