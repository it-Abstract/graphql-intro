package it.abstractit.graphlib.model.dto;

import java.util.Date;

public record ReviewDto(
        Long id,
        String comment,
        int rating,
        Date reviewDate,
        UserDto user) {
}
