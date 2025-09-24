package shop_page;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class cartCard extends JPanel implements ActionListener, MouseListener{
    Color btncolor = new Color(0, 128, 128);
    Color hovercolor = new Color(64, 192, 192);
    JLabel imgLabel, nameLabel, priceLabel, qtyLabel, totalLabel;
    JButton add, subtract, delete;
    ImageIcon prdImg, dltBtnImg;
    Image scaledPrdImg, scaledDltBtnImg;
    Font buttonFont = new Font("Helvetica", Font.PLAIN, 12);
    Font priceFont = new Font("Helvetica", Font.PLAIN, 12);
    Font nameFont = new Font("Helvetica", Font.BOLD, 16);

    public cartCard() {
        this.setLayout(null);
        this.setBounds(15, 60, 315, 150);
        this.setBackground(new Color(255, 224, 217));

        prdImg = new ImageIcon("./images/blueNP.png");
        scaledPrdImg = prdImg.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        prdImg = new ImageIcon(scaledPrdImg);
        imgLabel = new JLabel(prdImg);
        imgLabel.setBounds(20, 30, 90, 90);

        nameLabel = new JLabel("Blue Nail Polish");
        nameLabel.setFont(nameFont);
        nameLabel.setBounds(130, 30, 130, 30);

        priceLabel = new JLabel("$39.99");
        priceLabel.setFont(priceFont);
        priceLabel.setBounds(130, 50, 60, 30);

        add = new JButton("+");
        add.setFont(buttonFont);
        add.setMargin(new Insets(0, 0, 0, 0));
        add.setFocusPainted(false);
        add.setBorderPainted(false);
        add.setForeground(Color.WHITE);
        add.setBackground(btncolor);
        add.setBounds(270, 90, 30, 30);
        add.addActionListener(this);
        add.addMouseListener(this);

        qtyLabel = new JLabel("1", SwingConstants.CENTER);
        qtyLabel.setFont(priceFont);
        qtyLabel.setBounds(240, 90, 30, 30);

        subtract = new JButton("-");
        subtract.setFont(buttonFont);
        subtract.setMargin(new Insets(0, 0, 0, 0));
        subtract.setFocusPainted(false);
        subtract.setBorderPainted(false);
        subtract.setForeground(Color.WHITE);
        subtract.setBackground(btncolor);
        subtract.setBounds(210, 90, 30, 30);
        subtract.addActionListener(this);
        subtract.addMouseListener(this);

        dltBtnImg = new ImageIcon("./images/bin.png");
        scaledDltBtnImg = dltBtnImg.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        dltBtnImg = new ImageIcon(scaledDltBtnImg);
        delete = new JButton(dltBtnImg);
        delete.setBounds(275, 20, 30, 30);
        delete.setMargin(new Insets(0, 0, 0, 0));
        delete.setFocusPainted(false);
        delete.setBorderPainted(false);
        delete.setContentAreaFilled(false);
        delete.addActionListener(this);

        totalLabel = new JLabel("Total: $39.99");
        totalLabel.setBounds(210, 120, 80, 30);
        totalLabel.setFont(priceFont);

        this.add(imgLabel);
        this.add(nameLabel);
        this.add(priceLabel);
        this.add(add);
        this.add(subtract);
        this.add(qtyLabel);
        this.add(delete);
        this.add(totalLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {

        }
        else if (e.getSource() == subtract) {

        }
        else if (e.getSource() == delete) {
            
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
        if (e.getSource() == add) {
            add.setBackground(hovercolor);
        }
        else if (e.getSource() == subtract) {
            subtract.setBackground(hovercolor);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == add) {
            add.setBackground(btncolor);
        }
        else if (e.getSource() == subtract) {
            subtract.setBackground(btncolor);
        }
    }
    

}
