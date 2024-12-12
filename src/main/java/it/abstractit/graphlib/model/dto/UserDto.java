package it.abstractit.graphlib.model.dto;

import java.util.Date;

public record UserDto(
        Long id,
        String name,
        String email,
        Date registrationDate) {
}
