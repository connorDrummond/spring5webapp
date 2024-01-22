package guru.springframework.spring5webapp;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;
@Entity
class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToMany
    @JoinTable(name = "author_book", join_columns= @JoinColumn(name = "book_Id"), inverseJoinColumns = @JoinColumn(name = "author_Id"))
    private String title;
    private String isbn;
    private Set<Author> authors;
    private long Id;

    public Book(){
         
    }
    public Book(String title2, String isbn2, Set<Author> authors1){
        title = title2;
        isbn = isbn2;
        authors = authors1;
    }
    public void setTitle(String title1){
        title = title1;

    }
    public void setisbn(String isbn1){
        isbn = isbn1;
    }
    public String getisbn(){
        return isbn;
    }
    public String getTitle(){
        return title;
    }
    public long getID(){
        return Id;
    }
    public void setID(long id1){
        Id = id1;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (Id ^ (Id >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (Id != other.Id)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Book [title=" + title + ", isbn=" + isbn + ", authors=" + authors + ", Id=" + Id + "]";
    }
    
    }
