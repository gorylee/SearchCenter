package com.gory.searchcenter.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gory.searchcenter.config.SnowflakeWorker;
import com.gory.searchcenter.model.repo.UserEntity;
import com.gory.searchcenter.mapper.UserMapper;
import com.gory.searchcenter.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author GoryLee
 * @since 2021-09-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SnowflakeWorker snowflakeWorker;

    @Override
    public List<UserEntity> findAllUser() {
        List<UserEntity> entityList = userMapper.selectList(
                Wrappers.<UserEntity>query()
//                        .eq("id","1")
        );
        return entityList;
    }

    @Override
    public IPage<UserEntity> findUserWithPage() {
        Page<UserEntity> page = new Page<>();
        page.setSize(3);
        page.setCurrent(2);
        IPage<UserEntity> userEntityIPage = userMapper.selectPageVo(page);
        return userEntityIPage;
    }

    @Override
    public void addUser() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(snowflakeWorker.getInstance().nextId());
        userEntity.setAge(11);
        userEntity.setName("张三");
        userEntity.setEmail("shangsan@test.com");
        userMapper.insert(userEntity);
    }

}
