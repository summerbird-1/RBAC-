package com.zjz.rbacmybatisplus.entity;


import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * (Role)表实体类
 *
 * @author makejava
 * @since 2023-11-04 12:28:04
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("role")
public class Role  {
    @TableId
    private Long roleid;

    
    private String rolename;
    
    private String description;

    private String status;
    //关联菜单id数组，不是表中的字段  用来接收参数使用
    @TableField(exist = false)
    private Long[] menuIds;


}
