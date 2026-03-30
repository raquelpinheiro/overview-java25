package br.pucpr.overview.javarecords;

public record PetRecord(String name, String specie, int age) {

    public PetRecord(String name){
        this(name, "", 0);
    }
}
