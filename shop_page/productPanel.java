package shop_page;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class productPanel extends JPanel {
    Color buttonColor = new Color(23,54,255);
    Font bodyFontTitle = new Font("Arial", Font.BOLD, 16);
    Font price_button = new Font("Helvetica", Font.BOLD, 12);
    ImageIcon icon;
    JLabel imgLabel, name, price;
    JButton addButton;

    public productPanel(String filename, String productName, String priceTag) {
        icon = new ImageIcon(filename);
        imgLabel = new JLabel(icon);
        imgLabel.setBounds(40, 40, 170, 170);
        this.add(imgLabel);

        name = new JLabel(productName);
        name.setBounds(40, 220, 130, 20);
        name.setFont(bodyFontTitle);
        this.add(name);

        price = new JLabel(priceTag);
        price.setBounds(40, 240, 130, 20);
        price.setFont(price_button);
        this.add(price);

        addButton = new JButton("Add");
        addButton.setBounds(80, 280, 100, 30);
        addButton.setBackground(Color.BLUE);
        addButton.setForeground(Color.WHITE);
        addButton.setFocusPainted(false);
        addButton.setBorderPainted(false);
        addButton.setFont(price_button);
        this.add(addButton);
    }
}
