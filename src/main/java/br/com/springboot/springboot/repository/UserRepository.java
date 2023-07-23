package br.com.springboot.springboot.repository;

import br.com.springboot.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    public List<User> findByIdGreaterThan(Long id);

    public List<User> findByNameIgnoreCase(String name);
}
