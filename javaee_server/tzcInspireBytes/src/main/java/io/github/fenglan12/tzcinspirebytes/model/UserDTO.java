package io.github.fenglan12.tzcinspirebytes.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {
    private int id;
    private String nickname;
    private String username;
    private String role;

    public UserDTO(int id, String nickname, String username, String role) {
        this.id = id;
        this.nickname = nickname;
        this.username = username;
        this.role = role;
    }

}
