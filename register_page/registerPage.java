package register_page;
import java.awt.CardLayout;

import javax.swing.*;

public class registerPage extends JPanel {
    public registerPage(CardLayout card, JPanel pageHolder) {
        this.setBounds(0, 0, 1280, 720);
        this.setLayout(null);
        

        registerPanel loginPanel = new registerPanel(card, pageHolder);
        
        ImageBanner imgBanner = new ImageBanner();
        
        this.add(imgBanner);
        this.add(loginPanel);
    
    }
}
