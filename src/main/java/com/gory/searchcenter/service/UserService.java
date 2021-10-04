package com.gory.searchcenter.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gory.searchcenter.model.repo.UserEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author GoryLee
 * @since 2021-09-26
 */
public interface UserService extends IService<UserEntity> {

    List<UserEntity> findAllUser();


    IPage<UserEntity> findUserWithPage();

    void addUser();
}
