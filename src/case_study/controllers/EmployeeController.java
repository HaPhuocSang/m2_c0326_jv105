package case_study.controllers;

import case_study.untils.InputUtil;

public class EmployeeController {
    public void displayMenu() {
        while (true) {
            System.out.println("""
                    ======== Employee Management =========
                     1. Display list employees
                     2. Add new employee
                     3. Edit employee
                     4. Return main menu
                    """);
            int choice = InputUtil.inputInt("------ Select function! ------");
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
}
