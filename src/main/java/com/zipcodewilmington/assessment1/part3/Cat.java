package com.zipcodewilmington.assessment1.part3;

import java.security.PublicKey;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    public String name = "Cat name";
    public Integer age = 0;

    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        ///////////    BIEN (no tocar)
        super(name,age);
        this.name = name;
        this.age = age;
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        super(age);
//        System.out.println( "From Cat: age: " + age );
//        String name = "Cat name";
        this.age = age;
        this.name = "asasasa";

    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        super(name);
        this.name = super.name;
        this.age = 0;
//
//        name = super.name;
        System.out.println( "From Cat name: " + name );
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        String name = "Cat Name";
        Integer age = 0;
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }
}
