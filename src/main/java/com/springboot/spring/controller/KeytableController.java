package com.springboot.spring.controller;

import com.springboot.spring.entity.Keytable;
import com.springboot.spring.service.KeytableService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/keytable")
public class KeytableController {
//    @Resource
//    private KeytableDao KeytableDao;
    @Resource
    private KeytableService keytableService;
    @GetMapping("/db")
    public String db(Model model){
//        List<Keytable> list=KeytableDao.selectList(null);
        List<Keytable> list=keytableService.list();
        model.addAttribute("keytableList",list);
        System.out.println(list.toString());
        return "keytable";
    }
    @GetMapping("/editKeytable")
    public String editKeytable(int id,Model model){
//        Keytable keytable=keytableDao.selectById(id);
        Keytable keytable=keytableService.getById(id);
        model.addAttribute("keytable",keytable);
        return "editKeytable";
    }

    @PostMapping("/keytableexchange")
    public String keytableexchange(Keytable keytable,Model model){
//        KeytableDao.updateById(Keytable);
        keytableService.updateById(keytable);
        return "redirect:/keytable/db";
    }


    @GetMapping("/del")
    public String del(int id,Model model){
//        keytableDao.deleteById(id);
        keytableService.removeById(id);
        return "redirect:/keytable/db";
    }

    @GetMapping("/keytableadd")
    public String keytableadd(){
        return "addKeytable";
    }
    @PostMapping("keytableaddSave")
    public String keytableaddSave(Keytable keytable){
//        keytableDao.insert(Keytable);
        keytableService.save(keytable);
        return "redirect:/keytable/db";
    }
}