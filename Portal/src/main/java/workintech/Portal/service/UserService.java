package workintech.Portal.service;

import org.springframework.stereotype.Service;
import workintech.Portal.entity.User;

import java.util.List;

@Service
public interface UserService {

    List<User> getAll();

    User findById(Long id);

    User saveUser(User user);

    User remove(Long id);



    User update(Long id, User updatedUser);
}
