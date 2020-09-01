
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       Scanner user = new Scanner(System.in);

       int hotdogCount;
       int drinkCount;
       double hotdogPrice = 1.50;
       double drinkPrice = 1.00;
       double total = 0;
       double payment = 0;

        System.out.println("Welcome! How many hotdogs would you like today?");
        hotdogCount = Integer.parseInt(user.next());
        total += hotdogCount * hotdogPrice;

        System.out.println("Would you like any drinks to go along with that?");
        drinkCount = Integer.parseInt(user.next());
        total += drinkCount * drinkPrice;

        System.out.println("Your total comes to $" + total);
        System.out.println("How would you like to pay?");
        payment = Double.parseDouble(user.next());

        if(payment>total){
            System.out.println("Your change will be " + (payment - total));
        }

        else if(payment==total){
            System.out.println("Perfect amount!");
        }

        else{
            System.out.println("Oops! That is not enough. You still need to pay " + (total - payment));
        }

        System.out.println("Thank you for coming!");
    }
}
