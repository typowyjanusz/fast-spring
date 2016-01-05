package repo;

import model.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Janusz on 2016-01-04.
 */
@Repository
public interface GunwoRepository extends CrudRepository<Task,Long>{

    public List<Task> findByDone(Boolean done);

    @Query("select t from Task t where t.id = ?")
    public List<Task> findByIdn(long search);


}
