package dk.via.model;

public class Available implements LendingState{
    @Override
    public void reserveVinyl(Vinyl vinyl, Person statePerson, Person requestPerson) {
        vinyl.setState(new Reserved(statePerson, requestPerson));
    }

    @Override
    public void borrowVinyl(Vinyl vinyl, Person statePerson, Person requestPerson) {
        vinyl.setState(new Borrowed());
    }

    @Override
    public void returnVinyl(Vinyl vinyl, Person statePerson, Person requestPerson) {
        vinyl.setState(this);
    }
}


