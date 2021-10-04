package com.gory.searchcenter.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gory.searchcenter.model.common.Result;
import com.gory.searchcenter.model.repo.UserEntity;
import com.gory.searchcenter.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author GoryLee
 * @since 2021-09-26
 */
@RestController
@RequestMapping("/search/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value ="/findAllUser")
    public Result<List<UserEntity>> findAllUser() {
        List<UserEntity> allUser = userService.findAllUser();
        Result<List<UserEntity>> success = Result.createSuccess(allUser);
        return success;
    }

    @RequestMapping(value ="/findUserWithPage")
    public Result<IPage<UserEntity>> findUserWithPage() {
        IPage<UserEntity> allUsers = userService.findUserWithPage();
        Result<IPage<UserEntity>> success = Result.createSuccess(allUsers);
        return success;
    }

    @RequestMapping(value ="/addUser")
    public Result addUser() {
        userService.addUser();
        return Result.createSuccess();
    }

}

