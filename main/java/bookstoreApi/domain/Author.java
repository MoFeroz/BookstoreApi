package bookstoreApi.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Table(name = "TBL_AUTHOR")
public class Author implements java.io.Serializable{

    @Id
    @Column(name = "AUTHOR_NAME")
    private String author;
    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}