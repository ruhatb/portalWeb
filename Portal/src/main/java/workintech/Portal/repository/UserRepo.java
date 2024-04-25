package workintech.Portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import workintech.Portal.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
}
