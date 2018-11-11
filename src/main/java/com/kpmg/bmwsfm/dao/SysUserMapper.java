package com.kpmg.bmwsfm.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.kpmg.bmwsfm.entity.SysUser;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Select;


public interface SysUserMapper extends BaseMapper<SysUser> {

  @Select("selectMapByMap")
  List<Map<String, Object>> selectMapByMap(Map<String, Object> map);
}