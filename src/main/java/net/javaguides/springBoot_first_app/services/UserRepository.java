package net.javaguides.springBoot_first_app.services;

import net.javaguides.springBoot_first_app.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
