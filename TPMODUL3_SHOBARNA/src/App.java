import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Restaurant machine = new Restaurant();
        int customerId, orderQty;
        try {
            System.out.print("Enter Customer ID : ");
            customerId = input.nextInt();
            System.out.print("Enter how much order to made : ");
            orderQty = input.nextInt();

            Thread t1 = new Thread(machine);
            Waiters waiter = new Waiters(orderQty, customerId);
            Thread t2 = new Thread(waiter);

            t1.start();
            t2.start();
            t1.join();
            t2.join();

            input.close();
        } 
        catch (Exception e) {
            System.out.println("Input must be Integer or Number");
        }
    }
}
