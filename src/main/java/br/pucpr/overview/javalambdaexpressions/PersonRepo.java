package br.pucpr.overview.javalambdaexpressions;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonRepo {

    List<Person> persons;

    public PersonRepo() {
        persons = new ArrayList<>();
        setRepo();
    }

    public void setRepo() {
        persons.add(new Person("Raquel",
                LocalDateTime.of(1987, 6, 8, 0, 0), Person.Sex.FEMALE));
        persons.add(new Person("Rafael",
                LocalDateTime.of(1985, 12, 21, 0, 0), Person.Sex.FEMALE));
        persons.add(new Person("Isabela",
                LocalDateTime.of(2011, 8, 26, 0, 0), Person.Sex.FEMALE));
        persons.add(new Person("Izabel",
                LocalDateTime.of(2015, 11, 13, 0, 0), Person.Sex.FEMALE));
        persons.add(new Person("Felipe",
                LocalDateTime.of(2020, 11, 4, 0, 0), Person.Sex.MALE));
        persons.add(new Person("Leticia",
                LocalDateTime.of(2022, 4, 29, 0, 0), Person.Sex.FEMALE));
    }

    public void getPersonsElegibleToNotice(Predicate<Person> check) {
        for (Person p : persons) {
            if (check.test(p)) {
                System.out.println("Person check - Name: " + p.getName() + " | Age: " + p.getAge());
            }
        }
    }

    public void getPersonsElegibleToNotificeWithFunction(Predicate<Person> check,
                                                         Function<Person, String> mapper,
                                                         Consumer<String> block){
        for (Person p : persons) {
            if (check.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }

    public void printData(Person p){
        System.out.println("Person -> Name: " + p.getName() + " | Age: " + p.getAge());
    }

}
