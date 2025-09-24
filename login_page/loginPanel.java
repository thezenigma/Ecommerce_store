package login_page;
import entities.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;     

public class loginPanel extends JPanel implements ActionListener, MouseListener {
    JLabel loginLabel, email, pass, welcomeMsg, errorMsg;
    JTextField emailField;
    JPasswordField passField;
    JButton loginButton, registerPage;
    CardLayout card;
    JPanel pageHolder;

    Font headerFont = new Font("Bennett", Font.BOLD, 28);
    Font bodyFont = new Font("Helvetica", Font.PLAIN, 14);
     
     // account a1;

    public loginPanel(CardLayout card, JPanel pageHolder) {
        this.card = card;
        this.pageHolder = pageHolder;
        this.setLayout(null);
        this.setBounds(775, 90, 440, 480);
        this.setBackground(new Color(255, 250, 241));

        loginLabel = new JLabel("Login", SwingConstants.CENTER);
        loginLabel.setBounds(120, 50, 200, 50);
        loginLabel.setFont(headerFont);
        this.add(loginLabel);

        welcomeMsg = new JLabel("Enter your credentials to login", SwingConstants.CENTER);
        welcomeMsg.setLayout(null);
        welcomeMsg.setBounds(60, 110, 320, 30);
        welcomeMsg.setFont(bodyFont);
        this.add(welcomeMsg);

        email =new JLabel("Email");
        email.setFont(bodyFont);
        email.setBounds(60, 150, 100, 30);
        this.add(email);

        emailField = new JTextField();
        emailField.setBounds(60, 180, 320, 30);
        emailField.setFont(bodyFont);
        this.add(emailField);

        pass = new JLabel("Password");
        pass.setFont(bodyFont);
        pass.setBounds(60, 230, 100, 30);
        this.add(pass);

        passField = new JPasswordField();
        passField.setBounds(60, 260, 320, 30);
        passField.setFont(bodyFont);
        this.add(passField);

        loginButton = new JButton("Login");
        loginButton.setBounds(140, 310, 150, 40);
        loginButton.setFont(new Font("Helvetica", Font.BOLD, 14));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(Color.BLUE);
        loginButton.addActionListener(this);
        loginButton.addMouseListener(this);
        this.add(loginButton);

        errorMsg = new JLabel("", SwingConstants.CENTER);
        errorMsg.setForeground(Color.red);
        errorMsg.setFont(bodyFont);
        errorMsg.setBounds(60, 360, 320, 30);
        this.add(errorMsg);

        JLabel promptLabel = new JLabel("Don't have an account?");
        promptLabel.setBounds(130, 400, 200, 30);
        promptLabel.setFont(new Font("Helvetica", Font.PLAIN, 12));
        this.add(promptLabel);

        registerPage = new JButton("Register");
        registerPage.setBounds(230, 400, 100, 30);
        registerPage.setBorderPainted(false);
        registerPage.setContentAreaFilled(false);
        registerPage.setForeground(Color.blue);
        registerPage.setFont(new Font("Helvetica", Font.BOLD, 12));
        registerPage.addActionListener(this);
        registerPage.addMouseListener(this);
        this.add(registerPage);
        }



   public void actionPerformed(ActionEvent e) {
    if (e.getSource() == loginButton) {
        account a1 = new account();
        String s2 = emailField.getText();
        String s3 = passField.getText();

        if (s2.trim().isEmpty() || s3.trim().isEmpty()) {
            errorMsg.setText("Please enter valid email and password!");
        }

        else if (s2.indexOf("@gmail.com") == -1) {
            errorMsg.setText("Please enter a valid email address!");
        }

            // file check
        else if (a1.checkCredentials(s2, s3)) {
            errorMsg.setText(null);
            emailField.setText(null);
            passField.setText(null);
            JOptionPane.showMessageDialog(this, "Login successful! Welcome " + s2);
            card.show(pageHolder, "shop");
        } 
        else {
            errorMsg.setText("Invalid Email or Password!");
        }

    }
    else if (e.getSource() == registerPage) {
        card.show(pageHolder, "register");
    }
   }
    public void mouseClicked(MouseEvent me){}

    public void mouseReleased(MouseEvent me) {
            
    }

    public void mouseEntered(MouseEvent me){
        if(me.getSource() == loginButton){
            loginButton.setBackground(Color.WHITE);
            loginButton.setForeground(Color.BLUE);
        }
        else if (me.getSource() == registerPage){
            registerPage.setForeground(Color.BLACK);
        }
    }   

    public void mouseExited(MouseEvent me) {
        if (me.getSource() == loginButton) {
            loginButton.setBackground(Color.BLUE);
            loginButton.setForeground(Color.WHITE);
        } else if (me.getSource() == registerPage) {
            registerPage.setForeground(Color.BLUE);
        }

    }

    public void mousePressed(MouseEvent me) {
            
    }
        
}