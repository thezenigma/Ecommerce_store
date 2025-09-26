package register_page;
import entities.account;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class registerPanel extends JPanel implements ActionListener, MouseListener{
    JLabel registerLabel, name, email, pass, welcomeMsg, errorMsg, promptLabel;
    JTextField nameField, emailField;
    JPasswordField passField;
    CardLayout card;
    JPanel pageHolder;
    JButton regButton, loginPage;
    Font headerFont = new Font("Bennett", Font.BOLD, 28);
    Font bodyFont = new Font("Helvetica", Font.PLAIN, 14);
    account a1;

    public registerPanel(CardLayout card, JPanel pageHolder) {
        this.card = card;
        this.pageHolder = pageHolder;
        this.setLayout(null);
        this.setBounds(775, 55, 440, 580);
        this.setBackground(new Color(255, 245, 230));

        registerLabel = new JLabel("Register", SwingConstants.CENTER);
        registerLabel.setLayout(null);
        registerLabel.setBounds(110, 60, 200, 50);
        registerLabel.setFont(headerFont);

        welcomeMsg = new JLabel("Create your account to get started", SwingConstants.CENTER);
        welcomeMsg.setLayout(null);
        welcomeMsg.setBounds(50, 130, 320, 30);
        welcomeMsg.setFont(bodyFont);
        this.add(welcomeMsg);


        name = new JLabel("Name");
        name.setFont(bodyFont);
        name.setBounds(60, 180, 100, 30);
        this.add(name);

        nameField = new JTextField();
        nameField.setFont(bodyFont);
        nameField.setBounds(60, 210, 320, 30);
        this.add(nameField);

        email = new JLabel("Email");
        email.setFont(bodyFont);
        email.setBounds(60, 250, 100, 30);
        this.add(email);

        emailField = new JTextField();
        emailField.setBounds(60, 280, 320, 30);
        emailField.setFont(bodyFont);
        this.add(emailField);

        pass = new JLabel("Password");
        pass.setFont(bodyFont);
        pass.setBounds(60, 320, 100, 30);
        this.add(pass);

        passField = new JPasswordField();
        passField.setBounds(60, 350, 320, 30);
        passField.setFont(bodyFont);
        this.add(passField);

        regButton = new JButton("Register");
        regButton.setBounds(145, 410, 150, 40);
        regButton.setFont(new Font("Helvetica", Font.BOLD, 14));
        regButton.setForeground(Color.WHITE);
        regButton.setBackground(new Color(0, 128, 128));
        regButton.addActionListener(this);
        regButton.addMouseListener(this);
        this.add(regButton);
        
        errorMsg = new JLabel("", SwingConstants.CENTER);
        errorMsg.setLayout(null);
        errorMsg.setForeground(Color.red);
        errorMsg.setFont(bodyFont);
        errorMsg.setBounds(120, 450, 200, 30);
        this.add(errorMsg);

        promptLabel = new JLabel("Already have an account?", SwingConstants.CENTER);
        promptLabel.setLayout(null);
        promptLabel.setBounds(100, 490, 200, 30);
        promptLabel.setFont(new Font("Helvetica", Font.PLAIN, 12));
        this.add(promptLabel);
  
        loginPage = new JButton("Login");
        loginPage.setBounds(250, 490, 80, 30);
        loginPage.setBorderPainted(false);
        loginPage.setContentAreaFilled(false);
        loginPage.setForeground(new Color(0, 128, 128));
        loginPage.addActionListener(this);
        loginPage.addMouseListener(this);
        loginPage.setFont(new Font("Helvetica", Font.BOLD, 12));
        this.add(loginPage);



        this.add(registerLabel);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = nameField.getText();
        String s2 = emailField.getText();
        String s3 = passField.getText();
        if (e.getSource() == regButton) {
            a1 = new account();
            if (s1.trim().isEmpty() || s2.trim().isEmpty()
                    || s3.trim().isEmpty()) {
                errorMsg.setText("Please fill out all the fields!");

            }
            else if (s2.indexOf("@gmail.com") == -1) {
                errorMsg.setText("Please enter a valid email");
            }
            else if (a1.findAccount(s2)) {
                errorMsg.setText("Email already in use!");
            }
            else {
                a1 = new account(s1, s2, s3);
                a1.addAccount();
                errorMsg.setText(null);
                JOptionPane.showMessageDialog(null, "Registration Done! Welcome!");
                nameField.setText(null);
                emailField.setText(null);
                passField.setText(null);
                card.show(pageHolder, "shop");
            }

        }
        else if (e.getSource() == loginPage) {
            card.show(pageHolder, "login");
        }
    }

    public void mouseClicked(MouseEvent me) {
        
    }

    public void mouseReleased(MouseEvent me) {
        
    }
    
    public void mousePressed(MouseEvent me) {
        
    }

    public void mouseEntered(MouseEvent me) {
        if (me.getSource() == regButton) {
            regButton.setBackground(new Color(64, 192, 192));
        }
        else if (me.getSource() == loginPage) {
            loginPage.setForeground(new Color(64, 192, 192));
        }
    }


    public void mouseExited(MouseEvent me) {
        if (me.getSource() == regButton) {
            regButton.setBackground(new Color(0, 128, 128));
        }
        else if (me.getSource() == loginPage) {
            loginPage.setForeground(new Color(64, 192, 192));
        }
    }
   


}
