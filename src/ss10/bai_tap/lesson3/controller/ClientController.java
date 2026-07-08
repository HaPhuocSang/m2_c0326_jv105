package ss10.bai_tap.lesson3.controller;

import ss10.bai_tap.lesson3.entity.Client;
import ss10.bai_tap.lesson3.service.ClientService;
import ss10.bai_tap.lesson3.service.IClientService;
import ss10.bai_tap.lesson3.untils.InputUntil;
import ss10.bai_tap.lesson3.view.ClientView;

import java.util.List;

public class ClientController {
    private final IClientService clientService = new ClientService();
    private final int DISPLAYLIST = 1;
    private final int ADD = 2;
    private final int EDIT = 3;
    private final int DELETE = 4;
    private final int SEARCH = 5;
    private final int EXIT = 6;

    public void showMenu() {
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("""
                    ======== Quản lý sinh khách hàng =========
                         1. Danh sách
                         2. Thêm mới
                         3. Sửa
                         4. Xoá
                         5. Tìm kiếm
                         6. Thoát
                    """);
            int choice = InputUntil.inputInt("------ Chọn chức năng ------");
            switch (choice) {
                case DISPLAYLIST:
                    List<Client> clients = clientService.findAll();
                    ClientView.displayList(clients);
                    break;
                case ADD:
                    clientService.add(ClientView.inputNewData());
                    break;
                case EDIT:
                    clientService.edit(ClientView.editData());
                    break;
                case DELETE:
                    clientService.delete(ClientView.deleteData());
                    break;
                case SEARCH:
                    String keyword = ClientView.searchName();
                    ClientView.displayList(clientService.searchByName(keyword));
                    break;
                case EXIT:
                    isContinue = false;
                    break;
                default:
                    System.out.println("------ Không có chức năng này! ------");
            }
        }
    }
}
