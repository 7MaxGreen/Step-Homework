import java.util.Scanner;

public class Client{
    private String name;
    private String surname;
    private Subscription subscriptionType;
    private short frequencyOfVisit;


    public void setName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your name : ");
        this.name = sc.nextLine();
    }

    public void setSurname(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your surname : ");
        this.surname = sc.nextLine();
    }

    public void setFrequencyOfVisit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input frequency of visit : ");
        this.frequencyOfVisit = sc.nextShort();
    }

    public void setSubscription(){
        this.subscriptionType = new Subscription();
        this.subscriptionType.setSubscriptionType();
        this.subscriptionType.setPeriod();
        this.subscriptionType.setPrice();
        this.subscriptionType.setDiscount();
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public short getFrequencyOfVisit(){
        return this.frequencyOfVisit;
    }

    // public Subscription getSubscription(){
    //     this.subscriptionType.getSubscriptionType();
    //     this.subscriptionType.getPeriod();
    //     this.subscriptionType.getPrice();
    //     this.subscriptionType.getDiscount();
    // }

    public void checkMastery(){
        if (this.frequencyOfVisit < 300) {
            System.out.println("Begginer - Good work, keep doing the great job.");
            }
        else if (this.frequencyOfVisit >= 300 && this.frequencyOfVisit <= 900) {
            System.out.println("You look awesome, always an example to newcomers");
            }
        else if(this.frequencyOfVisit>900){
            System.out.println("Bulky and healthy, you got the high standards!");
            }
    }
}