package login_page;

import java.awt.CardLayout;

import javax.swing.*;
import java.awt.*;

public class loginPage extends JPanel {
    ImageBanner imageBanner;
    loginPanel loginPanel;
    public loginPage(CardLayout card, JPanel pageHolder) {
        this.setLayout(null);
        this.setBounds(0, 0, 1280, 720);
        this.setBackground(new Color(255, 228, 225));
        
        loginPanel = new loginPanel(card, pageHolder);
        imageBanner = new ImageBanner();

        this.add(loginPanel);
        this.add(imageBanner);


    }
}
