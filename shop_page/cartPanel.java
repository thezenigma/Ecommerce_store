package shop_page;

import java.awt.*;
import javax.swing.*;

public class cartPanel extends JPanel {
    Color bodyColor = new Color(234, 56, 87);
    JLabel testLabel;
    cartCard[] card = new cartCard[100];
    toCheckoutPanel checkout;
    int yOffset = 60;

    public cartPanel(toCheckoutPanel checkout) {
        this.checkout = checkout;
        this.setLayout(null);
        this.setBackground(new Color(255, 253, 249));

        // Header label
        testLabel = new JLabel("CART");
        testLabel.setBounds(130, 20, 100, 30);
        testLabel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 24));
        this.add(testLabel);
    }

    public void addProduct(String name, String price, String imageName) {
        // check if product already exists
        for (int i = 0; i < card.length; i++) {
            if (card[i] != null && card[i].getProductName().equals(name)) {
                card[i].increaseQuantity();
                calculateTotal();
                return;
            }
        }

        // otherwise create new
        for (int i = 0; i < card.length; i++) {
            if (card[i] == null) {
                card[i] = new cartCard(name, price, imageName);
                card[i].setCartPanel(this);
                card[i].setBounds(15, yOffset, 315, 150);
                this.add(card[i]);
                yOffset += 160;
                this.setPreferredSize(new Dimension(360, yOffset + 100));
                this.revalidate();
                this.repaint();
                calculateTotal();
                break;
            }
        }
    }

    public void deleteProduct(cartCard c) {
        for (int i = 0; i < card.length; i++) {
            if (card[i] == c) {
                this.remove(card[i]);
                card[i] = null;
                break;
            }
        }

        // reposition items
        int y = 60;
        for (int i = 0; i < card.length; i++) {
            if (card[i] != null) {
                card[i].setBounds(15, y, 315, 150);
                y += 160;
            }
        }
        yOffset = y;
        this.setPreferredSize(new Dimension(360, yOffset + 100));
        this.revalidate();
        this.repaint();
        calculateTotal();
    }

    public void calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < card.length; i++) {
            if (card[i] != null) {
                total += card[i].getTotal();
            }
        }
        if (checkout != null) {
            checkout.updateTotal(total);
        }
    }
}
