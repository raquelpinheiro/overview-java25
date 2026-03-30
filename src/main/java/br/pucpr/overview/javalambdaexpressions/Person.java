package br.pucpr.overview.javalambdaexpressions;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalUnit;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDateTime birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDateTime birthday, Sex gender) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        int yearDiff = 0;
        if (this.getBirthday().getMonthValue() >= LocalDateTime.now().getMonthValue() &&
                this.getBirthday().getDayOfMonth() >= LocalDateTime.now().getDayOfMonth()) {
            yearDiff = LocalDateTime.now().getYear() - this.getBirthday().getYear();
        } else {
            yearDiff = (LocalDateTime.now().getYear() - this.getBirthday().getYear()) - 1;
        }
        return yearDiff;
    }
}
