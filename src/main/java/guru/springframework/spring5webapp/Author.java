package guru.springframework.spring5webapp;
import javax.persistence.*;

import java.util.Set;
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
		private String firstNameAuth;
		private String lastNameAuth;
        @ManyToMany(mappedBy = "authors")
        private Set<Book> books;
		public Author(){
		
		}
		public Author(String firstNameAuth1, String lastNameAuth1, Set<Book> books1){
			firstNameAuth = firstNameAuth1;
			lastNameAuth = lastNameAuth1;
             books = books1;
		}
		public String getFirstName(){
			return firstNameAuth;
}
		public String getLastName(){
			return lastNameAuth;
		}
		public void setFirstName(String firstName){
			firstNameAuth = firstName;
		}
		public void setLastName(String lastName){
			lastNameAuth = lastName;
		}
        public Set<Book> getBooks(){
            return books;
        }
        public void setID(long id1){
            id = id1;
        }
        public long getID(){
            return id;
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((id == null) ? 0 : id.hashCode());
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
            Author other = (Author) obj;
            if (id == null) {
                if (other.id != null)
                    return false;
            } else if (!id.equals(other.id))
                return false;
            return true;
        }
        @Override
        public String toString() {
            return "Author [id=" + id + ", firstNameAuth=" + firstNameAuth + ", lastNameAuth=" + lastNameAuth
                    + ", books=" + books + "]";
        }
        
}


