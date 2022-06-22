package com.codedifferently.assessment01.part02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class PetOwner {

    private String name;
    private Pet[] pets;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        resizePetArray(pet);

    }

    private void resizePetArray(Pet pet){
        pet.setOwner(this);
        if(pets == null)
            pets = new Pet[]{pet};
        else {
            Pet[] newArray = new Pet[pets.length + 1];
            System.arraycopy(pets, 0, newArray, 0, pets.length);
            pets[pets.length - 1] = pet;
            pets = newArray;
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
            Pet[] newArray = new Pet[pets.length - 1];
            for (int i = 0; i < pets.length; i++) {
                if (pet.equals(pets[i])) {
                    pets[i].setOwner(null);
                    pets[i] = null;
                }
            }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for(Pet p : pets){
            if(p.equals(pet))
                return true;
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int min = pets[0].getAge();
        for(Pet p : pets){
            if(p.getAge() < min){
                min = p.getAge();
            }
        }
        return min;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int max = pets[0].getAge();
        for(Pet p : pets){
            if(p.getAge() > max){
                max = p.getAge();
            }
        }
        return max;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float sum = 0;
        for(Pet pet : pets){
            sum += pet.getAge();
        }
        return sum / pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }

}
