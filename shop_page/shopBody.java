package shop_page;

import entities.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class shopBody extends JPanel{
    productPanel[][] productPanels;
    int widthAdd, heightAdd, count;
    String filename;
    products[] prdArray;
    File myFile;
    Scanner sc;

    cartPanel cart;

    public shopBody(String filename, cartPanel cart) {
        this.filename = filename;
        this.cart = cart;

        prdArray = new products[9];
        insertPrd(prdArray);
        this.setPreferredSize(new Dimension(1030, 1200));
        this.setLayout(null);
        this.setBackground(new Color(255, 228, 225));
        productPanels = new productPanel[3][3];
        for (int i = 0; i < 3; i++) {
            widthAdd = 0;
            for (int j = 0; j < 3; j++) {
                if (count < prdArray.length && prdArray[count] != null) {
                    productPanels[i][j] = new productPanel(prdArray[count], cart);/////////////////////
                    productPanels[i][j].setLayout(null);
                    productPanels[i][j].setBounds((80 + widthAdd), (30 + heightAdd), 250, 350);
                    this.add(productPanels[i][j]);
                    count++;
                }
                widthAdd += 300;
            }
            heightAdd += 370;
        }

    }
    
    public void insertPrd(products[] prd) {
        try{
            myFile = new File(filename);
            Scanner sc = new Scanner(myFile);
            int idx = 0;
            while (sc.hasNextLine() && idx < prd.length) {
                String line = sc.nextLine();
                String[] value = line.split("\t");
                if (value.length >= 3) {
                    prd[idx] = new products(value[0], value[1], value[2]);
                    idx++;
                }
            }
            sc.close();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}