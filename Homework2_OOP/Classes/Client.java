
public class Client{
    private String name;
    private String surname;
    private Subscription subscriptionType;
    private short frequencyOfVisit;


    public void setName(){
        System.out.println("Input client name : ");
        this.name = Display.sc.nextLine();

    }

    public void setSurname(){
        System.out.println("Input client surname : ");
        this.surname = Display.sc.nextLine();
    }

    public void setFrequencyOfVisit(){
        System.out.println("Input frequency of visit : ");
        this.frequencyOfVisit = Display.sc.nextShort();
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

    public Subscription getSubscription(){
      return  this.subscriptionType;
    
    }

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
