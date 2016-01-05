package repo;

import model.Beer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Janusz on 2015-12-13.
 */
@Repository
public interface TableRepository extends CrudRepository<Beer, Long> {
}