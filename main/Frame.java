package main;

import java.awt.CardLayout;

import javax.swing.*;

import login_page.loginPage;
import register_page.registerPage;
import shop_page.shopPage;

public class Frame extends JFrame {
    CardLayout card;
    JPanel pageHolder;

    public Frame() {
        super("Crafty");
        this.setSize(1280, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        card = new CardLayout();
        pageHolder = new JPanel(card);
        loginPage login = new loginPage(card, pageHolder);
        registerPage registerPage = new registerPage(card, pageHolder);
        shopPage shopPage = new shopPage(card, pageHolder);


        pageHolder.add(login, "login");
        pageHolder.add(registerPage, "register");
        pageHolder.add(shopPage, "shop");

        card.show(pageHolder, "login");

        this.add(pageHolder);

    }
    
}
