package workintech.Portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import workintech.Portal.entity.Post;

public interface PostRepo extends JpaRepository<Post, Long> {
}
