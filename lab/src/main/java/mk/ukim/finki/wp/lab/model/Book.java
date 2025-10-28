package mk.ukim.finki.wp.lab.model;

import lombok.Data;

@Data
public class Book {
    private String title;
    private String genre;
    double averagerRating;

    public Book () {}

    public Book(String title, String genre, double averagerRating) {
        this.title = title;
        this.genre = genre;
        this.averagerRating = averagerRating;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getAverageRating() {
        return averagerRating;
    }
}

