package createbooksarray;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String title;
    private Author[] authors;
    private int publishedYear;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishedYear == book.publishedYear && Objects.equals(title, book.title) && Arrays.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, publishedYear);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }

    public Book(String title, Author[] authors, int publishedYear) {
        this.title = title;
        this.authors = authors;
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        StringBuilder authorNames = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            if (i > 0) {
                authorNames.append(", ");
            }
            authorNames.append(authors[i].toString());
        }

        return "Title: " + title + ", Authors: " + authorNames.toString() + ", Published Year: " + publishedYear;
    }


}
