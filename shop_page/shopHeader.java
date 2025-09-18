package shop_page;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.InaccessibleObjectException;

public class shopHeader extends JPanel implements ActionListener, MouseListener{
    Color headerColor = new Color(145, 215, 92);
    Color btnColor = new Color(0, 128, 128);
    Font titleFont = new Font("Arial", Font.BOLD, 46);
    JLabel headerlbl;
    JButton cartbtn, accountbtn, logoutbtn;
    CardLayout card;
    JPanel pageHolder;
    ImageIcon cartImg, logoutImg, accImg;
    JScrollPane cartScroll;
    boolean isOpen = false;

    public shopHeader(CardLayout card, JPanel pageHolder, JScrollPane cartScroll) {
        this.card = card;
        this.pageHolder = pageHolder;
        this.cartScroll = cartScroll;
        this.setLayout(null);
        this.setBounds(0, 0, 1280, 80);
        this.setBackground(headerColor);

        cartImg = new ImageIcon("images/shopping-cart.png");
        accImg = new ImageIcon("images/account.png");
        logoutImg = new ImageIcon("images/logout-btn.png");

        headerlbl = new JLabel("Crafty");
        headerlbl.setBounds(60, 15, 400, 50);
        headerlbl.setVerticalAlignment(SwingConstants.CENTER);
        headerlbl.setFont(titleFont);
        this.add(headerlbl);

        cartbtn = new JButton(cartImg);
        cartbtn.setBounds(980, 10, 60, 60);
        cartbtn.setBackground(btnColor);
        cartbtn.addActionListener(this);
        cartbtn.addMouseListener(this);
        this.add(cartbtn);

        accountbtn = new JButton(accImg);
        accountbtn.setBounds(1060, 10, 60, 60);
        accountbtn.setBackground(btnColor);
        accountbtn.addActionListener(this);
        accountbtn.addMouseListener(this);
        this.add(accountbtn);

        logoutbtn = new JButton(logoutImg);
        logoutbtn.setBounds(1140, 10, 60, 60);
        logoutbtn.setBackground(btnColor);
        logoutbtn.addActionListener(this);
        logoutbtn.addMouseListener(this);
        this.add(logoutbtn);

    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cartbtn) {
            if (!isOpen) {
                cartScroll.setBounds(920, 80, 360, 640);
                isOpen = true;
            }
            else {
                cartScroll.setBounds(1280, 80, 360, 640);
                isOpen = false;
            }
            cartScroll.repaint();
        } else if (e.getSource() == accountbtn) {

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
            cartbtn.setBackground(Color.WHITE);
        }
        else if (me.getSource() == accountbtn) {
            accountbtn.setBackground(Color.WHITE);
        }
        else if (me.getSource() == logoutbtn) {
            logoutbtn.setBackground(Color.WHITE);
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
