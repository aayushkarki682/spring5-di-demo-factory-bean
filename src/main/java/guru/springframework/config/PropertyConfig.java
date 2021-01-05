package guru.springframework.config;

import guru.springframework.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
//@PropertySource("classpath:datasource.properties")
public class PropertyConfig {



    @Value("${guru.username}")
    String user;



    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setDburl(url);
        System.out.println(user);
        System.out.println(password);
        return fakeDataSource;
    }



}
