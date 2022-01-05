package example.repository;

import java.util.List;

/***
  Using generics to simplify our pattern
*/
public interface GenericRepository<T>{

    List<T> findAll(Class<T> c);

    T findByField(Class<T> c, String field, String value);

}
