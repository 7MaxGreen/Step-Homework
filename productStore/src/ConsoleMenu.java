public class ConsoleMenu {

    ProductManager pm = new ProductManager();

        public void adminMenu(){
        while(true){
            System.out.println("  \n\n\t\t ******** ADMIN MENU ********* ");
            System.out.println(" \t\t **                         ** ");
            System.out.println(" \t\t **   1. Product info       ** ");
            System.out.println(" \t\t **   2. Total price        ** ");
            System.out.println(" \t\t **   3. Exit               ** ");
            System.out.println(" \t\t **                         ** ");
            System.out.println(" \t\t *****************************");

            System.out.print("Choose an option: " );
            byte b = MyScanner.input.nextByte();

            switch (b){

                case 1 : pm.create(); pm.display(); break;
                case 2 : pm.sum(); break;
                case 3 : System.exit(0);

                default :
                    System.out.println("You've entered an incorrect option. Please try again!");
            }
        }
    }
}
