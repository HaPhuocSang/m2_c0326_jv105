package case_study.controllers;

import case_study.untils.InputUtil;

public class PromotionController {
    public void displayMenu() {
        while (true) {
            System.out.println("""
                    ======== Promotion Management =========
                     1. Display list customers use service
                     2. Display list customers get voucher
                     3. Return main menu
                    """);
            int choice = InputUtil.inputInt("------ Select function! ------");
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
}
