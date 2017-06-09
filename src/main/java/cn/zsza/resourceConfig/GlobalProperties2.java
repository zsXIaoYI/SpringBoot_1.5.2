package cn.zsza.resourceConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zs on 2017/6/6.
 * 18:02
 */
@Component
@ConfigurationProperties
public class GlobalProperties2 {

    private String address;

    private int threadPool;

    public int getThreadPool() {
        return threadPool;
    }

    public void setThreadPool(int threadPool) {
        this.threadPool = threadPool;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
