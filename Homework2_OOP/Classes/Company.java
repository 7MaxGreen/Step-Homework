public class Company{
    public String name;
    public String address;
   // public String[] fieldOfActivity = {"financial", "construction", "health & beverage", "IT", "sales", "manufacturing"};
    public String phoneNumber;
    public String email;
    public String CIN;

    public Company(String name, String address, String phoneNumber, String email, String CIN){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.CIN = CIN;
    }

    public void checkIDNO(String CIN){
        if(CIN == null || CIN.length() != 20) {
            System.out.println("Input a correct CIN number, it must contain 20 characters");
        } 
        if( CIN.substring(18, CIN.length()) == "US") {
            System.out.println("Company was registered in USA");
            }
        else {
            System.out.println("Company was registered abroad US");
        }
    }
    


}