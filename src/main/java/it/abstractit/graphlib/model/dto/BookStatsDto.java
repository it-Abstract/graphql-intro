package it.abstractit.graphlib.model.dto;

import java.util.List;

public record BookStatsDto(
        Long id,
        double rating,
        List<String> topComments
) {
}
