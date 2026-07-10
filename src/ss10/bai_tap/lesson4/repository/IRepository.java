package ss10.bai_tap.lesson4.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();

    void add(T t);

    void edit(int index,T t);

    void delete(int index);
}
