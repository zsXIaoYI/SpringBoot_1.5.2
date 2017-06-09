package cn.zsza.service;


import cn.zsza.entity.Person;
import cn.zsza.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zs on 2017/3/6.
 * 15:17
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Person getPersonByName(String name){

        System.out.println(1111);
        return personRepository.findByName(name);
    }
}
