package account_page;

import java.awt.*;
import javax.swing.*;

public class account_page extends JPanel{

    public account_page(CardLayout card, JPanel pageHolder) {//////////////
        this.setLayout(null);
        this.setBounds(0, 0, 1280, 720);
        accountHeader accountHeader = new accountHeader(card, pageHolder);
        account_body accountBody = new account_body(card, pageHolder);


        
        this.add(accountHeader);
        this.add(accountBody);

    }    
}
