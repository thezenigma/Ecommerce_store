package shop_page;

import javax.swing.*;

import entities.products;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class shopBody extends JPanel{
    Color bgColor = new Color(255, 229, 180);
    
    productPanel[][] productPanels;
    int widthAdd, heightAdd, count;
    String filename;
    products[] prdArray;
    File myFile;
    Scanner sc;

    public shopBody(String filename) {
        this.filename = filename;
        prdArray = new products[9];
        insertPrd(prdArray);
        this.setPreferredSize(new Dimension(1030, 1200));
        this.setLayout(null);
        this.setBackground(bgColor);
        productPanels = new productPanel[3][3];
        for (int i = 0; i < 3; i++) {
            widthAdd = 0;
            for (int j = 0; j < 3; j++) {
                if (count < prdArray.length && prdArray[count] != null) {
                    productPanels[i][j] = new productPanel(prdArray[count]);
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
                    prd[idx] = new products();
                    prd[idx].setProductName(value[0]);
                    prd[idx].setPrice(value[1]);
                    prd[idx].setImage("./images/" + value[2] + ".png");
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
