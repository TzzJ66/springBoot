package spring.boot.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created Jay
 * Date 2018/5/23
 */
@SpringBootApplication
@EnableConfigurationProperties()
@MapperScan("spring.boot.demo.dao.mapper")
public class StartApp extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(StartApp.class, args);
    }

    /**
     * 改为war 部署修改启动类
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // TODO Auto-generated method stub
        return builder.sources(this.getClass());
    }
}
