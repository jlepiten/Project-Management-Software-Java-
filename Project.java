import java.util.ArrayList;

public class Project {

    private String name;
    private String description;
    private int hours;
    private boolean reserved;

    public Project (String name, String description, int hours) {
        this.name = name;
        this.description = description;
        this.hours = hours;
        reserved = false;
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getDescription() { return description; }
    public int getHours() {
        return hours;
    }
    public boolean isReserved() {
        return reserved;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

}
