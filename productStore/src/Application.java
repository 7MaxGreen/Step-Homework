public class Application {

    public static void main(String[] args) {

        ProductManager pm = new ProductManager();

        pm.create();

        ConsoleMenu.adminMenu(pm);
    }
}
