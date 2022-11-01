package MODUL1;

public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String nama;
    Integer nohandphone;

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void setName(String nama){
        this.nama = nama;
    }
    public void setNo(Integer nohandphone){
        this.nohandphone = nohandphone;
        System.out.println("Register berhasil");
    }
   

}
