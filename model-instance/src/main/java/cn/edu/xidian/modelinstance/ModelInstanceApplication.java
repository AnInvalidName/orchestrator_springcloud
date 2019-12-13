package cn.edu.xidian.modelinstance;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.edu.xidian.modelinstance.mapper")
public class ModelInstanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModelInstanceApplication.class, args);
    }

}
