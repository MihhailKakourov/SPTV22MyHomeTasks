package createbooksarray;

import java.util.Objects;

public class Author {
    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    private String authorName;

    private String authorSurname;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorSurname, author.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }

    @Override
    public String toString() {
        return authorName + " " + authorSurname;
    }
}
