package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Vacation;

@Repository
public interface VacationRepository extends JpaRepository<Vacation, Long>{

}
