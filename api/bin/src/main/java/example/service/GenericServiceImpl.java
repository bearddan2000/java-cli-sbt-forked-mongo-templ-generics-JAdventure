package example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import example.repository.*;

import java.util.List;

/**
 * @author ragcrix
 */
@Service
public class GenericServiceImpl<T> implements GenericService<T> {

  @Autowired
  private GenericRepository<T> genericRepository;

  @Override
  public List<T> findAll(Class<T> c) {
    return genericRepository.findAll(c);
  }

  @Override
  public T findByField(Class<T> c, String field, String value) {
    return genericRepository.findByField(c, field, value);
  }

}
