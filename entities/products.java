package entities;
import shop_page.*;

import javax.swing.*;

public class products {
    private String productName;
    private float price;
    private boolean isAvailable;
    private ImageIcon prodImg;

    public products() {
    }

    public products(String productName, float price, boolean isAvailable) {
        this.productName = productName;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setImage(String address) {
        prodImg = new ImageIcon(address);
    }

    public ImageIcon getImage() {
        return prodImg; 
    }
}
