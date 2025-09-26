package checkout;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;

public class checkout_page extends JPanel {
    checkoutHeader header;
    checkout_details details;
    public checkout_page(CardLayout card, JPanel pageHolder) {
        this.setLayout(null);
        this.setBounds(0, 0, 1280, 720);
        
        header = new checkoutHeader(card, pageHolder);
        details = new checkout_details(card, pageHolder);
        

        this.add(header);
        this.add(details);
        
    }
}
