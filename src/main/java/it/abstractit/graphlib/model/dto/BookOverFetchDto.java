package it.abstractit.graphlib.model.dto;

import java.util.Date;
import java.util.List;

public record BookOverFetchDto(
        Long id,
        String title,
        Date publicationDate,
        Double price,
        GenderDto gender,
        List<AuthorDto> authors,
        List<ReviewDto> reviews
) {
}
