package br.pucpr.overview.modernjava;

import br.pucpr.overview.javalambdaexpressions.Person;
import br.pucpr.overview.javalambdaexpressions.PersonRepo;
import br.pucpr.overview.javapatternmatching.InstanceOfPatternMatching;
import br.pucpr.overview.javapatternmatching.StringsPatternMatching;
import br.pucpr.overview.javarecords.LookRecords;
import br.pucpr.overview.javarecords.PetRecord;

public class Main {
    public static void main(String[] args) {

        //LookRecords.analize();

        /*
        StringsPatternMatching patternMatching = new StringsPatternMatching();
        patternMatching.analize();

        InstanceOfPatternMatching.verifyInstance("String object");
         */

        PersonRepo personRepo = new PersonRepo();
        personRepo.getPersonsElegibleToNotice(x -> x.getGender().equals(Person.Sex.FEMALE) &&
                x.getAge() >= 18);

        personRepo.getPersonsElegibleToNotificeWithFunction(x -> x.getGender().equals(Person.Sex.FEMALE) &&
                        x.getAge() >= 18,
                x -> x.getName(), p -> System.out.println(p));

    }
}