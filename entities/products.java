package entities;

public class products {
    private String productName;
    private String price;
    private String imageName;

    public products(String productName, String price, String imageName) {
        this.productName = productName;
        this.price = price;
        this.imageName = imageName;
    }

    public String getProductName() {
        return productName;
    }

    public String getPrice() {
        return price;
    }

    public String getImageName() {
        return imageName;
    }
}
