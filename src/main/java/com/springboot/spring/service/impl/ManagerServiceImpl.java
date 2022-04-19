package com.springboot.spring.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.spring.entity.Manager;
import com.springboot.spring.mapper.ManagerDao;
import com.springboot.spring.service.ManagerService;
import org.springframework.stereotype.Service;
@Service
public class ManagerServiceImpl extends ServiceImpl<ManagerDao, Manager> implements ManagerService {


}
