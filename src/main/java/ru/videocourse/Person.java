package ru.videocourse;

public class Person {

    private String name;
    private String age;
    private String eyes;
    private String live;
    private String color;

    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return name;
    }
    public void setAge(String  age){
        this.age =age;
    }
    public String getAge(){
        return age;
    }
    public void setEyes(String eyes){
        this.eyes =eyes;
    }
    public String getEyes(){
        return eyes;
    }
    public void setLive(String live){
        this.live =live;
    }
    public String getLive(){
        return live;
    }
    public void setColor(String color){
        this.color =color;
    }
    public String getColor(){
        return color;
    }
    private Information person;
    public Person(Information person){
        this.person=person;
    }
    public Person(){}
    public void setInformation(Information person){
        this.person=person;
    }
    public void getInformation(){
        System.out.println("Hello "+person.getInfo());
    }


}
