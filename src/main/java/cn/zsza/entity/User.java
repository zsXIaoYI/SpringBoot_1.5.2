package cn.zsza.entity;

/**
 * Created by zs on 2017/2/4.
 * 10:56
 */
public class User {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("is running");
        System.out.println(111);

    }
}
