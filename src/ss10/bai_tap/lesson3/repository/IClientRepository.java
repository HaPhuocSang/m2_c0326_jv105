package ss10.bai_tap.lesson3.repository;

import ss10.bai_tap.lesson3.entity.Client;

import java.util.List;

public interface IClientRepository {
    List<Client> findAll();

    void add(Client newClient);

    void edit(int index, Client newClient);

    void delete(int index);
}
