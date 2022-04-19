package com.springboot.spring.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.spring.entity.Manager;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManagerDao extends BaseMapper<Manager> {


}
