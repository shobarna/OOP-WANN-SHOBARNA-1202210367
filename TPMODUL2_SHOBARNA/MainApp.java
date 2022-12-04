public class MainApp {

    public static void main(String[] args) {
        
        Perangkat perangkat = new Perangkat("Adata", 16, 2);
        System.out.println("");
        perangkat.informasi();
        System.out.println("");

        Laptop laptop = new Laptop("Seagate", 8, (float)3.2,false);
        laptop.informasi();
        laptop.bukaGame("Dota 2");
        laptop.kirimEmail("niceyuk@gmail.com");
        laptop.kirimEmail("aanarji@gmail.com", "rusmangc@gmail.com");
        System.out.println("");

        Handphone handphone = new Handphone("Sandisk", 4, 2,true);
        handphone.informasi();
        handphone.telfon((int)628122122);
        handphone.kirimSMS(62852112);
        handphone.kirimSMS(628512121,629292211);
        System.out.println("");



        
    
    }
    
}
