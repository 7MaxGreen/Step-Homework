public class ProductManager {

    private Product[] property = new Product[6];
    private ConsoleMenu menu = new ConsoleMenu();
    private int counter=0;

    public void create(){
    for(int i=0 ; i<property.length; i++){
         property[counter] = new Product("Loft", 230800.8, "Dansicons");
         property[counter] = new Product("Studio", 180800.5, "Oasis");
         property[counter] = new Product("Villa", 330677.7, "DreamHouse Residence");
         property[counter] = new Product("Duplex", 130677.7, "DreamHouse Residence");
         property[counter] = new Product("Triplex", 196899.7, "SkyHouse");
         counter ++;
       }
    }


    public void display(){
        System.out.println("Choose an option between 1-5 in order to display the property");
        byte b = MyScanner.input.nextByte();

        do{
            for(int i=0 ; i<counter ; i++){
                if(b==i){
                    System.out.println("Property name" + property[i].getProductName());
                    System.out.println("Property price" + property[i].getProductPrice());
                    System.out.println("Property manufact" + property[i].getManufacturer());
                } else {
                    System.out.println("Please choose a valid option");
                }
                menu.adminMenu();
            }
        }while(MyScanner.input.nextByte() != 1 || MyScanner.input.nextByte() != 2 || MyScanner.input.nextByte() != 3 || MyScanner.input.nextByte() != 4 || MyScanner.input.nextByte() != 5);
    }

    public void sum(){
        double sum=0;
        for (int i=0; i<counter; i++){
             sum = sum + property[i].getProductPrice();
            System.out.println("sum of all properties = " + sum);
        }
        menu.adminMenu();
    }

}
