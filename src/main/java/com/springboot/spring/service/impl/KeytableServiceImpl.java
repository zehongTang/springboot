package com.springboot.spring.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.spring.entity.Keytable;
import com.springboot.spring.mapper.KeytableDao;
import com.springboot.spring.service.KeytableService;
import org.springframework.stereotype.Service;

@Service
public class KeytableServiceImpl extends ServiceImpl<KeytableDao, Keytable> implements KeytableService {
}
