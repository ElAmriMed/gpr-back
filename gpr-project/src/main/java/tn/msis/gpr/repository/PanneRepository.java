package tn.msis.gpr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.msis.gpr.domain.Panne;

public interface PanneRepository extends JpaRepository<Panne, Integer> {
	//
}
