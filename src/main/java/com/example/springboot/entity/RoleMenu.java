package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 角色菜单关系表
 * </p>
 *
 * @author 李文凯
 * @since 2023-07-03
 */
@Getter
@Setter
  @TableName("sys_role_menu")
@ApiModel(value = "RoleMenu对象", description = "角色菜单关系表")
public class RoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("角色id")
        private Integer roleId;

      @ApiModelProperty("菜单id")
        private Integer menuId;


}
