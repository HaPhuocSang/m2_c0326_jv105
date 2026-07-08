package case_study.controllers;

import case_study.untils.InputUtil;

public class BookingController {
    public void displayMenu() {
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
            int choice = InputUtil.inputInt("------ Select function! ------");
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
}
