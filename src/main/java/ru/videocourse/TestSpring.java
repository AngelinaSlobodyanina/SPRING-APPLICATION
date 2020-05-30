package ru.videocourse;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context;
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person =context.getBean("person",Person.class);
        person.getInformation();
        Scanner in = new Scanner(System.in);
        String name,eyes,color,live;
        int age;
        System.out.println(person.getName());
        name=in.nextLine();
        System.out.println(person.getEyes());
        eyes=in.nextLine();
        System.out.println(person.getLive());
        live=in.nextLine();
        System.out.println(person.getColor());
        color=in.nextLine();
        System.out.println(person.getAge());
        age=in.nextInt();
        context.close();
        System.out.println("\nYour name is "+name
        +"\nYour age is "+age+"\nThe color of your eyes is "+eyes
        +"\nYou live in "+live+"\nYour favorite color is "+color
        +"\nThank you for your time)");
    }
}
