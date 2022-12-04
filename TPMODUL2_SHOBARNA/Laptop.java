public class Laptop extends Handphone {
    protected boolean webcam;

    Laptop(String drive, int ram, float processor,boolean webcam){
        super(drive, ram, processor, webcam);
        this.webcam = webcam;
    }



    void informasi(){
        if(this.webcam == true){
            System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+"Ghz. Selain itu Laptop ini memiliki Webcam");
        }else{
            System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+"Ghz. Selain itu Laptop ini TIDAK memiliki Webcam");
        }

    }

    void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game "+nama_game);
    }

    void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke "+email);
    }

    void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke "+email1+" dan ke "+email2);
    }
}
