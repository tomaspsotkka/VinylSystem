package dk.via.model;

public class Reserved implements LendingState{

    Person statePerson;
    Person requestPerson;
    public Reserved(Person statePerson, Person requestPerson){
        this.statePerson = statePerson;
        this.requestPerson = requestPerson;
    }
    @Override
    public void reserveVinyl(Vinyl vinyl, Person statePerson, Person requestPerson) {
        vinyl.setState(this);
    }

    @Override
    public void borrowVinyl(Vinyl vinyl, Person statePerson, Person requestPerson) {
        if (statePerson.equals(requestPerson)){
            vinyl.setState(new Borrowed());
        }
    }

    @Override
    public void returnVinyl(Vinyl vinyl, Person statePerson, Person requestPerson) {
        vinyl.setState(new Available());
        throw new RuntimeException("Reservation cancelled!");
    }
}
