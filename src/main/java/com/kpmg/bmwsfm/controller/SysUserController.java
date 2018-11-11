package com.kpmg.bmwsfm.controller;

import com.kpmg.bmwsfm.entity.SysUser;
import com.kpmg.bmwsfm.service.SysUserService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lucasliang
 * @date 11/11/2018 1:43 下午
 */
@Controller
@RequestMapping("/user")
public class SysUserController {

  @Autowired
  private SysUserService sysUserService;

  @RequestMapping("/test")
  public void testUser() {
    //增
    SysUser sysUser = new SysUser();
    sysUser.setId(3);
    sysUser.setUsername("lqq");
    sysUser.setPassword("123");
    sysUserService.insert(sysUser);

    //改
    Map<String, Object> map = new HashMap<>();
    map.put("username", "lqq");
    //查
    List<SysUser> userList = sysUserService.selectByMap(map);
    SysUser sysUser1 = userList.get(0);
    sysUser1.setPassword("321");
    sysUserService.updateById(sysUser1);
    //删除
    sysUserService.deleteById(sysUser.getId());
  }
}
