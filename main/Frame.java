package main;

import java.awt.CardLayout;

import javax.swing.*;

import account_page.account_page;
import checkout.*;
import login_page.*;
import register_page.*;
import shop_page.*;

public class Frame extends JFrame {
    CardLayout card;
    JPanel pageHolder;
    ImageIcon frameLogo;

    public Frame() {
        super("Lumora");
        frameLogo = new ImageIcon("./images/lumora_icon.png");
        this.setIconImage(frameLogo.getImage());
        this.setSize(1280, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        card = new CardLayout();
        pageHolder = new JPanel(card);
        loginPage login = new loginPage(card, pageHolder);
        registerPage registerPage = new registerPage(card, pageHolder);
        shopPage shopPage = new shopPage(card, pageHolder);
        checkout_page checkout = new checkout_page(card, pageHolder);
        account_page account = new account_page(card, pageHolder);


        pageHolder.add(login, "login");
        pageHolder.add(registerPage, "register");
        pageHolder.add(shopPage, "shop");
        pageHolder.add(checkout, "checkout");
        pageHolder.add(account, "account");

        card.show(pageHolder, "login");

        this.add(pageHolder);

    }
    
}