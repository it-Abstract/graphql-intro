package it.abstractit.graphlib.model.dto;

public record ReviewDtoIn(
        Long bookId,
        Long userId,
        int rating,
        String comment) {
}
