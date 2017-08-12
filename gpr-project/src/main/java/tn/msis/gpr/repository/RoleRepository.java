package tn.msis.gpr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.msis.gpr.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
