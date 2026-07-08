package case_study.controllers;

import case_study.untils.InputUtil;

public class CustomerController {
    public void displayMenu() {
        while (true) {
            System.out.println("""
                    ======== Customer Management =========
                     1. Display list customers
                     2. Add new customer
                     3. Edit customer
                     4. Return main menu
                    """);
            int choice = InputUtil.inputInt("------ Select function! ------");
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
}
