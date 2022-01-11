public class Product {

    private String productName;
    private double productPrice;
    private String manufacturer;

    public static int counter=0;

    public Product(String productName, double productPrice, String manufacturer) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.manufacturer = manufacturer;
        counter++;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
