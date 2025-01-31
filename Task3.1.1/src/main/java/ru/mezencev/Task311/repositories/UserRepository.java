package ru.mezencev.Task311.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mezencev.Task311.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
