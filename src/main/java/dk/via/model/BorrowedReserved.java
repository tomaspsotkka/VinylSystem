package dk.via.model;

public class BorrowedReserved implements LendingState{

    Person statePerson;
    Person requestPerson;
    public BorrowedReserved(Person statePerson, Person requestPerson){
        this.statePerson=statePerson;
        this.requestPerson=requestPerson;
    }
    @Override
    public void reserveVinyl(Vinyl vinyl, Person statePerson, Person requestPerson) {
        vinyl.setState(this);
    }

    @Override
    public void borrowVinyl(Vinyl vinyl, Person statePerson, Person requestPerson) {
        vinyl.setState(this);
    }

    @Override
    public void returnVinyl(Vinyl vinyl, Person statePerson, Person requestPerson) {
        vinyl.setState(new Reserved(statePerson, requestPerson));
    }
}
