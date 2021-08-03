package com.correia.personapi.enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;

    PhoneType(String descricao) {
        this.description = descricao;
    }
}
