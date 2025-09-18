package shop_page;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class shopBody extends JPanel{
    Color bgColor = new Color(255, 229, 180);
    
    productPanel[][] productPanels;
    int widthAdd, heightAdd;
    // temporary
    String filename, productName, priceTag;

    public shopBody(String filename, String productName, String priceTag) {
        this.setPreferredSize(new Dimension(1030, 1200));
        this.setLayout(null);
        this.setBackground(bgColor);
        productPanels = new productPanel[3][3];
        for (int i = 0; i < 3; i++) {
            widthAdd = 0;
            for (int j = 0; j < 3; j++) {
                productPanels[i][j] = new productPanel(filename, productName, priceTag);
                productPanels[i][j].setLayout(null);
                productPanels[i][j].setBounds((80 + widthAdd), (30 + heightAdd), 250, 350);
        
                widthAdd += 300;

                this.add(productPanels[i][j]);
            }
            heightAdd += 370;
        }
        
    }

}
