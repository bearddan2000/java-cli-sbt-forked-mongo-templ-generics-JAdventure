package example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Criteria;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class GenericRepositoryImpl<T> implements GenericRepository<T>{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<T> findAll(Class<T> claz) {
      Query query = new Query();
//      query.fields().include("name");
      List<T> list = mongoTemplate.find(query, claz);

      return list;
    }

    @Override
    public T findByField(Class<T> claz, String field, String value) {
      Query query = new Query();
      query.addCriteria(
          new Criteria().andOperator(
              Criteria.where(field).is(value)
          )
      );
      List<T> list = mongoTemplate.find(query, claz);

      return list.get(0);
    }
}
