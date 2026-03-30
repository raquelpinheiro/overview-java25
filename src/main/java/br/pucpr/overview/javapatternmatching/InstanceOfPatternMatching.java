package br.pucpr.overview.javapatternmatching;

import br.pucpr.overview.javarecords.PetRecord;

public class InstanceOfPatternMatching {

    public static void verifyInstance(Object o){

        if (o instanceof PetRecord){
            System.out.println("Instance is the PetRecord");
        } else if (o instanceof String) {
            System.out.println("Instance is the String");
        }else{
            System.out.println("Instance doesn't map");
        }
    }
}
