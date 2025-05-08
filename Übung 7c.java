class PostStation {
    public static void main(String[] args) {
        Package p1 = new Package();
        p1.setRecipient("Max Mustermann");
        p1.setWeight(2.0);
        p1.setIsSent(false);

        Package p2 = new Package();
        p2.setRecipient("Jane Doe");
        p2.setWeight(0.75);
        p2.setIsSent(true);

        p1.setIsSent(true);

        System.out.println("Price of Package 1: " + p1.getFinalPrice());
        System.out.println("Price of Package 2: " + p2.getFinalPrice());
    }
}