class A2d {
    public static void main(String[] args) {
        int charsTotalCounter = 0;
        for (int i = 0; i < args.length; i++) {
            int charCounter = 0;
            String arg = args[i];
            for (int j = 0; j < arg.length(); j++) {
                charCounter++;
                charsTotalCounter++;
            }
            System.out.println("Anzahl der Zeichen des Wortes " + args[i] + ": " + charCounter);
        }
        System.out.println("Durchschnittliche Anzahl der Zeichen: " + charsTotalCounter / args.length);
    }
}