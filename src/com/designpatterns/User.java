package com.designpatterns;

public class User {

    // Fields (attributes)
    public String name;

    // Constructor
    public User(String name){
        this.name = name;
    }

    // Methods
    public void sayHello(){
        System.out.println("Hi, " + name);
    }

}
