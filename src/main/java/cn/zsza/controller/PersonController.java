package cn.zsza.controller;


import cn.zsza.entity.Person;
import cn.zsza.repository.PersonRepository;
import cn.zsza.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


/**
 * Created by zs on 2017/2/28.
 * 16:59
 */
@Api(value = "/person",description = "test person")
@RequestMapping(value = "/person")
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonRepository personRepository;

    @ApiOperation(value = "查询所有person")
    @RequestMapping( value = "/get",method = {RequestMethod.GET, RequestMethod.POST})
    public List<Person> getPersons(){
        List<Person> allPerson = personService.findAll();


        System.out.println(allPerson.size());
        return allPerson;
    }
    @ApiOperation(value = "根据姓名查询一个person")
    @RequestMapping( value = "/getByName",method = {RequestMethod.GET, RequestMethod.POST})
    public Person getPersonByName(@ApiParam("姓名") @RequestParam(value = "named") String name){

        Person person = personService.getPersonByName(name);

        return person;
    }

    @ApiOperation(value = "测试")
    @RequestMapping( value = "/test",method = {RequestMethod.GET, RequestMethod.POST})
    public String test(){

        List<String> nameList = personRepository.findNameByAges(Arrays.asList(12, 18));
        System.out.println("nameList:" + nameList);

        return "success";
    }
}
