package com.igorpimentelgameiro.payment_system.dto;

import com.igorpimentelgameiro.payment_system.entity.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UserRequest(

        @NotNull(message= "O nome não pode ser nulo")
        @NotBlank(message = "O nome não pode ser vazio")
        String name,

        @NotNull(message= "O nome não pode ser nulo")
        @NotBlank(message = "O nome não pode ser vazio")
        String email,

        @NotNull(message= "O nome não pode ser nulo")
        @NotBlank(message = "O nome não pode ser vazio")
        @Size(min = 8, message = "A senha deve conter no minimo 8 caracteres")
        String password) {

    public User toModel(){
        return new User (name, email, password);
    }
}
