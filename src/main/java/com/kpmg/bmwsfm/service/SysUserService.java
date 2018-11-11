package com.kpmg.bmwsfm.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.kpmg.bmwsfm.entity.SysUser;
import java.util.List;
import java.util.Map;

/**
 * @author lucasliang
 * @date 11/11/2018 1:38 下午
 */
public interface SysUserService extends IService<SysUser> {

  List<Map<String, Object>> selectMapByMap(Map<String, Object> map);
}
