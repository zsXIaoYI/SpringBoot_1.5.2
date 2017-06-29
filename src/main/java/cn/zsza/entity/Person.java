package cn.zsza.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;
/**
 * Created by zs on 2017/2/28.
 * 16:56
 */
@Entity
@Data
@Table(name = "person")
public class Person {
    public Person(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "age")
    private int age;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "create_date",insertable = false)
    private Date createDate;


}
