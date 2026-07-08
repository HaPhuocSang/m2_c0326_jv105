package case_study.controllers;

import case_study.untils.InputUtil;

public class FuramaController {
    private final EmployeeController employeeController = new EmployeeController();
    private final CustomerController customerController = new CustomerController();
    private final FacilityController facilityController = new FacilityController();
    private final BookingController bookingController = new BookingController();
    private final PromotionController promotionController = new PromotionController();

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
            int choice = InputUtil.inputInt("------ Select function! ------");
            switch (choice) {
                case 1:
                    employeeController.displayMenu();
                    break;
                case 2:
                    customerController.displayMenu();
                    break;
                case 3:
                    facilityController.displayMenu();
                    break;
                case 4:
                    bookingController.displayMenu();
                    break;
                case 5:
                    promotionController.displayMenu();
                    break;
                case 6:
                    System.out.println("------ Exit Program! ------");
                    return;
                default:
                    System.out.println("------ This function is not available! ------");
            }
        }
    }
}
