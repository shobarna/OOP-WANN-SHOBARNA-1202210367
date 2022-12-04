public class Perangkat {

    protected String drive;
    protected int ram;
    protected float processor;

    Perangkat(String drive,int ram,float processor)
    {
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    } 

    void informasi(){
        System.out.println("Perangkat tidak di ketahui memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+"Ghz");
    }
    
}
