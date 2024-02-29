package dk.via.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class ModelManager implements Model{
    private ArrayList<Vinyl>vinyls;
    private final PropertyChangeSupport support;

    public ModelManager() {
        this.vinyls = new ArrayList<>();
        this.support = new PropertyChangeSupport(vinyls);
    }

    @Override
    public synchronized void reserveVinyl(Vinyl vinyl, Person statePerson, Person requestPerson) {
        try{
            vinyl.reserveVinyl();
            support.firePropertyChange("ReserveVinyl", null, vinyls);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public synchronized void borrowVinyl(Vinyl vinyl, Person statePerson, Person requestPerson) {
        try{
            vinyl.borrowVinyl();
            support.firePropertyChange("BorrowVinyl", null, vinyls);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public synchronized void returnVinyl(Vinyl vinyl, Person statePerson, Person requestPerson) {
        try{
            vinyl.reserveVinyl();
            support.firePropertyChange("ReturnVinyl", null, vinyls);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}