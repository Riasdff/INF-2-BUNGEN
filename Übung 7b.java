class Package {

    String recipient;
    boolean isSent;
    double packWeight;
    double basePrice = 1.5;
    double finalPrice;

    public static void main(String[] args) {

    }

    public void setRecipient(String name) {
        this.recipient = name;
    }
    public String getRecipient() {
        return this.recipient;
    }
    public void setWeight(double weight) {
        this.packWeight = weight;
    }
    public double getWeight() {
        return this.packWeight;
    }
    public void setIsSent(boolean status) {
        this.isSent = status;
    }
    public boolean getIsSent() {
        return this.isSent;
    }
    public double getBasePrice() {
        return this.basePrice;
    }

    public void setBasePrice() {
        if (this.packWeight < 0.5) {
            this.finalPrice = getBasePrice();
        }
        else if (this.packWeight >= 0.5 && this.packWeight <= 1.0) {
            this.finalPrice = getBasePrice() * 2;
        }
        else {
            this.finalPrice = getBasePrice() * 5;
        }
    }
    public double getFinalPrice() {
        setBasePrice();
        return this.finalPrice;
    }
}