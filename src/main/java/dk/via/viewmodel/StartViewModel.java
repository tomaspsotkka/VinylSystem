package dk.via.viewmodel;

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
    public void add(){
        try{
            if (!name.get().isEmpty() && !name.get().equals("")){

            }
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
