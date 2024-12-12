package it.abstractit.graphlib.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "author")
@Getter
@Setter
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Lob
    private String biography;

    private Date birthDate;

    @ManyToMany(mappedBy = "authors", fetch = FetchType.LAZY)
    private List<BookEntity> books;

}
