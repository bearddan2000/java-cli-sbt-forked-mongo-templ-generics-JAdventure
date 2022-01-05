package example.service;

import java.util.List;

/**
 * @author regcrix
 */
public interface GenericService<T> {

    List<T> findAll(Class<T> c);

    T findByField(Class<T> c, String field, String value);

}
