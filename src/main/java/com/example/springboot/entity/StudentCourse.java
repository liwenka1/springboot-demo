package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
  @TableName("student_course")
@ApiModel(value = "StudentCourse对象", description = "")
public class StudentCourse implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer studentId;

      private Integer courseId;


}
