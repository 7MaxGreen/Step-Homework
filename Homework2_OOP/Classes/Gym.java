
public class Gym{
    private String name;
    private String address;
    private short members;
    private Client client;

    public void setName(){
        System.out.print("Input Gym name: ");
        this.name = Display.sc.nextLine();
    }

    public void setAddress(){
        System.out.println("Input Gym address: ");
        this.address = Display.sc.nextLine();
    }

    public void setMembers(){
        System.out.println("Input Gym members number: ");
        this.members = Display.sc.nextShort();
    }

    public void setClient(){

        this.client = new Client();
        this.client.setName();
        this.client.setSurname();
        this.client.setFrequencyOfVisit();
        this.client.setSubscription();
    }

    public Client getClient(){
        return this.client;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public short getMembers(){
        return this.members;
    }


    public void checkSize(){
    if(this.members >= 50 && this.members < 100) { System.out.println("This is a medium-small gym");}
    else if(this.members >= 100) {System.out.println("This is a large gym");}
    else {System.out.println("This is an enourmos gym");}
    
    }

    


}