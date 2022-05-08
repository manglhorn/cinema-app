package mate.academy.spring.service;

import java.util.Optional;
import mate.academy.spring.model.User;

public interface UserService {
    User save(User user);

    Optional<User> findById(Long id);

    Optional<User> findByEmail(String email);
}
