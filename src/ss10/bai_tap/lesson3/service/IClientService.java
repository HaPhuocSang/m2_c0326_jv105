package ss10.bai_tap.lesson3.service;

import ss10.bai_tap.lesson3.entity.Client;

import java.util.List;

public interface IClientService {
    List<Client> findAll();

    void add(Client newClient);

    void edit(Client newClient);

    void delete(int id);

    List<Client> searchByName(String keyword);
}
