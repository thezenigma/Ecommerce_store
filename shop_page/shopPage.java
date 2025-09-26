package shop_page;

import java.awt.*;
import javax.swing.*;

public class shopPage extends JPanel {
    shopHeader head;
    Category category;
    shopBody cat1, cat2, cat3, cat4, cat5, cat6;
    JScrollPane bodyScroll, cartScroll;
    cartPanel cart;
    toCheckoutPanel checkout;
    JPanel shopBody;
    CardLayout card, cardCategory;


    public shopPage(CardLayout card, JPanel pageHolder) {
        this.setBounds(0, 0,1280, 720);
        this.setLayout(null);

        cardCategory = new CardLayout();
        shopBody = new JPanel(cardCategory);
        shopBody.setBounds(0, 60, 900, 600);////////////
        checkout = new toCheckoutPanel(card, pageHolder);
        cart = new cartPanel(checkout);

        
        
//////////////////////////////////////////////
        cat1 = new shopBody("./data/face_packs.txt", cart);
        cat2 = new shopBody("./data/skincare.txt", cart);
        cat3 = new shopBody("./data/makeup.txt", cart);
        cat4 = new shopBody("./data/hair_care.txt", cart);
        cat5 = new shopBody("./data/perfume.txt", cart);
        cat6 = new shopBody("./data/nails.txt", cart);
 /////////////////////////////////////////////////       
        

        shopBody.add(cat1, "Face_Pack");
        shopBody.add(cat2, "Skincare");
        shopBody.add(cat3, "Makeup");
        shopBody.add(cat4, "Hair_Care");
        shopBody.add(cat5, "Perfume");
        shopBody.add(cat6, "Nails");

        
        cart.setPreferredSize(new Dimension(360, 1200));

        bodyScroll = new JScrollPane(shopBody, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        cartScroll = new JScrollPane(cart, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

                
        bodyScroll.getVerticalScrollBar().setPreferredSize(new Dimension(25, Integer.MAX_VALUE));
        cartScroll.getVerticalScrollBar().setPreferredSize(new Dimension (10, Integer.MAX_VALUE));
        bodyScroll.setBounds(250, 80, 1030, 640);
        cartScroll.setBounds(920, 80, 360, 520);

        head = new shopHeader(card, pageHolder, cartScroll,checkout);
        category = new Category(cardCategory, shopBody, bodyScroll);

        this.add(head);
        this.add(category);
        this.add(bodyScroll);
        cardCategory.show(shopBody, "Face_Pack");
        this.add(cartScroll);
        this.add(checkout);
        this.setComponentZOrder(cartScroll, 0);
        this.setComponentZOrder(checkout, 0);
        cartScroll.setVisible(false);
        checkout.setVisible(false);
    }

    // //##################################333
    // // 🔥 main method to update checkout total
    // public void updateCheckoutTotal() {
    //     double total = cart.calculateTotal();
    //     checkout.updateTotal(total);
    // }
    // //#########################################
   

}