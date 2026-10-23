//IT26102748 Mediwaka M.W.A.H.C.B.

import java.util.Scanner;

public class IT26102748Lab5Q3 {

    public static void main(String[] args) {

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {

            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int numberOfDays = endDate - startDate;

        double totalAmount = numberOfDays * ROOM_CHARGE;

        double discountRate = 0.0;

        if (numberOfDays >= 5) {
            discountRate = DISCOUNT_20;
        }
        else if (numberOfDays >= 3) {
            discountRate = DISCOUNT_10;
        }

        double discountAmount = totalAmount * discountRate;

        double finalAmount = totalAmount - discountAmount;

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + numberOfDays);
        System.out.println("Total Amount to be Paid: " + finalAmount);

        input.close();
    }
}
