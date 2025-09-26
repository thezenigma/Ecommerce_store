package shop_page;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class toCheckoutPanel extends JPanel implements ActionListener, MouseListener {
    Color btncolor = new Color(0, 128, 128);
    Color hovercolor = new Color(64, 192, 192);
    JButton checkoutbtn;
    JLabel total, totalAmt;
    CardLayout card;
    JPanel pageHolder;
    Font btnfont = new Font("Helvetica", Font.BOLD, 20);
    public toCheckoutPanel(CardLayout card, JPanel pageHolder) {
        this.setLayout(null);
        this.setBounds(920, 600, 360, 140);
        this.setBackground(new Color(255, 243, 249));
        this.card = card;
        this.pageHolder = pageHolder;

        checkoutbtn = new JButton("Checkout");
        checkoutbtn.setBounds(90, 20, 230, 50);
        checkoutbtn.setFont(btnfont);
        checkoutbtn.setFocusPainted(false);
        checkoutbtn.setBorderPainted(false);
        checkoutbtn.setBackground(btncolor);
        checkoutbtn.setForeground(Color.WHITE);
        checkoutbtn.addActionListener(this);
        checkoutbtn.addMouseListener(this);

        total = new JLabel("Total");
        total.setBounds(20, 20, 60, 30);
        total.setFont(new Font("Helvetica", Font.BOLD, 16));

        totalAmt = new JLabel("$33.99");
        totalAmt.setBounds(20, 40, 60, 30);
        totalAmt.setFont(new Font("Helvetica", Font.PLAIN, 12));

        this.add(checkoutbtn);
        this.add(total);
        this.add(totalAmt);
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
        if (e.getSource() == checkoutbtn) {
            checkoutbtn.setBackground(hovercolor);
       }
    }
    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == checkoutbtn) {
            checkoutbtn.setBackground(btncolor);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkoutbtn) {
            card.show(pageHolder, "checkout");
       }
    }
}
