package eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * EnableDiscoveryClient注解实现服务发现
 *
 * @author FengHaixin
 * @description 一句话描述该文件的用途
 * @date 2017-07-07
 */
@SpringBootApplication
@EnableEurekaClient
@Configuration
@ComponentScan
public class EurekaClientApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
