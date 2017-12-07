package network.model;

import javax.naming.Name;

public class Group {

    private String name;
    private String description;
    private int countOfFollovers;
    private String dateOfFoudation;

    public Group(String name, String description, int countOfFollovers, String dateOfFoudation) {
        this.name = name;
        this.description = description;
        this.countOfFollovers = countOfFollovers;
        this.dateOfFoudation = dateOfFoudation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCountOfFollovers() {
        return countOfFollovers;
    }

    public void setCountOfFollovers(int countOfFollovers) {
        this.countOfFollovers = countOfFollovers;
    }

    public String getDateOfFoudation() {
        return dateOfFoudation;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", countOfFollovers=" + countOfFollovers +
                ", dateOfFoudation='" + dateOfFoudation + '\'' +
                '}';
    }

    public void setDateOfFoudation(String dateOfFoudation) {
        this.dateOfFoudation = dateOfFoudation;


    }
}
