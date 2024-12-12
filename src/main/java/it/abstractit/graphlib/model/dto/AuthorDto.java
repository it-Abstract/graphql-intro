package it.abstractit.graphlib.model.dto;

import java.util.Date;

public record AuthorDto(
        Long id,
        String name,
        String biography,
        Date birthDate
) {
}
