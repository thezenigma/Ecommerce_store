package register_page;

import javax.swing.*;

public class ImageBanner extends JPanel {
    JLabel bannerlbl;
    ImageIcon banner;
    public ImageBanner() {
        this.setLayout(null);
        this.setBounds(0, 0, 720, 720);

        bannerlbl = new JLabel();
        bannerlbl.setBounds(0, 0, 720, 720);

        banner = new ImageIcon("./images/banner.png");
        
        bannerlbl.setIcon(banner);
        this.add(bannerlbl);

    }
}
