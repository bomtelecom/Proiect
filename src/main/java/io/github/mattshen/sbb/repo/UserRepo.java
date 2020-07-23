package io.github.mattshen.sbb.repo;

import java.util.List;

import io.github.mattshen.sbb.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

public interface UserRepo extends CrudRepository<User, Long> {
    List<User> findByName(String name);
}
