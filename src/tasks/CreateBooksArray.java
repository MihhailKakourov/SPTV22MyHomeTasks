package tasks;

import createbooksarray.Author;
import createbooksarray.Book;

public class CreateBooksArray {
    public void doCreateArray() {
        String title = "War and Peace";
        Author[] warAndPeaceAuthors = new Author[1];
        Author author1 = new Author("Lev", "Tolstoy");
        warAndPeaceAuthors[0] = author1;
        Book[] books = new Book[2];
        books[0] = new Book(title, warAndPeaceAuthors, 1869);

        String title2 = "Crime and Punishment";
        Author[] crimeAndPunishmentAuthors = new Author[1];
        Author author2 = new Author("Fyodor", "Dostoevsky");
        crimeAndPunishmentAuthors[0] = author2;
        books[1] = new Book(title2, crimeAndPunishmentAuthors, 1866);
        
    }
}