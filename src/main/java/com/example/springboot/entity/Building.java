package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author 李文凯
 * @since 2023-07-03
 */
@Getter
@Setter
  @ApiModel(value = "Building对象", description = "")
public class Building implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("楼栋")
      private String label;

      @ApiModelProperty("单元")
      private String value;

      @ApiModelProperty("父级id")
      private Integer pid;


}
