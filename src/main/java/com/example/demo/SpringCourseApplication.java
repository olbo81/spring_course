package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

@SpringBootApplication
public class SpringCourseApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}


//--------------------------------
/*    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext3.xml");
    Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
                System.out.println(person.getSurname());
                System.out.println(person.getAge());*/

//------------------------

/* Cat myCat = context.getBean("cat", Cat.class);
        myCat.say();*/

//----------------------------
    /*ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext2.xml");
    Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();*/

       /* Dog myDog2 = context.getBean("myPet", Dog.class);
        myDog.say();*/

//--------------------------------
   /* Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka");
                Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka");
        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());*/

//---------------------------------

       /* //Pet pet = context.getBean("myPet", Pet.class);
        //Pet pet = new Cat();
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();*/
//--------------------------------
        /* ТЕСТ 2 //создание спринг-контейнера
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class); //пишем сюда интерфейс и говорим что это класс, чтобы
                                                            //потом не писать отдельно дог\кэт. Они имлементят Пэт
        pet.say();
        context.close();*/

