package dk.via.viewmodel;

import dk.via.model.Vinyl;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.StringProperty;

public class ManageVinylViewModel {

    private StringProperty message;
    private SimpleListProperty<Vinyl>vinyls;
    private SimpleObjectProperty<Vinyl>vinyl;

    public ManageVinylViewModel(Vinyl vinyl){

    }
    public void reserveVinyl(Vinyl vinyl){

    }
    public void borrowVinyl(Vinyl vinyl){

    }
}
