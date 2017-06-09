package cn.zsza.service;

import cn.zsza.BaseTest;
import cn.zsza.entity.Person;
import cn.zsza.repository.PersonRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * Created by zs on 2017/6/7.
 * 15:01
 */
public class PersonServiceTest extends BaseTest {
    @Autowired
    private PersonRepository personRepository;

    @Test
    public void findAll() throws Exception {
        List<Person> all = personRepository.findAll();
        System.out.println(all.size());
    }

}