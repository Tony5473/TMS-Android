package by.teachmeskills.lesson3;

public class Animal {

    String type;

    String name;

    String age;

    Animal (String type, String name, String age){

        this.type = type;
        this.name = name;
        this.age = age;

    }

    public String getTypeAndNameAndAge() {

        return type + " " + name + " " + age;

    }



}

