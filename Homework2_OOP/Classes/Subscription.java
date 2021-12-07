import java.util.Scanner;

public class Subscription{
    private String subscriptionType;
    private String period;
    private float price;
    private byte discount;

    public void setSubscriptionType(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the subscription type: ");
        this.subscriptionType = sc.nextLine();
    }

    public void setPeriod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the period: ");
        this.period = sc.nextLine();
    }

    public void setPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the price: ");
        this.price = sc.nextFloat();
    }

    public void setDiscount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the discount: ");
        this.discount = sc.nextByte();
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