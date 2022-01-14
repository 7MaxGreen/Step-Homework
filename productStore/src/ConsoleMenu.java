public class ConsoleMenu {

        public static void adminMenu(ProductManager productManager){
        while(true){
            System.out.println("  \n\n\t\t ******** ADMIN MENU ********* ");
            System.out.println(" \t\t **                         ** ");
            System.out.println(" \t\t **   1. Product info       ** ");
            System.out.println(" \t\t **   2. Total price        ** ");
            System.out.println(" \t\t **   3. Exit               ** ");
            System.out.println(" \t\t **                         ** ");
            System.out.println(" \t\t *****************************");

            System.out.print("Choose an option: " );

            switch (MyScanner.input.nextByte()){

                case 1 : productManager.display(); break;
                case 2 : productManager.sum(); break;
                case 3 : System.exit(0);

                default :
                    System.out.println("You've entered an incorrect option. Please try again!");
            }
        }
    }
}
