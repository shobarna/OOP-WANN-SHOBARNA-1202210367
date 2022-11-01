package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
       Database db = new Database();
    
        // TODO Create Menu
        Menu mn = new Menu();
        mn.setName("bakso");
        mn.setPrice(20000);
        mn.setCategory("makanan");
        
        // TODO Insert Menu to Database
        db.setInsertmenu (mn);
        db.setShowmenu (mn);
        db.setSearchmenu (mn);


        // TODO Display Main Menu and User must be Register First

        // TODO Create User from register in Main Menu

        // TODO Display Menu

    }
}
