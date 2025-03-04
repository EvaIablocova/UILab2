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

//    public UserDTO(User user) {
//        this.name = user.getName();
//        this.email = user.getEmail();
//    }

//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }


}
