package com.example.demo.mapper;

import com.example.demo.entity.Person;

import java.util.List;

public interface PersonMapper {
    // 增加
    int insert(Person person);

    // 删除
    int deleteByPrimaryKey(Integer id);

    // 修改
    int updateByPrimaryKey(Person person);

    // 查询
    Person selectByPrimaryKey(Integer id);

    // 方法名就是 xml中的id
    List<Person> selectAllPerson();

}
