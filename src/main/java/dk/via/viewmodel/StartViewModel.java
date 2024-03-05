package dk.via.viewmodel;

import dk.via.model.Person;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import dk.via.model.Model;

public class StartViewModel{
    private StringProperty name;
    private StringProperty message;
    private Model model;

    public StartViewModel(Model model){
        this.model = model;
        this.name = new SimpleStringProperty("");
        this.message = new SimpleStringProperty("");
    }
    public void bindName(StringProperty name){
        name.bindBidirectional(this.name);
    }
    public void bindMessage(StringProperty message){
        message.bindBidirectional(this.message);
    }
}