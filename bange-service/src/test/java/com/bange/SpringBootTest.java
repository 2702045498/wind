//package com.bange;
//
//
//import com.bange.entity.Person;
//import org.junit.jupiter.api.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//
//@org.springframework.boot.test.context.SpringBootTest
//public class SpringBootTest {
//
//    @Autowired
//    Person person;
//
//    @Autowired
//    ApplicationContext applicationContext;
//
//    @Test
//    public void testImportSource() {
//        Logger logger = LoggerFactory.getLogger(SpringBootTest.class);
//        String[] definitionNames = applicationContext.getBeanDefinitionNames();
//        for (String name : definitionNames) {
//            if (name.contains("personService")) {
//                logger.info("=log=>"+name);
//            }
//
//        }
//    }
//
//    @Test
//    public void test() {
//        System.out.println("==》test:" + person.toString());
//    }
//}
