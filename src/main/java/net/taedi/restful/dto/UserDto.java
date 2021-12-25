package net.taedi.restful.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String id;
    private String email;
    private String password;

    private String auth;
}