package com.example.springboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    // 新增和修改
    @PostMapping
    public boolean save(@RequestBody User user) {
        return userService.saveUser(user);
    }

    // 查询所有数据
    @GetMapping
    public List<User> finAll() {
        return userService.list();
    }

    // 分页查询
    @GetMapping("/page")
    public IPage<User> finPage(@RequestParam Integer pageNum,
                               @RequestParam Integer pageSize,
                               @RequestParam(defaultValue = "") String username,
                               @RequestParam(defaultValue = "") String nickname,
                               @RequestParam(defaultValue = "") String address) {
        IPage<User> page = new Page<>(pageNum, pageSize);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (!"".equals(username)) {
            queryWrapper.like("username", username);
        }
        if (!"".equals(nickname)) {
            queryWrapper.like("nickname", nickname);
        }
        if (!"".equals(address)) {
            queryWrapper.like("address", address);
        }
        return userService.page(page, queryWrapper);

    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return userService.removeById(id);
    }

    @PostMapping("/del/batch")
    public boolean deleteBatch(@RequestBody List<Integer> ids){
        return  userService.removeBatchByIds(ids);
    }
}
