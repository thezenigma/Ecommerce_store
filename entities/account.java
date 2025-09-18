package entities;

import javax.swing.*;
import java.io.*;
import java.util.*;


public class account {
    private String name;
    private String email;
    private String pass;
    private File myFile;
    private FileWriter fwrite;
    private Scanner sc;
    private boolean flag;
    
    public account() {

    }
    
    public account(String name, String email, String pass) {
        this.name = name;
        this.email = email;
        this.pass = pass;

    }

   public void setname(String name){
        this.name=name;
   }

   public String getname() {
       return name;
   }
   
    public void setemail(String email){
        this.email=email;
   }

   public String getemail() {
       int endidx = email.indexOf("@");
       email = email.substring(0, endidx);
       return email;
   }
   
   public void setpass(String pass) {
       this.pass = pass;
   }
   
   public String getpass(){
        return pass;
   }

   public void displayinfo(){
          
   }

   public void updatenewpassword(String newpass){
    
   }

   public boolean checkpassword(String input) {
        return this.pass.equals(input);
   }

   public void addAccount() {
       try {
           myFile = new File("data/userdata.txt");
           myFile.createNewFile();
           fwrite = new FileWriter(myFile, true);
           fwrite.write(getname() + "\t");
           fwrite.write(getemail() + "\t");
           fwrite.write(getpass() + "\n");
           fwrite.flush();
           fwrite.close();

       } catch (IOException ioe) {
           ioe.printStackTrace();
       }
   }

   public boolean findAccount(String email) {
       int endidx = email.indexOf("@");
       email = email.substring(0, endidx);
       flag = false;
       try {
           myFile = new File("data/userdata.txt");
           sc = new Scanner(myFile);
           while (sc.hasNextLine()) {
               String line = sc.nextLine();
               String[] value = line.split("\t");
               if (value[1].equals(email)) {
                   flag = true;
                   return flag;
               }
           }
       }
       catch (IOException ioe) {
        ioe.printStackTrace();
       }
       return flag;
   }
   

}
