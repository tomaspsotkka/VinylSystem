package dk.via.model;

public class Borrowed implements LendingState{

    @Override
    public void reserveVinyl(Vinyl vinyl, Person statePerson, Person requestPerson) {
        vinyl.setState(new BorrowedReserved(statePerson, requestPerson));
    }

    @Override
    public void borrowVinyl(Vinyl vinyl, Person statePerson, Person requestPerson) {
        vinyl.setState(this);
        throw new RuntimeException("You can not borrow already borrowed vinyl!");
    }

    @Override
    public void returnVinyl(Vinyl vinyl, Person statePerson, Person requestPerson) {
        vinyl.setState(new Available());
    }
}
