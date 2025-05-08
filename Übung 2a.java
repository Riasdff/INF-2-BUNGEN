class A2a {
    public static void main(String[] args) {
        System.out.println("Anzahl der Kommandozeilenparameter: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + " " + args.length);
        }
    }
}