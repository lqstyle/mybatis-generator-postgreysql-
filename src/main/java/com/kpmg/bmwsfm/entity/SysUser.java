package com.kpmg.bmwsfm.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Table: sys_user
 */
@Data
@TableName("sys_user")
public class SysUser implements Serializable {
    /**
     * Table:     sys_user
     * Column:    id
     * Nullable:  false
     */
    private Integer id;

    /**
     * Table:     sys_user
     * Column:    username
     * Nullable:  true
     */
    private String username;

    /**
     * Table:     sys_user
     * Column:    password
     * Nullable:  true
     */
    private String password;

    private static final long serialVersionUID = 1L;
}