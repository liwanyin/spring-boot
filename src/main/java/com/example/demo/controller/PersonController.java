package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    // add
    @RequestMapping(value = "/add")
    public String addStudents(){
        Person student = new Person();
        student.setName("Tom");
        student.setAge(12);
        int rs = personService.insertPerson(student);
        return "插入结果："+rs;
    }

    // select
    @RequestMapping(value = "/findAll")
    public String findAllStudents(){
        System.out.println("1111111111");
        List<Person> students = personService.selectAllPerson();
        System.out.println(students);
        students.forEach(System.out::println);
        return students.toString()+ "";
    }

    @RequestMapping(value = "findById")
    public String find(Integer id){
        Person person = personService.selectPersonById(id);
        return person.toString();
    }

}
