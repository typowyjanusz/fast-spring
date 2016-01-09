package repo;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Janusz on 2016-01-08.
 */
public interface UserRepository extends JpaRepository<User, String> {
}
