package it.abstractit.graphlib.repository;

import it.abstractit.graphlib.model.entity.GenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GenderRepository extends JpaRepository<GenderEntity, Long> {
    Optional<GenderEntity> findByBooks_Id(Long bookId);
}
