package shop_page;

import javax.swing.*;

import entities.products;

import java.awt.*;
import java.awt.event.*;

public class productPanel extends JPanel implements ActionListener,MouseListener{
    Color buttonColor = new Color(0, 128, 128);
    Color hoverColor = new Color(64, 192, 192);
    Font bodyFontTitle = new Font("Arial", Font.BOLD, 16);
    Font price_button = new Font("Helvetica", Font.BOLD, 12);
    ImageIcon icon;
    JLabel imgLabel, name, price;
    JButton addButton;
    products prd;
    

    public productPanel(products prd) {
        this.prd = prd;
        this.setBackground(new Color(255, 245, 230));
        imgLabel = new JLabel(prd.getImage());
        imgLabel.setBounds(40, 40, 170, 170);
        this.add(imgLabel);

        name = new JLabel(prd.getProductName());
        name.setBounds(40, 220, 170, 20);
        name.setFont(bodyFontTitle);
        this.add(name);

        price = new JLabel(prd.getPrice());
        price.setBounds(40, 240, 130, 20);
        price.setFont(price_button);
        this.add(price);

        addButton = new JButton("Add");
        addButton.setBounds(80, 280, 100, 30);
        addButton.setBackground(buttonColor);
        addButton.setForeground(Color.WHITE);
        addButton.setFocusPainted(false);
        addButton.setBorderPainted(false);
        addButton.setFont(price_button);
        addButton.addActionListener(this);
        addButton.addMouseListener(this);
        this.add(addButton);
    }
 

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addButton) {
            
        }
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
        if (e.getSource() == addButton) {
            addButton.setBackground(hoverColor);
        }
    }


    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == addButton) {
            addButton.setBackground(buttonColor);
        }
    }
}
