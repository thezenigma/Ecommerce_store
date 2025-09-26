package shop_page;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class shopHeader extends JPanel implements ActionListener, MouseListener{
    Color headerColor = new Color(255, 182, 193);
    Color btnColor = new Color(0, 128, 128);
    Color btnHover = new Color(64, 192, 192);
    Font titleFont = new Font("Arial", Font.BOLD, 46);
    JLabel headerlbl;
    JButton cartbtn, accountbtn, logoutbtn;
    CardLayout card;
    JPanel pageHolder, checkout;
    ImageIcon cartImg, logoutImg, accImg;
    Image scaler;
    JScrollPane cartScroll;
    boolean isOpen = false;

    public shopHeader(CardLayout card, JPanel pageHolder, JScrollPane cartScroll, JPanel checkout){
        this.card = card;
        this.pageHolder = pageHolder;
        this.cartScroll = cartScroll;
        this.checkout = checkout;
        this.setLayout(null);
        this.setBounds(0, 0, 1280, 80);
        this.setBackground(headerColor);

        cartImg = new ImageIcon("./images/shopping.png");
        accImg = new ImageIcon("./images/user.png");
        logoutImg = new ImageIcon("./images/logout.png");

        scaler = cartImg.getImage().getScaledInstance(44, 44, Image.SCALE_SMOOTH);
        cartImg = new ImageIcon(scaler);

        scaler = accImg.getImage().getScaledInstance(44, 44, Image.SCALE_SMOOTH);
        accImg = new ImageIcon(scaler);

        scaler = logoutImg.getImage().getScaledInstance(44, 44, Image.SCALE_SMOOTH);
        logoutImg = new ImageIcon(scaler);

        headerlbl = new JLabel("Lumora");
        headerlbl.setBounds(60, 15, 400, 50);
        headerlbl.setVerticalAlignment(SwingConstants.CENTER);
        headerlbl.setFont(titleFont);
        headerlbl.setForeground(Color.WHITE);
        this.add(headerlbl);

        cartbtn = new JButton(cartImg);
        cartbtn.setBounds(980, 10, 60, 60);
        cartbtn.setBackground(btnColor);
        cartbtn.setFocusPainted(false);
        cartbtn.setBorderPainted(false);
        cartbtn.addActionListener(this);
        cartbtn.addMouseListener(this);
        this.add(cartbtn);

        accountbtn = new JButton(accImg);
        accountbtn.setBounds(1060, 10, 60, 60);
        accountbtn.setBackground(btnColor);
        accountbtn.setFocusPainted(false);
        accountbtn.setBorderPainted(false);
        accountbtn.addActionListener(this);
        accountbtn.addMouseListener(this);
        this.add(accountbtn);

        logoutbtn = new JButton(logoutImg);
        logoutbtn.setBounds(1140, 10, 60, 60);
        logoutbtn.setBackground(btnColor);
        logoutbtn.setFocusPainted(false);
        logoutbtn.setBorderPainted(false);
        logoutbtn.addActionListener(this);
        logoutbtn.addMouseListener(this);
        this.add(logoutbtn);

    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cartbtn) {
            if (!isOpen) {
                cartScroll.setVisible(true);
                checkout.setVisible(true);
                isOpen = true;
            }
            else {
                cartScroll.setVisible(false);
                checkout.setVisible(false);
                isOpen = false;
            }
            cartScroll.repaint();
            checkout.repaint();
        } else if (e.getSource() == accountbtn) {
            card.show(pageHolder, "account");

        } else if (e.getSource() == logoutbtn) {
            card.show(pageHolder, "login");
        }
    }
    
    public void mouseClicked(MouseEvent me) {
    }

    public void mousePressed(MouseEvent me) {
       
    }

    public void mouseReleased(MouseEvent me) {
      
    }

    public void mouseEntered(MouseEvent me) {
        if (me.getSource() == cartbtn) {
            cartbtn.setBackground(btnHover);
        }
        else if (me.getSource() == accountbtn) {
            accountbtn.setBackground(btnHover);
        }
        else if (me.getSource() == logoutbtn) {
            logoutbtn.setBackground(btnHover);
        }
    }

    public void mouseExited(MouseEvent me) {
        if (me.getSource() == cartbtn) {
            cartbtn.setBackground(btnColor);
        }
        else if (me.getSource() == accountbtn) {
            accountbtn.setBackground(btnColor);
        }
        else if (me.getSource() == logoutbtn) {
            logoutbtn.setBackground(btnColor);
        }
    }
    
}