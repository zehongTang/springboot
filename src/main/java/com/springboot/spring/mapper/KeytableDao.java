package com.springboot.spring.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.spring.entity.Keytable;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface KeytableDao extends BaseMapper<Keytable> {
}
