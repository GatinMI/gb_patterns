package ru.gb.lesson_2.dry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<ru.gb.lesson_2.dry.User, Long> {

}
