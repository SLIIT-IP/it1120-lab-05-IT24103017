import java.util.Scanner;

public class IT24103017Lab5Q3 {
    public static void main(String[] args) {
        final int ROOM_CHARGE_PER_DAY = 48000;
        final int DISCOUNT_3_TO_4_DAYS = 10;
        final int DISCOUNT_5_OR_MORE_DAYS = 20;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();
        
        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();
        
        // Validation 1: Start and end date must be between 1 and 31
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }
        
        // Validation 2: Start date should be less than end date
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than End Date");
            return;
        }
        
        // Calculate the number of days reserved
        int daysReserved = endDate - startDate;
        
        // Calculate the total cost
        int totalCost = daysReserved * ROOM_CHARGE_PER_DAY;
        double discount = 0;
        
        if (daysReserved >= 3 && daysReserved <= 4) {
            discount = DISCOUNT_3_TO_4_DAYS;
        } else if (daysReserved >= 5) {
            discount = DISCOUNT_5_OR_MORE_DAYS;
        }
        
        double discountAmount = (totalCost * discount) / 100;
        double totalAmount = totalCost - discountAmount;
        
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Room Charge per Day: Rs " + ROOM_CHARGE_PER_DAY + ".0/-");
        System.out.println("Total Amount to be Paid: Rs " + totalAmount + ".0/-");
    }
}
