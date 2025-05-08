class A2c {
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 0; i < args.length; i++){
            String arg = args[i];
            for (int j = 0; j < arg.length(); j++){
                char ch = arg.charAt(j);
                if(ch == 'a' || ch == 'A'){
                    counter++;
                }
            }
        }
        System.out.println("Anzahl an 'A' und 'a': " + counter);
    }
}