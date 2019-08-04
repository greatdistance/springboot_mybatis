package cn.com.bonc.service.impl;

import cn.com.bonc.dao.mapper.UserMapper;
import cn.com.bonc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author greatDistance
 * @version 1.0
 * @ClassName DemoServiceImpl
 * @description TODO
 * @date 2019/8/4 11:38
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public String test() {
        return userMapper.selectByPrimaryKey(1).toString();
    }
}
