package ss10.bai_tap.lesson4.service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();

    void add(T t);

    void edit(T t);

    void delete(String licensePlate);
}
