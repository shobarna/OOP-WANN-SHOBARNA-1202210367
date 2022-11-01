package MODUL1;

import java.util.List;
import javax.sound.sampled.SourceDataLine;
import javax.swing.event.SwingPropertyChangeSupport;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    public class List{

        String insert;
        String show;
        String search;
    }
    // TODO Create Method to Insert Menu to Database
    public void setInsertmenu(String insert){
        this.insert = insert;
    }
    // TODO Create Method to Show Menu from Database
    public void setShowmenu(String show){
        this.show = show;    
    }
    // TODO Create Method to Search Menu from Database
    public void setSearchmenu(String search){
        this.search = search;       
    }
    
}
