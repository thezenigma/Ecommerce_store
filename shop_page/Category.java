package shop_page;
import java.awt.*;
import java.awt.event.*;

import javax.smartcardio.Card;
import javax.swing.*;

public class Category extends JPanel implements ActionListener, MouseListener{
    //JLabel catLbl;
    //Font titleFont = new Font("Arial", Font.BOLD, 28);
    Font buttonFont = new Font("Arial", Font.PLAIN, 20);
    JButton cat1, cat2, cat3, cat4, cat5, cat6;
    CardLayout card;
    JPanel shopBody;

    public Category(CardLayout card, JPanel shopBody) {
        this.card = card;
        this.shopBody = shopBody;
        this.setLayout(null);
        this.setBounds(0, 80, 250, 640);  
        this.setBackground(Color.WHITE);

        cat1 = new JButton("Face Packs");
        cat1.setBounds(0, 30, 250, 50);
        cat1.setBackground(Color.WHITE);
        cat1.setFocusPainted(false);
        cat1.setBorderPainted(false);
        cat1.setFont(buttonFont);
        cat1.addActionListener(this);
        this.add(cat1);

        cat2 = new JButton("Skin Care");
        cat2.setBounds(0, 80, 250, 50);
        cat2.setBackground(Color.WHITE);
        cat2.setFocusPainted(false);
        cat2.setBorderPainted(false);
        cat2.setFont(buttonFont);
        cat2.addActionListener(this);
        this.add(cat2);

        cat3 = new JButton("Makeup");
        cat3.setBounds(0, 130, 250, 50);
        cat3.setBackground(Color.WHITE);
        cat3.setFocusPainted(false);
        cat3.setBorderPainted(false);
        cat3.setFont(buttonFont);
        cat3.addActionListener(this);
        this.add(cat3);

        cat4 = new JButton("Hair Care");
        cat4.setBounds(0, 180, 250, 50);
        cat4.setBackground(Color.WHITE);
        cat4.setFocusPainted(false);
        cat4.setBorderPainted(false);
        cat4.setFont(buttonFont);
        cat4.addActionListener(this);
        this.add(cat4);

        cat5 = new JButton("Perfume");
        cat5.setBounds(0, 230, 250, 50);
        cat5.setBackground(Color.WHITE);
        cat5.setFocusPainted(false);
        cat5.setBorderPainted(false);
        cat5.setFont(buttonFont);
        cat5.addActionListener(this);
        this.add(cat5);

        cat6 = new JButton("Nails");
        cat6.setBounds(0, 280, 250, 50);
        cat6.setBackground(Color.WHITE);
        cat6.setFocusPainted(false);
        cat6.setBorderPainted(false);
        cat6.setFont(buttonFont);
        cat6.addActionListener(this);
        this.add(cat6);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cat1) {
            card.show(shopBody, "Face_Pack");
        }
        else if (e.getSource() == cat2) {
            card.show(shopBody, "Skincare");
        }
        else if (e.getSource() == cat3) {
            card.show(shopBody, "Makeup");
        }
        else if (e.getSource() == cat4) {
            card.show(shopBody, "Hair_Oil");
        }
        else if (e.getSource() == cat5) {

        }
        else if (e.getSource() == cat6) {

        }
       
    }

}
