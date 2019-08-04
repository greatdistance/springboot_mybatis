package cn.com.bonc.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author greatDistance
 * @version 1.0
 * @ClassName BaseWebApplication
 * @description TODO
 * @date 2019/8/4 11:14
 */
@SpringBootApplication(scanBasePackages = "cn.com.bonc")
@MapperScan("cn.com.bonc.dao.mapper")
public class BaseWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseWebApplication.class, args);
    }
}
