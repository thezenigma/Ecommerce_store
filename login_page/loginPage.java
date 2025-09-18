package login_page;

import java.awt.CardLayout;

import javax.swing.*;

public class loginPage extends JPanel {
    ImageBanner imageBanner;
    loginPanel loginPanel;
    public loginPage(CardLayout card, JPanel pageHolder) {
        this.setLayout(null);
        this.setBounds(0, 0, 1280, 720);
        
        loginPanel = new loginPanel(card, pageHolder);
        imageBanner = new ImageBanner();

        this.add(loginPanel);
        this.add(imageBanner);


    }
}
