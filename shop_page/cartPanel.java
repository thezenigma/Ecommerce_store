package shop_page;

import java.awt.*;

import javax.swing.*;

public class cartPanel extends JPanel {
    Color bodyColor = new Color(234, 56, 87);
    JLabel testLabel;
    cartCard card;
    
    public cartPanel() {
        this.setLayout(null);
        this.setBackground(Color.LIGHT_GRAY);
        testLabel = new JLabel("CART");
        testLabel.setBounds(130, 20, 100, 30);
        testLabel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 24));
        this.add(testLabel);

        card = new cartCard();
        this.add(card);
    }
}
