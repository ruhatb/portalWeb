package workintech.Portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import workintech.Portal.entity.User;
import workintech.Portal.repository.UserRepo;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private  UserRepo userRepo;
    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public User findById(Long id) {
        Optional<User> optionalUser = userRepo.findById(id);
        return optionalUser.orElse(null);
    }

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }


    @Override
    public  User remove(Long id) {
        Optional<User> optionalUser = userRepo.findById(id);
        if (optionalUser.isPresent()) {
            userRepo.deleteById(id);
        } else {
            System.out.println("Not found id.");
        }
        return null;
    }



    @Override
    public User update(Long id, User updatedUser) {
     {
            Optional<User> optionalUser = userRepo.findById(id);
            if (optionalUser.isPresent()) {
                User existingUser = optionalUser.get();
                existingUser.setUsername(updatedUser.getUsername());
                existingUser.setMail(updatedUser.getMail());
                // Diğer alanları da buraya ekleyebilirsiniz
                return userRepo.save(existingUser);
            } else return null;
    }


    }




}
