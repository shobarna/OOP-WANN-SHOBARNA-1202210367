import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void printMenu(){
        System.out.println("=== Menu Program ===");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculation cal = new Calculation();
        boolean repeat = true;
        do{
            try {
                printMenu();
                System.out.print("Select menu : ");
                int menu = scanner.nextInt();
                System.out.println();
                switch (menu){
                    case 1 :
                        System.out.print("Enter the length of the side of the square : ");
                        double side = scanner.nextDouble();
                        cal.setSquare(side);
                        cal.run();
                        System.out.println();
                        System.out.println("The calculation result : " + cal.getSquare());
                        break;
                    case 2:
                        System.out.print("Enter the radius of the circle : ");
                        double rad = scanner.nextDouble();
                        cal.setCircle(rad);
                        cal.run();
                        System.out.println("The calculation result : " + cal.getCircle());
                        break;
                    case 3:
                        System.out.print("Insert the side of the base of the trapezoid : ");
                        double side_base = scanner.nextDouble();
                        System.out.print("Enter the upper side of the trapezoid : ");
                        double side_upper = scanner.nextDouble();
                        System.out.print("Enter the height of the trapezoid : ");
                        double height = scanner.nextDouble();
                        cal.setTrapezoid(side_base,side_upper,height);
                        cal.run();
                        System.out.println("The c   alculation result : " + cal.getTrapezoid());
                        break;
                    case 0:
                        System.out.println("=== Program ENDED ===");
                    default:
                        System.out.println("=== Option not Available ===");
                        continue;
                }
                repeat = false;

            }catch (InputMismatchException e){
                System.out.println("==== Error : Input must be a number ====");
                break;
            }catch (IllegalArgumentException e){
                e.printStackTrace();
            }
        }while (repeat);
    }
}