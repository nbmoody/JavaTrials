package TryThings;// Created by natha on 10/4/2017.

// Author: Nathaniel Ben. Moody
// Initial Date: 10/4/2017
// Filename: TryReflection.java
// Project: JavaTrials
// Notes: I worked through this trial using https://www.geeksforgeeks.org/reflection-in-java/
// see also: https://docs.oracle.com/javase/tutorial/reflect/index.html


// Imports:
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class TryReflection {
    public static void main(String[] args) throws Exception {

        // Instantiate a simple object to run trials with:
        SimpleClass obj = new SimpleClass("Ben", 31);

        // Use reflection to obtain the object's class name and constructor methods:
        Class cls = obj.getClass();
        Constructor constructor = cls.getConstructor();
        System.out.println("Object class: " + cls.getName());
        System.out.println("Object constructor: " + constructor.getName());

        // Use reflection to obtain a list of the object's methods:
        Method[] methods = cls.getMethods();
        System.out.println("Object methods:");
        for(Method method:methods){
            System.out.println(method.getName());
        }

        // Instantiate an object of the desired METHOD. This essentially strips the method out of the object and
        // allows you to use it without the object? Except... you have to instantiate the object before you can
        // create this independent method-object. So what's the point??
        System.out.println("obj.age: " + obj.age); // Before creating an object out of the method, this.age = 31...
        Method methodcall = cls.getDeclaredMethod("getOlder", int.class);
        methodcall.invoke(obj, 4);
        System.out.println("obj.age: " + obj.age); // Now this.age = 35.

        // You can do the same thing with a field, even a private field:
        System.out.println("obj.name: " + obj.getName());
        Field field = cls.getDeclaredField("name");
        field.setAccessible(true); // This overrides the access modifier of the named field at runtime.
        field.set(obj, "NewName");
        System.out.println("obj.name: " +obj.getName());




    }





}//end of head class
