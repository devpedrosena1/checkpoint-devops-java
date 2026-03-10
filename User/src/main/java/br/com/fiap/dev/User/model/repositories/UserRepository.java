package br.com.fiap.dev.User.model.repositories;

import br.com.fiap.dev.User.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
