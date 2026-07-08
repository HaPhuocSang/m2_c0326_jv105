package ss10.bai_tap.lesson3.service;

import ss10.bai_tap.lesson3.entity.Client;
import ss10.bai_tap.lesson3.repository.ClientRepository;
import ss10.bai_tap.lesson3.repository.IClientRepository;

import java.util.ArrayList;
import java.util.List;

public class ClientService implements IClientService{
    private final IClientRepository clientRepository = new ClientRepository();
    private final List<Client> clients = clientRepository.findAll();

    @Override
    public List<Client> findAll() {
        return clients;
    }

    @Override
    public void add(Client newClient) {
        if (checkId(newClient.getId())) {
            System.out.println("------ Id đã tồn tại! ------");
            return;
        }
        clientRepository.add(newClient);
        System.out.println("------ Thêm thành công! ------");
    }

    @Override
    public void edit(Client newClient) {
        if (!checkId(newClient.getId())) {
            System.out.println("------ Id không tồn tại! ------");
            return;
        }
        clientRepository.edit(findIndex(newClient.getId()),newClient);
        System.out.println("------ Sửa thành công! ------");
    }

    @Override
    public void delete(int id) {
        if (!checkId(id)) {
            System.out.println("------ Id không tồn tại! ------");
            return;
        }
        clientRepository.delete(findIndex(id));
        System.out.println("------ Xóa thành công! ------");
    }

    public boolean checkId(int id) {
        for (Client client : clients) {
            if (client.getId() == id) {
                return true;
            }
        }
        return false;
    }
    public int findIndex(int id) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Client> searchByName(String keyword) {
        List<Client> result = new ArrayList<>();

        for (Client client : clientRepository.findAll()) {
            if (client.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(client);
            }
        }

        return result;
    }

}
