package com.example.springboot.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "sys_user")
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String email;
    private String phone;
    private String address;
    private Date createTime;
    private String avatarUrl;
    private String role;

}
