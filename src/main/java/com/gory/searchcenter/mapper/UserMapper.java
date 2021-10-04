package com.gory.searchcenter.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gory.searchcenter.model.repo.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author GoryLee
 * @since 2021-09-26
 */
public interface UserMapper extends BaseMapper<UserEntity> {

    IPage<UserEntity> selectPageVo(Page<UserEntity> page);

}
