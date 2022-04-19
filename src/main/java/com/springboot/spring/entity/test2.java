package com.springboot.spring.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("test2")
public class test2 {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private Integer password;
    private String  sex;
    private Integer age;

    public test2(Integer id, Integer password, String sex, Integer age) {
        this.id = id;
        this.password = password;
        this.sex = sex;
        this.age = age;
    }

    public test2() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "test2{" +
                "id=" + id +
                ", password=" + password +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
