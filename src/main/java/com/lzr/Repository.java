package com.lzr;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author lzr
 * @Version 1.0.0
 * @Date 2017/2/18
 * @Description
 */
//其中第二个参数为Id的类型
public interface Repository extends JpaRepository<Girl,Integer>{
    //通过年龄查询
    public List<Girl> findByAge(Integer age);
}
