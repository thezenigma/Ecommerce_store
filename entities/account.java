package entities;

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

    public account(String email, String pass) {
        this.email = email;
        this.pass = pass;
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
       if (email == null) {
           return "";
        }
        int endidx = email.indexOf("@");
        if (endidx == -1) {
            // No '@' found, return the whole email
            return email;
        }
        return email.substring(0, endidx);
   }
   
   public void setpass(String pass) {
       this.pass = pass;
   }
   
   public String getpass() {
       return pass;
   }
   
   public void updateEmail(String username, String email) {
        try {
            File myFile = new File("./data/userdata.txt");
            Scanner sc = new Scanner(myFile);

            String content = "";

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                if (!line.isEmpty()) {
                    String[] parts = line.split("\t");

                    if (parts[0].equals(username)){
                        parts[1] = email;
                        this.email = email;
                        line = parts[0] + "\t" + parts[1] + "\t" + parts[2];
                    }
                }

                content += line + "\n"; 
            }

            FileWriter fw = new FileWriter(myFile, false); 
            fw.write(content);
            fw.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

   public void updateName(String email, String username) {
        try {
            File myFile = new File("./data/userdata.txt");
            Scanner sc = new Scanner(myFile);

            String content = "";

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                if (!line.isEmpty()) {
                    String[] parts = line.split("\t");

                    if (parts[1].equals(email)) {
                        parts[0] = username;
                        this.name = username;
                        line = parts[0] + "\t" + parts[1] + "\t" + parts[2];
                    }
                }

                content += line + "\n"; 
            }

            FileWriter fw = new FileWriter(myFile, false); 
            fw.write(content);
            fw.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }


    public void updatePassword(String username, String newpass) {
        try {
            File myFile = new File("./data/userdata.txt");
            Scanner sc = new Scanner(myFile);

            String content = "";

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                if (!line.isEmpty()) {
                    String[] parts = line.split("\t");

                    if (parts[0].equals(username)) {
                        parts[2] = newpass;
                        this.pass = newpass;
                        line = parts[0] + "\t" + parts[1] + "\t" + parts[2];
                    }
                }
                content += line + "\n";
            }
            FileWriter fw = new FileWriter(myFile, false);
            fw.write(content);
            fw.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
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
   
   public boolean checkCredentials(String input, String pass) {
       boolean flag = false;

       try {
           File myFile = new File("data/userdata.txt");
           Scanner sc = new Scanner(myFile);

           while (sc.hasNextLine()) {
               String line = sc.nextLine();

               if (!line.isEmpty()) {
                   String[] parts = line.split("\t");

                   String fileEmail = parts[1];
                   String filePass = parts[2];

                   fileEmail += "@gmail.com";

                   if (input.equals(fileEmail) && pass.equals(filePass)) {
                       flag = true;
                       break;
                   }
               }
           }
           sc.close();
       } catch (IOException ex) {
           ex.printStackTrace();
       }

       return flag;
   }

   public void findName(String email) {
       try {
           myFile = new File("./data/userdata.txt");
           Scanner sc = new Scanner(myFile);
           while (sc.hasNextLine()) {
               String line = sc.nextLine();
               if (!line.isEmpty()) {
                   String[] parts = line.split("\t");
                   if (parts[2].equals(email)) {
                       this.name = parts[1];
                   }
               }
           }

       } catch (IOException ioe) {
           ioe.printStackTrace();
       }
   }


   //////////////////////////////////////
     private void updateField(String matchEmail, int fieldIndex, String newValue) {
        try {
            File file = new File("data/userdata.txt");
            Scanner sc = new Scanner(file);
            StringBuilder content = new StringBuilder();

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split("\t");
                if (parts.length >= 3 && parts[1].equals(matchEmail)) {
                    parts[fieldIndex] = newValue;
                    line = String.join("\t", parts);
                }
                content.append(line).append("\n");
            }

            FileWriter fw = new FileWriter(file, false);
            fw.write(content.toString());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadAccount() {
        try (Scanner sc = new Scanner(new File("data/userdata.txt"))) {
            while (sc.hasNextLine()) {
                String[] parts = sc.nextLine().split("\t");
                if (parts.length >= 3 && parts[1].equals(this.email)) {
                    this.name = parts[0];
                    this.pass = parts[2];
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
   


   
   


