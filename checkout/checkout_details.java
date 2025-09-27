package checkout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import shop_page.cartPanel;/////////////////


public class checkout_details extends JPanel implements ActionListener, MouseListener{
    JLabel title, shippingMethod, nameLabel, phoneLabel, addressLabel, cityLabel, areaLabel, orderLabel, normalBill, expressBill, subtotal, subtotalAmt, total, totalAmt, paymentOption;
    JTextField nameField, phoneField, addressField, city, area;
    JTextArea orderNote;
    JRadioButton normal, express, COD, card;
    JButton placeOrder;
    JPanel pageHolder;
    CardLayout cardL;

    cartPanel cart;  

    Font titleFont = new Font("Helvetica", Font.BOLD, 20);
    Font labelFont = new Font("Helvetica", Font.BOLD, 16);
    Font fieldFont = new Font("Helvetica", Font.PLAIN, 16);
    Color bg = new Color(255, 228, 225);
    Color btnColor = new Color(0, 128, 128);
    Color hvrColor = new Color(64, 192, 192);


    public checkout_details(CardLayout cardL, JPanel pageHolder) {
        this.cardL = cardL;
        this.pageHolder = pageHolder;
        this.cart = cartPanel.sharedInstance; 
        this.setLayout(null);
        this.setBounds(0, 80, 1280, 640);
        this.setBackground(bg);

        
        title = new JLabel("BILLING & SHIPPING");
        title.setBounds(60, 70, 250, 50);
        title.setFont(new Font("Helvetica", Font.BOLD, 24));

        nameLabel = new JLabel("Name");
        nameLabel.setBounds(60, 150, 100, 30);
        nameLabel.setFont(labelFont);
 
        nameField = new JTextField();
        nameField.setBounds(60, 190, 260, 40);
        nameField.setFont(fieldFont);

        phoneLabel = new JLabel("Phone");
        phoneLabel.setBounds(350, 150, 100, 30);
        phoneLabel.setFont(labelFont);

        phoneField = new JTextField();
        phoneField.setBounds(350, 190, 260, 40);
        phoneField.setFont(fieldFont);

        cityLabel = new JLabel("City");
        cityLabel.setBounds(60, 250, 100, 30);
        cityLabel.setFont(labelFont);

        city = new JTextField();
        city.setBounds(60, 290, 260, 40);
        city.setFont(fieldFont);

        areaLabel = new JLabel("Area");
        areaLabel.setBounds(350, 250, 100, 30);
        areaLabel.setFont(labelFont);

        area = new JTextField();
        area.setBounds(350, 290, 260, 40);
        area.setFont(fieldFont);

        orderLabel = new JLabel("Order Note");
        orderLabel.setBounds(60, 360, 100, 30);
        orderLabel.setFont(labelFont);

        orderNote = new JTextArea(150, 520);
        orderNote.setBounds(60, 400, 550, 150);
        orderNote.setFont(fieldFont);

        shippingMethod = new JLabel("Choose a Shipping Method: ");
        shippingMethod.setBounds(700, 150, 300, 30);
        shippingMethod.setFont(titleFont);

        normal = new JRadioButton("Normal Delivery(3 days)");
        normal.setBounds(700, 210, 250, 30);
        normal.setBackground(bg);
        normal.setFocusPainted(false);
        normal.setFont(fieldFont);
        normal.setSelected(true);
        normal.addActionListener(this);

        normalBill = new JLabel("$9.00", SwingConstants.RIGHT);
        normalBill.setBounds(1020, 210, 70, 30);
        normalBill.setFont(fieldFont);

        express = new JRadioButton("Express Delivery(1 day)");
        express.setBounds(700, 250, 250, 30);
        express.setBackground(bg);
        express.setFocusPainted(false);
        express.setFont(fieldFont);
        express.addActionListener(this);

        expressBill = new JLabel("$18.00", SwingConstants.RIGHT);
        expressBill.setBounds(1020, 250, 70, 30);
        expressBill.setFont(fieldFont);

        ButtonGroup shippingGroup = new ButtonGroup();
        shippingGroup.add(normal);
        shippingGroup.add(express);

        subtotal = new JLabel("Subtotal");
        subtotal.setBounds(700, 290, 100, 30);
        subtotal.setFont(fieldFont);

        subtotalAmt = new JLabel("$0.0", SwingConstants.RIGHT);
        subtotalAmt.setBounds(990, 290, 100, 30);
        this.add(subtotalAmt);

        JSeparator line = new JSeparator();
        line.setBounds(700, 330, 400, 20);

        total = new JLabel("Total");
        total.setBounds(700, 350, 100, 30);
        total.setFont(titleFont);

        // total label
        totalAmt = new JLabel("$0.0", SwingConstants.RIGHT);
        totalAmt.setBounds(1040, 350, 100, 30);
        this.add(totalAmt);



        
        paymentOption = new JLabel("Choose your Payment Option");
        paymentOption.setBounds(700, 390, 300, 30);
        paymentOption.setFont(titleFont);

        COD = new JRadioButton("Cash on Delivery");
        COD.setBounds(700, 430, 250, 30);
        COD.setBackground(bg);
        COD.setFocusPainted(false);
        COD.setFont(fieldFont);
        COD.setSelected(true);

        card = new JRadioButton("Pay with Card/ Mobile Wallet");
        card.setBounds(700, 460, 300, 30);
        card.setBackground(bg);
        card.setFocusPainted(false);
        card.setFont(fieldFont);

        ButtonGroup paymentGroup = new ButtonGroup();
        paymentGroup.add(COD);
        paymentGroup.add(card);

        placeOrder = new JButton("PLACE ORDER");
        placeOrder.setBounds(700, 530, 400, 40);
        placeOrder.setBorderPainted(false);
        placeOrder.setFocusPainted(false);
        placeOrder.setBackground(btnColor);
        placeOrder.setForeground(Color.WHITE);
        placeOrder.setFont(fieldFont);
        placeOrder.addActionListener(this);
        placeOrder.addMouseListener(this);

        this.add(title);
        this.add(nameLabel);
        this.add(nameField);
        this.add(phoneLabel);
        this.add(phoneField);
        this.add(cityLabel);
        this.add(city);
        this.add(areaLabel);
        this.add(area);
        this.add(orderLabel);
        this.add(orderNote);
        this.add(shippingMethod);
        this.add(normal);
        this.add(normalBill);
        this.add(express);
        this.add(expressBill);
        this.add(subtotal);
        this.add(subtotalAmt);
        this.add(line);
        this.add(total);
        this.add(totalAmt);
        this.add(paymentOption);
        this.add(COD);
        this.add(card);
        this.add(placeOrder);

        updateTotal(); 
        
    }

    private void updateTotal() {
        if (cart == null) return;  

        double subTotalValue = cart.getCartSubtotal();
        subtotalAmt.setText("$" + subTotalValue);

        double shipping = normal.isSelected() ? 9 : 18;
        double totalValue = subTotalValue + shipping;
        totalAmt.setText("$" + totalValue);
    }



    @Override
   public void actionPerformed(ActionEvent e) {
        if (e.getSource() == placeOrder) {
            JOptionPane.showMessageDialog(null, "Your order has been placed!");
            cart.clearCart();
            updateTotal();
            cardL.show(pageHolder, "shop");
        }

        if (e.getSource() == normal || e.getSource() == express) {
            updateTotal();
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
        if (e.getSource() == placeOrder) {
            placeOrder.setBackground(hvrColor);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == placeOrder) {
            placeOrder.setBackground(btnColor);
        }
    }


}
