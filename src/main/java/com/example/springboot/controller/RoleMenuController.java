package com.example.springboot.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springboot.common.Result;

import com.example.springboot.service.IRoleMenuService;
import com.example.springboot.entity.RoleMenu;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 角色菜单关系表 前端控制器
 * </p>
 *
 * @author 李文凯
 * @since 2023-07-03
 */
@RestController
@RequestMapping("/role-menu")
public class RoleMenuController {

    @Resource
    private IRoleMenuService roleMenuService;

    // 新增或者更新
    @PostMapping
    public Result save(@RequestBody RoleMenu roleMenu) {
        roleMenuService.saveOrUpdate(roleMenu);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        roleMenuService.removeById(id);
        return Result.success();
    }

    @PostMapping("/del/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        roleMenuService.removeByIds(ids);
        return Result.success();
    }

    @GetMapping
    public Result findAll() {
        return Result.success(roleMenuService.list());
    }

    @GetMapping("/{id}")
    public Result findOne(@PathVariable Integer id) {
        return Result.success(roleMenuService.getById(id));
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam Integer pageNum,
                                @RequestParam Integer pageSize) {
        QueryWrapper<RoleMenu> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        return Result.success(roleMenuService.page(new Page<>(pageNum, pageSize), queryWrapper));
    }

}

