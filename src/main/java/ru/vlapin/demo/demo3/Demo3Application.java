package ru.vlapin.demo.demo3;

import java.util.Arrays;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.vlapin.demo.demo3.dao.CatDao;
import ru.vlapin.demo.demo3.model.Cat;

@SpringBootApplication
public class Demo3Application {

  public static void main(String[] args) {
    SpringApplication.run(Demo3Application.class, args);
  }

  @Bean
  ApplicationRunner runner(CatDao catDao) {
    return __ -> Arrays.stream("Мурзик, Барсик, Матроскин".split(", "))
        .map(Cat::new)
        .forEach(catDao::save);
  }
}
