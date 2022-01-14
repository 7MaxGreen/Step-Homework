public class ProductManager {

    private Product[] property = new Product[6];

    public void create(){
         property[1] = new Product("Loft", 230800.8, "Dansicons");
         property[2] = new Product("Studio", 180800.5, "Oasis");
         property[3] = new Product("Villa", 330677.7, "DreamHouse Residence");
         property[4] = new Product("Duplex", 130677.7, "DreamHouse Residence");
         property[5] = new Product("Triplex", 196899.7, "SkyHouse");
    }

    public void display() {
        System.out.println("Choose the property number you want to display");

        while (true) {
                int userInput = MyScanner.input.nextInt();

                if (userInput > 0 && userInput < 6) {
                    System.out.println("Property name: " + property[userInput].getProductName());
                    System.out.println("Property price: " + property[userInput].getProductPrice());
                    System.out.println("Property manufacturer: " + property[userInput].getManufacturer());
                    System.out.println();
                    break;
                } else {
                    System.out.println("Invalid option, choose a number between 1-5");
                }
        }
    }

    public void sum(){
        double sum=0;
        for (int i=1; i<Product.counter; i++){
             sum = sum + property[i].getProductPrice();
        }
        System.out.println("Sum of all properties = " + sum);
    }
}
