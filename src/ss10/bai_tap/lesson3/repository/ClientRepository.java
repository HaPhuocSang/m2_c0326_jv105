package ss10.bai_tap.lesson3.repository;

import ss10.bai_tap.lesson3.entity.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository implements IClientRepository{
    private final static List<Client> clients = new ArrayList<>();
    static {
        clients.add(new Client(1, "Client 1", "ĐN"));
        clients.add(new Client(2, "Client 2", "ĐN"));
        clients.add(new Client(3, "Client 3", "ĐN"));
    }
    @Override
    public List<Client> findAll() {
        return clients;
    }

    @Override
    public void add(Client newClient) {
        clients.add(newClient);
    }

    @Override
    public void edit(int index, Client newClient) {
        clients.set(index, newClient);
    }

    @Override
    public void delete(int index) {
        clients.remove(index);
    }
}
