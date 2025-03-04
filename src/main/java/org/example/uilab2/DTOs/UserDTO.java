package org.example.uilab2.DTOs;

import lombok.*;

@Getter
@Setter
public class UserDTO {
    private Long id;
    private String name;
    private String email;

    public UserDTO(){}

    public UserDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

}
