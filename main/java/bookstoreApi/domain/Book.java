package bookstoreApi.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "TBL_BOOK")
public class Book implements java.io.Serializable{

    @Id
    @Column(name = "ISBN_NUM")
    private String id;
    @Column(name = "BOOK_TITLE")
    private String title;
    @Column(name = "AUTHOR_NAME")
    private String author;
    @Column(name = "YR_PUBLIC")
    private Integer yearOfPublication;
    @Column(name = "BOOK_PRICE")
    private Double price;
    @Column(name = "GENRE_NAME")
    private String genre;
    @Column(name = "AVAILABLE_FOR_LOAN")
    private Integer availableForLoan;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getAvailableForLoan() {
        return availableForLoan;
    }

    public void setAvailableForLoan(Integer availableForLoan) {
        this.availableForLoan = availableForLoan;
    }
}