public class Waiters implements Runnable{
    
    private final int orderQty;
    private final int customerId;
    static int foodPrice = 25000;

    public Waiters(int orderQty, int customerId){
        this.orderQty = orderQty;
        this.customerId = customerId;
    }
    
    public void run(){
        while(true){
            getFood();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void getFood(){
        synchronized(Restaurant.getLock()){
            System.out.println("Waiter : Food is ready to deliver");
            Restaurant rst = new Restaurant();
            rst.setWaitingForPickup(false);

            if(Restaurant.getFoodNumber() == this.orderQty + 1){
                OrderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter : Tell the Restaurant to make another food\n");
        }
    }

    public void OrderInfo(){
System.out.println("=================================================================");
        System.out.println("Customer with ID    : "+this.customerId);
        System.out.println("Number of Order     : "+this.orderQty);
        System.out.println("Total Price         : "+this.orderQty*foodPrice);
System.out.println("=================================================================");
    }
}
