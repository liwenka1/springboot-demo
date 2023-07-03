package com.example.springboot.controller.dto;

import lombok.Data;
import com.example.springboot.entity.Menu;

import java.util.List;

@Data
public class UserDTO {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String avatarUrl;
    private String token;
    private String role;
    private List<Menu> menus;
}
