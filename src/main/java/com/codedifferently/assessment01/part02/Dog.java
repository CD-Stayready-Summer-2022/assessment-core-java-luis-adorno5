package com.codedifferently.assessment01.part02;

public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {
        super(name, age);
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        super("Dog name", age);
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        super(name);
    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        super("Dog name", 0);
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
