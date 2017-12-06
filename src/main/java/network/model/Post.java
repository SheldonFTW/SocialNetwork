package network.model;

public class Post {

    private String title;
    private String description;
    private int countOfFollovers;
    private String dateOfPublication;

    public Post(String title, String description, int countOfFollovers, String dateOfPublication) {
        this.title = title;
        this.description = description;
        this.countOfFollovers = countOfFollovers;
        this.dateOfPublication = dateOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", countOfFollovers=" + countOfFollovers +
                ", dateOfPublication='" + dateOfPublication + '\'' +
                '}';
    }
}
