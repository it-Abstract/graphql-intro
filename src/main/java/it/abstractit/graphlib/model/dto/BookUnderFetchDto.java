package it.abstractit.graphlib.model.dto;

import java.util.Date;

public record BookUnderFetchDto(
        Long id,
        String title,
        Date publicationDate,
        Double price,
        GenderDto gender) {
}
