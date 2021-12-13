public class Company{
    private String name;
    private String address;
    private String fieldOfActivity;
    private String phoneNumber;
    private String email;
    private String cin;
    private int financialStartUp;

    public Company(String name, String address, String fieldOfActivity, String phoneNumber, String email, String cin){
        this.name = name;
        this.address = address;
        this.fieldOfActivity = fieldOfActivity;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.cin = cin;

        if(fieldOfActivity.equals("financial")) {
            this.financialStartUp = 100; 
            }
        else if(fieldOfActivity.equals("construction")) {
            this.financialStartUp = 150; 
            }
        else if(fieldOfActivity.equals("health & beverage")) {
            this.financialStartUp = 200; 
            }
        else if(fieldOfActivity.equals("IT")) {
            this.financialStartUp = 250; 
            }
        else if(fieldOfActivity.equals("sales")) {
            this.financialStartUp = 170; 
            }
        else if(fieldOfActivity.equals("manufacturing")) {
            this.financialStartUp = 75; 
        } else { 
            System.out.println("Choose from the given categories: financial, construction, health & beverage, IT, sales, manufacturing");
        }
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public String getFieldOfActivity(){
        return this.fieldOfActivity;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getEmail(){
        return this.email;
    }

    public String getCin(){
        return this.cin;
    }

    public int getFinancialStartUp(){
        return this.financialStartUp;
    }


    public void checkIDNO(){
        if(cin == null || cin.length() != 20) {
            System.out.println("Input a correct CIN number, it must contain 20 characters");
        } 
        if( cin.substring(18, cin.length()).equals("US")) {
            System.out.println("Company is registered in USA");
            }
        else {
            System.out.println("Company is registered abroad US");
        }
    }
    


}