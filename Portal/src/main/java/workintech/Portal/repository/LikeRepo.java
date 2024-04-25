package workintech.Portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import workintech.Portal.entity.Like;

public interface LikeRepo extends JpaRepository<Like, Long> {
}
