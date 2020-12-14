package padmanaban.springframewok.padpetclinic.services;

import padmanaban.springframewok.padpetclinic.model.Pet;

import java.util.Set;

public interface Vet {

    Vet findById(Long id);

    Vet save(Pet pet);

    Set<Pet> findAll();
}
