package com.example.demo.service;

import com.example.demo.entity.Person;

import java.util.List;

public interface PersonService {
    // 增加
    int insertPerson(Person person);
    // 删除
    int deletePersonById(Integer id);
    // 修改
    int updatePersonById(Person person);
    // 查询
    Person selectPersonById(Integer id);
    List<Person> selectAllPerson();
}
