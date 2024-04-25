package workintech.Portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import workintech.Portal.entity.Comment;

public interface CommnetRepo extends JpaRepository<Comment,Long> {
}
