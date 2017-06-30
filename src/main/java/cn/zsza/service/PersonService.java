package cn.zsza.service;

import cn.zsza.entity.Person;
import cn.zsza.repository.PersonRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * Created by zs on 2017/3/6.
 * 15:17
 */
@Service
@Log4j2
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Person getPersonByName(String name){

        log.info("name is {}",name);
        log.warn("warn message");

        return personRepository.findByName(name);
    }
}
