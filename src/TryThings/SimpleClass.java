package TryThings;// Created by natha on 10/4/2017.

// Author: Nathaniel Ben. Moody
// Initial Date: 10/4/2017
// Filename: SimpleClass.java
// Project: JavaTrials

import java.io.Serializable;

public class SimpleClass implements Serializable{

// Attributes:
private String name;
int age;

// Methods:
    public SimpleClass(String name, int age){
        this.name = name;
        this.age = age;
    }

    public SimpleClass(){
        this.name = "default";
        this.age = 0;
    }

    public void sayHello(){
        System.out.println("Hello! My name is " + this.name + " and I am " + this.age + " years old.");
    }

    public void getOlder(int years){
        this.age = this.age + years;
    }

    public String getName(){
        return this.name;
    }

}//end of head class
