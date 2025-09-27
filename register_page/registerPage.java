package register_page;
import java.awt.CardLayout;

import javax.swing.*;
import java.awt.*;

public class registerPage extends JPanel {
    registerPanel registerPanel;
    public registerPage(CardLayout card, JPanel pageHolder) {
        this.setBounds(0, 0, 1280, 720);
        this.setLayout(null);
        this.setBackground(new Color(255, 228, 225));

        registerPanel = new registerPanel(card, pageHolder);

        ImageBanner imgBanner = new ImageBanner();

        this.add(imgBanner);
        this.add(registerPanel);

    }
    
}
