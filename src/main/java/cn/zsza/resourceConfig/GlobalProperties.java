package cn.zsza.resourceConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 基于Value注解的方式
 * Created by zs on 2017/6/6.
 * 18:02
 */
@Component
@PropertySource("classpath:global.properties")
public class GlobalProperties {

    @Value("${address}")
    private String address;

    @Value("${email}")
    private String email;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
