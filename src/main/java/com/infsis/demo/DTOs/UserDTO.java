package com.infsis.demo.DTOs;

import java.time.LocalDateTime;

public class UserDTO {
    private Integer id;
    private String name;
    private String email;

    public UserDTO( String name, String email) {

        this.name = name;
        this.email = email;
    }

    public UserDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
