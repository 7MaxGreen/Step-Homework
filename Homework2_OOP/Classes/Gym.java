import java.util.Scanner;

public class Gym{
    private String name;
    private String address;
    private short members;
    
    private Client client;

    public void setName(){
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
    }

    public void setAddress(){
        Scanner sc = new Scanner(System.in);
        this.address = sc.nextLine();
    }

    public void setMembers(){
        Scanner sc = new Scanner(System.in);
        this.members = sc.nextShort();
    }

    public void checkSize(short members){
    if(members >= 50 && members < 100) { System.out.println("This is a medium-small gym");}
    else if(members >= 100) {System.out.println("This is a large gym");}
    else {System.out.println("This is an enourmos gym");}
    
    }

    


}