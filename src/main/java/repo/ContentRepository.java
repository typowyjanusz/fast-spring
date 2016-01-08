package repo;

import model.Content;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Janusz on 2016-01-07.
 */
@Repository
public interface ContentRepository extends CrudRepository<Content, Integer> {


    @Query("select t.object from Content t where t.idc = ?")
    public List<Content> findByCont(int search);

}
