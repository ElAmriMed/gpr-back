package tn.msis.gpr.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.msis.gpr.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByFirstName(String username);

}
