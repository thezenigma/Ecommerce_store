package shop_page;

import java.awt.*;

import javax.swing.*;

public class shopPage extends JPanel {
    shopHeader head;
    Category category;
    shopBody cat1, cat2, cat3, cat4, cat5, cat6;
    JScrollPane bodyScroll, cartScroll;
    cartPanel cart;
    JPanel shopBody;
    CardLayout card, cardCategory;
    public shopPage(CardLayout card, JPanel pageHolder) {
        this.setBounds(0, 0,1280, 720);
        this.setLayout(null);

        cardCategory = new CardLayout();
        shopBody = new JPanel(cardCategory);
        cart = new cartPanel();
        category = new Category(cardCategory, shopBody);

        cat1 = new shopBody("./images/face_pack.png", "Natural Face Pack", "500");
        cat2 = new shopBody("./images/salicylic_acid.png", "Salicylic Acid", "6500");
        cat3 = new shopBody("./images/makeup_kit.jpeg", "Makeup Kit", "9000");
        cat4 = new shopBody("./images/hair_oil.png", "Lumina Hair Oil", "3000");
        
        shopBody.add(cat1, "Face_Pack");
        shopBody.add(cat2, "Skincare");
        shopBody.add(cat3, "Makeup");
        shopBody.add(cat4, "Hair_Oil");

        
        cart.setPreferredSize(new Dimension(360, 1200));
        bodyScroll = new JScrollPane(shopBody, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        cartScroll = new JScrollPane(cart, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        bodyScroll.getVerticalScrollBar().setPreferredSize(new Dimension(25, Integer.MAX_VALUE));
        cartScroll.getVerticalScrollBar().setPreferredSize(new Dimension (10, Integer.MAX_VALUE));
        bodyScroll.setBounds(250, 80, 1030, 640);
        cartScroll.setBounds(1280, 80, 360, 640);

        head = new shopHeader(card, pageHolder, cartScroll);

        this.add(head);
        this.add(category);
        this.add(bodyScroll);
        cardCategory.show(shopBody, "Face_Pack");
        this.add(cartScroll);
        this.setComponentZOrder(cartScroll, 0);
    }
}