package ss10.bai_tap.lesson3;


import ss10.bai_tap.lesson3.controller.ClientController;

public class RunApp {
    public static void main(String[] args) {
        ClientController clientController = new ClientController();
        clientController.showMenu();
    }
}
