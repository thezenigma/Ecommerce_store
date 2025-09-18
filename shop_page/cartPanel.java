package shop_page;

import java.awt.*;

import javax.swing.*;

public class cartPanel extends JPanel {
    Color bodyColor = new Color(234, 56, 87);
    JLabel testLabel;
    public cartPanel() {
        this.setLayout(null);
        this.setBackground(Color.LIGHT_GRAY);
        testLabel = new JLabel("This is Cart!");
        testLabel.setBounds(20, 20, 100, 30);
        testLabel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 16));
        this.add(testLabel);
    }
}
