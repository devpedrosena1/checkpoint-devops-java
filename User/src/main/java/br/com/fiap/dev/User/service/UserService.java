package br.com.fiap.dev.User.service;

import br.com.fiap.dev.User.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User create(User user);
    List<User> findAll();
    Optional<User> findById(Long id);
    User update(Long id, User user);
    void delete(Long id);

}
