package dk.via.model;

public interface LendingState {
    void reserveVinyl(Vinyl vinyl, Person statePerson, Person requestPerson);
    void borrowVinyl(Vinyl vinyl, Person statePerson, Person requestPerson);
    void returnVinyl(Vinyl vinyl, Person statePerson, Person requestPerson);

}
