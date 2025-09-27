package account_page;

import java.awt.*;
import javax.swing.*;

public class account_page extends JPanel{

    public account_page(CardLayout card, JPanel pageHolder) {
        this(card, pageHolder, "Guest", "guest@email.com", "1234"); // default মান
    }

    
    public account_page(CardLayout card, JPanel pageHolder, String name, String email, String password) {//////////////
        this.setLayout(null);
        this.setBounds(0, 0, 1280, 720);
        accountHeader accountHeader = new accountHeader(card, pageHolder);
        account_body accountBody = new account_body(card, pageHolder, name, email, password);


        
        this.add(accountHeader);
        this.add(accountBody);

    }    
}
