package dk.via.model;

import java.beans.PropertyChangeListener;

public interface Model {
    void reserveVinyl(Vinyl vinyl, Person statePerson, Person requestPerson);
    void borrowVinyl(Vinyl vinyl, Person statePerson, Person requestPerson);
    void returnVinyl(Vinyl vinyl, Person statePerson, Person requestPerson);
    void addPropertyChangeListener(PropertyChangeListener listener);
    void removePropertyChangeListener(PropertyChangeListener listener);
}
