package com.springboot.spring.controller;

import com.springboot.spring.entity.Manager;
import com.springboot.spring.entity.test2;
import com.springboot.spring.mapper.ManagerDao;
import com.springboot.spring.mapper.test2Dao;
import com.springboot.spring.service.ManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class HelloController{
//    @Resource
//    private ManagerDao managerDao;
    @Resource
    private ManagerService managerService;
    @Resource
    private test2Dao test2dao;
    @GetMapping("/db")
    public String db(Model model){
//        List<Manager> list=managerDao.selectList(null);
        List<Manager> list=managerService.list();
        model.addAttribute("managerList",list);
        System.out.println(list.toString());
        return "manager";
    }
    @GetMapping("/editManager")
    public String editManager(int id,Model model){
//        Manager manager=managerDao.selectById(id);
        Manager manager=managerService.getById(id);
        model.addAttribute("manager",manager);
        return "editManager";
    }

    @PostMapping("/exchange")
    public String exchange(Manager manager,Model model){
//        managerDao.updateById(manager);
        managerService.updateById(manager);
        return "redirect:/db";
    }

    @GetMapping("/dbb")
    public String dbb(Model model){
        List<test2> list=test2dao.selectList(null);
        model.addAttribute("test2List",list);
        System.out.println(list.toString());
        return "test2";
    }

    @GetMapping("/del")
    public String del(int id,Model model){
//        managerDao.deleteById(id);
        managerService.removeById(id);
        return "redirect:/db";
    }

    @GetMapping("/add")
    public String add(){
        return "addManager";
    }
    @PostMapping("addSave")
    public String addSave(Manager manager){
//        managerDao.insert(manager);
        managerService.save(manager);
        return "redirect:/db";
    }



    @GetMapping("/index")
    public String hello(){
        return "index";
    }

    @GetMapping("/Login_1")
    public String Login(){
        return "Login_1";
    }
//重定向
    @GetMapping("/")
    public String redirect(){
        return "redirect:/index";
    }
    @PostMapping("/yy")
    public String dealLogin(String username,String uerpassword){
        System.out.println(username);
        System.out.println(uerpassword);
        return "index";
    }
}