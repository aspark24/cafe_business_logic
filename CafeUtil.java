import java.util.ArrayList;
import java.util.Arrays;


public class CafeUtil {
    public int getStreakGoal() {
        int numWeeks = 10;
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }
        public double getOrderTotal(double[] prices) {
        double sum = 0.0;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menu) {
    for (int i = 0; i < menu.size(); i++) {
        System.out.println(i + " " + menu.get(i));
    }
}
    public void addCustomer(ArrayList<String> customers) {
    System.out.println("Please enter your name:");
    String userName = System.console().readLine();
    System.out.println("Hello, " + userName + "!");
    int position = customers.size();
    System.out.println("There are " + position + " people in front of you.");
    customers.add(userName);
    System.out.println(customers);
}
}
