package dk.via.model;

public class Vinyl {
    private String title;
    private String artist;
    private int year;
    private LendingState state;
    private Person statePerson;
    private Person requestPerson;


    public Vinyl(String title, String artist, int year){
        this.title=title;
        this.artist=artist;
        this.year=year;
    }
    public void setState(LendingState state){
        this.state=state;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    public LendingState getState() {
        return state;
    }

    public void reserveVinyl() {
        state.reserveVinyl(this, statePerson, requestPerson);
    }
    public void borrowVinyl() {
        state.borrowVinyl(this, statePerson, requestPerson);
    }
    public void returnVinyl(){
        state.returnVinyl(this, statePerson, requestPerson);
    }
}

