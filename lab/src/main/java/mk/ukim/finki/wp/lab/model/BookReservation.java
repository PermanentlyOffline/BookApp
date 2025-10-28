package mk.ukim.finki.wp.lab.model;

import lombok.Data;

@Data
public class BookReservation {

        private String bookTitle;
        private String readerName;
        private String readerAddress;
        private Long numberOfCopies;

    public BookReservation() {}

    public BookReservation(String bookTitle, String readerName, String readerAddress, Long numberOfCopies) {
        this.bookTitle = bookTitle;
        this.readerName = readerName;
        this.readerAddress = readerAddress;
        this.numberOfCopies = numberOfCopies;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getReaderName() {
        return readerName;
    }

    public String getReaderAddress() {
        return readerAddress;
    }

    public Long getNumberOfCopies() {
        return numberOfCopies;
    }
}
