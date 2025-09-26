package account_page;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class account_body extends JPanel implements ActionListener, MouseListener{
    JLabel accountTitle, currentDetails, updateDetails, nameLabel, passLabel, emailLabel, curName, curPass, curEmail;
    JTextField upName, upPass, upEmail;
    JButton saveBtn;

    Font titleFont = new Font("Helvetica", Font.BOLD, 28);
    Font sectionFont = new Font("Helvetica", Font.BOLD, 18);
    Font labelFont = new Font("Helvetica", Font.BOLD, 14);
    Font fieldFont = new Font("Helvetica", Font.PLAIN, 14);
    Color btnColor = new Color(0, 128, 128);
    Color hoverColor = new Color(64, 192, 192);

    public account_body() {
        this.setLayout(null);
        this.setBounds(0, 80, 1280, 640);
        this.setBackground(new Color(255, 228, 225));

        accountTitle = new JLabel("Account");
        accountTitle.setFont(titleFont);
        accountTitle.setBounds(120, 30, 200, 40);

        currentDetails = new JLabel("Current Account Details");
        currentDetails.setFont(sectionFont);
        currentDetails.setBounds(120, 90, 300, 30);

        JSeparator sep1 = new JSeparator();
        sep1.setBounds(120, 160, 440, 20);

        nameLabel = new JLabel("Name");
        nameLabel.setFont(labelFont);
        nameLabel.setBounds(120, 130, 100, 30);

        curName = new JLabel("Sophia Carter");
        curName.setFont(fieldFont);
        curName.setBounds(260, 130, 300, 30);
        
        JSeparator sep2 = new JSeparator();
        sep2.setBounds(120, 200, 440, 20); 

        passLabel = new JLabel("Password");
        passLabel.setFont(labelFont);
        passLabel.setBounds(120, 170, 100, 30);

        curPass = new JLabel("sophia123");
        curPass.setFont(fieldFont);
        curPass.setBounds(260, 170, 300, 30);
        
        JSeparator sep3 = new JSeparator();
        sep3.setBounds(120, 200, 440, 20); 

        emailLabel = new JLabel("Email");
        emailLabel.setFont(labelFont);
        emailLabel.setBounds(120, 210, 100, 30);

        curEmail = new JLabel("sophia.carter@email.com");
        curEmail.setFont(fieldFont);
        curEmail.setBounds(260, 210, 300, 30);

        updateDetails = new JLabel("Update Account Details");
        updateDetails.setFont(sectionFont);
        updateDetails.setBounds(120, 270, 300, 30);

        JLabel updNameLabel = new JLabel("Name");
        updNameLabel.setFont(labelFont);
        updNameLabel.setBounds(120, 310, 100, 30);

        upName = new JTextField();
        upName.setFont(fieldFont);
        upName.setBounds(120, 340, 300, 35);

        JLabel updPassLabel = new JLabel("Password");
        updPassLabel.setFont(labelFont);
        updPassLabel.setBounds(120, 380, 100, 30);

        upPass = new JTextField();
        upPass.setFont(fieldFont);
        upPass.setBounds(120, 410, 300, 35);

        JLabel upEmailLabel = new JLabel("Email");
        upEmailLabel.setFont(labelFont);
        upEmailLabel.setBounds(120, 450, 100, 30);

        upEmail = new JTextField();
        upEmail.setFont(fieldFont);
        upEmail.setBounds(120, 480, 300, 35);

        saveBtn = new JButton("Save Changes");
        saveBtn.setFont(new Font("Helvetica", Font.BOLD, 14));
        saveBtn.setBounds(120, 540, 150, 40);
        saveBtn.setFocusable(false);
        saveBtn.setBorderPainted(false);
        saveBtn.setBackground(btnColor);
        saveBtn.setForeground(Color.WHITE);
        saveBtn.addActionListener(this);
        saveBtn.addMouseListener(this);

        this.add(accountTitle);
        this.add(currentDetails);
        this.add(nameLabel);
        this.add(curName);
        this.add(passLabel);
        this.add(curPass);
        this.add(emailLabel);
        this.add(curEmail);
        this.add(updateDetails);
        this.add(updNameLabel);
        this.add(upName);
        this.add(updPassLabel);
        this.add(upPass);
        this.add(upEmailLabel);
        this.add(upEmail);
        this.add(saveBtn);
        this.add(sep1);
        this.add(sep2);
        this.add(sep3);
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
        if (e.getSource() == saveBtn) {
            saveBtn.setBackground(hoverColor);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == saveBtn) {
            saveBtn.setBackground(btnColor);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
}
