package com.kpmg.bmwsfm.dao;

import com.kpmg.bmwsfm.entity.SysUser;

public interface SysUserMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * sys_user
   *
   * @mbg.generated
   */
  int deleteByPrimaryKey(Integer id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * sys_user
   *
   * @mbg.generated
   */
  int insert(SysUser record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * sys_user
   *
   * @mbg.generated
   */
  int insertSelective(SysUser record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * sys_user
   *
   * @mbg.generated
   */
  SysUser selectByPrimaryKey(Integer id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * sys_user
   *
   * @mbg.generated
   */
  int updateByPrimaryKeySelective(SysUser record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * sys_user
   *
   * @mbg.generated
   */
  int updateByPrimaryKey(SysUser record);
}