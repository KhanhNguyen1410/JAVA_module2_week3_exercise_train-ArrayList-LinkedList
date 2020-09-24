package service;

import java.util.List;

public interface IProductManager<T> {
    void add (T object);
    void update(T newObject, int id);
    void delete(int id);
    T showProduct ();
    List<T> findByName(String name);
    List<T> findAll();

}
