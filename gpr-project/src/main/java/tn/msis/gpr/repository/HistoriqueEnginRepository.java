package tn.msis.gpr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.msis.gpr.domain.HistoriqueEngin;

public interface HistoriqueEnginRepository extends JpaRepository<HistoriqueEngin, Long> {

	public List<HistoriqueEngin> findByEngin(final String refEngin);

}
