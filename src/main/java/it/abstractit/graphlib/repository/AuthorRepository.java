package it.abstractit.graphlib.repository;

import it.abstractit.graphlib.model.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
    List<AuthorEntity> findAuthorsByBooksId(Long bookId);
}
