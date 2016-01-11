package repo;

import model.Content;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Janusz on 2016-01-08.
 */
public interface UserRepository extends JpaRepository<Content, String> {
}
