package entities;

import javax.swing.*;

public class products {
    private String productName;
    private String price;
    private ImageIcon prodImg;

    public products() {
    }

    public products(String productName, String price, String imgfile) {
        this.productName = productName;
        this.price = price;
        prodImg = new ImageIcon(imgfile);
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }


    public void setImage(String address) {
        prodImg = new ImageIcon(address);
    }

    public ImageIcon getImage() {
        return prodImg; 
    }
}
