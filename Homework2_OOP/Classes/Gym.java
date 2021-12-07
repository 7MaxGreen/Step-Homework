import java.util.Scanner;

public class Gym{
    private String name;
    private String address;
    private short members;
    private Client client;

    public void setName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        this.name = sc.nextLine();
    }

    public void setAddress(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input address: ");
        this.address = sc.nextLine();
    }

    public void setMembers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input members number: ");
        this.members = sc.nextShort();
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