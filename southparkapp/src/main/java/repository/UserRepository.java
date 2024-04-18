package repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.southpark.domain.User;

public interface UserRepository extends JpaRepository<User, String>{

}
