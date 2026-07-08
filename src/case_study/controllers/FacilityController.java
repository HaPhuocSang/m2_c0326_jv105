package case_study.controllers;

import case_study.untils.InputUtil;

public class FacilityController {
    public void displayMenu() {
        while (true) {
            System.out.println("""
                    ======== Facility Management =========
                     1. Display list facility
                     2. Add new facility
                     3. Display list facility maintenance
                     4. Return main menu
                    """);
            int choice = InputUtil.inputInt("------ Select function! ------");
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
}
