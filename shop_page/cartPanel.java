package shop_page;

import java.awt.*;

import javax.swing.*;

public class cartPanel extends JPanel {
    Color bodyColor = new Color(234, 56, 87);
    JLabel testLabel;
    cartCard card;
    String prdName, prdPrice;
    ImageIcon prdImage;
    
    public cartPanel() {
        this.setLayout(null);
        this.setBackground(new Color(255, 253, 249));
        testLabel = new JLabel("CART");
        testLabel.setBounds(130, 20, 100, 30);
        testLabel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 24));
        this.add(testLabel);

        card = new cartCard();
        this.add(card);
    }
}
