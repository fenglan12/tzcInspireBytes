package io.github.fenglan12.tzcinspirebytes.model.request;

import lombok.Data;

@Data
public class UserLoginRequest {
    private String username;
    private String password;
}
