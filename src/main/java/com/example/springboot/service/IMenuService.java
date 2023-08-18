package com.example.springboot.service;

import com.example.springboot.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 李文凯
 * @since 2023-07-03
 */
public interface IMenuService extends IService<Menu> {

    List<Menu> findMenus(String name);

}
