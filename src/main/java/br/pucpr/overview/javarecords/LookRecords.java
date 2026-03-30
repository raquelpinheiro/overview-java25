package br.pucpr.overview.javarecords;

public class LookRecords {

    public static void analize(){
        PetRecord petCat = new PetRecord("Mingau", "Cat", 8);
        PetRecord petDog = new PetRecord("Madruga", "Dog", 5);
        PetRecord petSameCat = petCat;

        System.out.println(petCat);
        System.out.println(petSameCat);
        System.out.println("Same Records: petCat | petSameCat -> " + (petCat.equals(petSameCat) ? "Yes" : "No"));

        System.out.println(petDog);
        System.out.println(petDog.name());

        PetRecord petFewData = new PetRecord("Lupi");
        System.out.println(petFewData);
    }
}
