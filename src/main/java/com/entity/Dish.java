package com.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 菜品
 */
@Data
@ApiModel("菜品")
public class Dish implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    private Long id;


    @ApiModelProperty("菜品名称")
    private String name;


    @ApiModelProperty("菜品分类id")
    private Long categoryId;


    @ApiModelProperty("菜品价格")
    private BigDecimal price;


    @ApiModelProperty("商品码")
    private String code;


    @ApiModelProperty("图片")
    private String image;


    @ApiModelProperty("描述信息")
    private String description;


    //0 停售 1 起售
    @ApiModelProperty("售卖状态")
    private Integer status;


    @ApiModelProperty("排序")
    private Integer sort;


    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;


    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;


    @TableField(fill = FieldFill.INSERT)
    private Long createUser;


    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateUser;


    //是否删除
    private Integer isDeleted;

}
