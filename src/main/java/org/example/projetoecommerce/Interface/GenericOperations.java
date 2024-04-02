package org.example.projetoecommerce.Interface;

import java.util.List;

public interface GenericOperations <T, N>{
    T create(T entity);

    List<T> read();

    T read(N id);

    T update(N id, T entity);

    void delete(N id);

}
