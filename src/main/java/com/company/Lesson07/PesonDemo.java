package com.company.Lesson07;

public class PesonDemo {
    private String name;

    public static void main(String[] args) {
        Person person = new Person("Kate");
        Profile person1 = new Person("Ivan");
        Person.about();


        // if (person instanceof Person){
        //     (Person)person;}
        Profile programmer = new Programmer("Victoria");
        programmer.info();
        Profile boxer = new Boxer("Ivan");
        boxer.info();

        Profile[] persons = new Profile[5];
        persons[0] = new Person("kolya");
        persons[1] = new Boxer("Vitaly");
        persons[2] = new Programmer("Ivan");
        persons[3] = new Person("Victoria");
        persons[4] = new Boxer("Tom");
        for (int i= 0; i< persons.length; i++){
            System.out.println("++++");
            persons[i].info();
                if (persons[i] instanceof Boxer){
                    ((Boxer) persons[i]).boxing();}
        }

    }
}
