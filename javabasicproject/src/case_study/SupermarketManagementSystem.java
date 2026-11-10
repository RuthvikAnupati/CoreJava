package case_study;

import java.util.Scanner;

public class SupermarketManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, productNo, quantity;

        double price = 0;
        double total = 0;
        double discount = 0;
        double finalAmount = 0;

        String product = "";

        while (true) {

            System.out.println("\n===== ABC SUPERMARKET =====");
            System.out.println("1. Display Products");
            System.out.println("2. Add Product");
            System.out.println("3. Calculate Bill");
            System.out.println("4. Apply Discount");
            System.out.println("5. Display Final Amount");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- PRODUCTS ---");
                    System.out.println("1. Rice       - 3000");
                    System.out.println("2. Oil        - 1500");
                    System.out.println("3. Sugar      - 800");
                    System.out.println("4. Wheat      - 1200");
                    System.out.println("5. Milk       - 500");
                    System.out.println("6. Biscuits   - 300");
                    System.out.println("7. Soap       - 400");
                    System.out.println("8. Shampoo    - 600");
                    System.out.println("9. Dry Fruits - 2000");
                    System.out.println("10. Tea Powder - 700");
                    break;
                    
                case 2:

                    while (true) {

                        System.out.println("Enter product number (0 to stop): ");
                        productNo = sc.nextInt();

                        if (productNo == 0) {
                            break;
                        }

                        System.out.println("Enter quantity: ");
                        quantity = sc.nextInt();

                        switch (productNo) {

                            case 1:
                                product = "Rice";
                                price = 3000;
                                break;

                            case 2:
                                product = "Oil";
                                price = 1500;
                                break;

                            case 3:
                                product = "Sugar";
                                price = 800;
                                break;

                            case 4:
                                product = "Wheat";
                                price = 1200;
                                break;

                            case 5:
                                product = "Milk";
                                price = 500;
                                break;

                            case 6:
                                product = "Biscuits";
                                price = 300;
                                break;

                            case 7:
                                product = "Soap";
                                price = 400;
                                break;

                            case 8:
                                product = "Shampoo";
                                price = 600;
                                break;

                            case 9:
                                product = "Dry Fruits";
                                price = 2000;
                                break;

                            case 10:
                                product = "Tea Powder";
                                price = 700;
                                break;

                            default:
                                System.out.println("Invalid Product!");
                                continue;
                        }

                        total = total + (price * quantity);

                        System.out.println(product + " added successfully!");
                    }

                    break;

                case 3:

                    System.out.println("Total Bill = Rs." + total);
                    break;

                case 4:

                    if (total > 10000) {
                        discount = total * 15 / 100;
                    } else {
                        discount = 0;
                    }

                    System.out.println("Discount = Rs." + discount);
                    break;

                case 5:

                    if (total > 10000) {
                        discount = total * 15 / 100;
                    } else {
                        discount = 0;
                    }

                    finalAmount = total - discount;

                    System.out.println("\n===== FINAL BILL =====");
                    System.out.println("Total Amount = Rs." + total);
                    System.out.println("Discount = Rs." + discount);
                    System.out.println("Final Amount = Rs." + finalAmount);
                    System.out.println("======================");

                    break;

                case 6:
                    System.out.println("Thank You! Visit Again.");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
            sc.close();
        }
    }
}
