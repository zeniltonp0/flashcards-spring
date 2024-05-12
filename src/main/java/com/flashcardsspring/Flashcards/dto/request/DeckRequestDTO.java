package com.flashcardsspring.Flashcards.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeckRequestDTO {
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    private UserIdRequestDTO userIdRequestDTO;
}
