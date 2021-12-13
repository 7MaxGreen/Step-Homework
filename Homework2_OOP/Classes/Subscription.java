public class Subscription{
    private String subscriptionType;
    private String period;
    private float price;
    private byte discount;

    public void setSubscriptionType(){
        System.out.println("Input the subscription type: ");
        this.subscriptionType = Display.sc.nextLine();
    }

    public void setPeriod(){
        System.out.println("Input the subscription period: ");
        this.period = Display.sc.nextLine();
    }

    public void setPrice(){
        System.out.println("Input the subscription price: ");
        this.price = Display.sc.nextFloat();
    }

    public void setDiscount(){
        System.out.println("Input the subscription discount: ");
        this.discount = Display.sc.nextByte();
    }

    public String getSubscriptionType(){
        return this.subscriptionType;
    }

    public String getPeriod(){
        return this.period;
    }

    public float getPrice(){
        return this.price;
    }

    public byte getDiscount(){
        return this.discount;
    }

}