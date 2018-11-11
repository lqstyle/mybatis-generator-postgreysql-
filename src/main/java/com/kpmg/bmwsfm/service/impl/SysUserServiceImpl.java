package com.kpmg.bmwsfm.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kpmg.bmwsfm.dao.SysUserMapper;
import com.kpmg.bmwsfm.entity.SysUser;
import com.kpmg.bmwsfm.service.SysUserService;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 * @author lucasliang
 * @date 11/11/2018 1:38 下午
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements
    SysUserService {


  @Override
  public List<Map<String, Object>> selectMapByMap(Map<String, Object> map) {
    return baseMapper.selectMapByMap(map);
  }
}
