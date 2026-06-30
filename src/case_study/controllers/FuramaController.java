package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    private Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        while (true) {
            System.out.println("""
                    ======== Furama Management =========
                     1. Employee Management
                     2. Customer Management
                     3. Facility Management
                     4. Booking Management
                     5. Promotion Management
                     6. Exit
                    """);
            int choice = inputInt(scanner, "------ Select function! ------");
            switch (choice) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.out.println("------ Exit Program! ------");
                    return;
                default:
                    System.out.println("------ This function is not available! ------");
            }
        }
    }

    public void employeeManagement() {
        while (true) {
            System.out.println("""
                    ======== Employee Management =========
                     1. Display list employees
                     2. Add new employee
                     3. Edit employee
                     4. Return main menu
                    """);
            int choice = inputInt(scanner, "------ Select function! ------");
            switch (choice) {
                case 1:
                    System.out.println("------ Display list employees! ------");
                    break;
                case 2:
                    System.out.println("------ Add new employee! ------");
                    break;
                case 3:
                    System.out.println("------ Edit employee! ------");
                    break;
                case 4:
                    System.out.println("------ Return main menu! ------");
                    return;
                default:
                    System.out.println("------ This function is not available! ------");
            }
        }
    }

    public void customerManagement() {
        while (true) {
            System.out.println("""
                    ======== Customer Management =========
                     1. Display list customers
                     2. Add new customer
                     3. Edit customer
                     4. Return main menu
                    """);
            int choice = inputInt(scanner, "------ Select function! ------");
            switch (choice) {
                case 1:
                    System.out.println("------ Display list customers! ------");
                    break;
                case 2:
                    System.out.println("------ Add new customer! ------");
                    break;
                case 3:
                    System.out.println("------ Edit customer! ------");
                    break;
                case 4:
                    System.out.println("------ Return main menu! ------");
                    return;
                default:
                    System.out.println("------ This function is not available! ------");
            }
        }
    }

    public void facilityManagement() {
        while (true) {
            System.out.println("""
                    ======== Facility Management =========
                     1. Display list facility
                     2. Add new facility
                     3. Display list facility maintenance
                     4. Return main menu
                    """);
            int choice = inputInt(scanner, "------ Select function! ------");
            switch (choice) {
                case 1:
                    System.out.println("------ Display list facility! ------");
                    break;
                case 2:
                    System.out.println("------ Add new facility! ------");
                    break;
                case 3:
                    System.out.println("------ Display list facility maintenance! ------");
                    break;
                case 4:
                    System.out.println("------ Return main menu! ------");
                    return;
                default:
                    System.out.println("------ This function is not available! ------");
            }
        }
    }

    public void bookingManagement() {
        while (true) {
            System.out.println("""
                    ======== Booking Management =========
                     1. Add new booking
                     2. Display list booking
                     3. Create new contracts
                     4. Display list contracts
                     5. Edit contracts
                     6. Return main menu
                    """);
            int choice = inputInt(scanner, "------ Select function! ------");
            switch (choice) {
                case 1:
                    System.out.println("------ Add new booking! ------");
                    break;
                case 2:
                    System.out.println("------ Display list booking! ------");
                    break;
                case 3:
                    System.out.println("------ Create new contracts! ------");
                    break;
                case 4:
                    System.out.println("------ Display list contracts! ------");
                    break;
                case 5:
                    System.out.println("------ Edit contracts! ------");
                    break;
                case 6:
                    System.out.println("------ Return main menu! ------");
                    return;
                default:
                    System.out.println("------ This function is not available! ------");
            }
        }
    }

    public void promotionManagement() {
        while (true) {
            System.out.println("""
                    ======== Promotion Management =========
                     1. Display list customers use service
                     2. Display list customers get voucher
                     3. Return main menu
                    """);
            int choice = inputInt(scanner, "------ Select function! ------");
            switch (choice) {
                case 1:
                    System.out.println("------ Display list customers use service! ------");
                    break;
                case 2:
                    System.out.println("------ Display list customers get voucher! ------");
                    break;
                case 3:
                    System.out.println("------ Return main menu! ------");
                    return;
                default:
                    System.out.println("------ This function is not available! ------");
            }
        }
    }

    public int inputInt(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.println(message);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer!");
            }
        }
    }

    public String inputString(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            String value = scanner.nextLine().trim();
            if (!value.isEmpty()) {
                return value;
            }
            System.out.println("Do not leave it blank, please re-enter!");
        }
    }
}
