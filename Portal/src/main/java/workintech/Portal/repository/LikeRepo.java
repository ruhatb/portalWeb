package workintech.Portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import workintech.Portal.entity.Like_Table;

public interface LikeRepo extends JpaRepository<Like_Table, Long> {
}
