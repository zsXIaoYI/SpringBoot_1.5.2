package cn.zsza.repository;


import cn.zsza.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Created by zs on 2017/2/28.
 * 16:57
 */
@Transactional
public interface PersonRepository extends JpaRepository<Person,Long> {

    public List<Person> findAll();

    public Person findByName(String name);

    Page<Person> findAll(Pageable pageable);


    Person findByNameAndAddressAndAge(String name, String address, int age);

    @Query("select p.name from Person p where p.age in ?1")
    List<String> findNameByAges(List<Integer> ages);


    @Query("select count(id) from Person  where name = ?1 and age = ?2")
    Integer getCountByNameAndAge(String name,Integer age);


}
